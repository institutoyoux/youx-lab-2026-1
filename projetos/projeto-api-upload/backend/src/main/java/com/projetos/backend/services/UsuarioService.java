package com.projetos.backend.services;

import com.projetos.backend.configs.FileProperties;
import com.projetos.backend.dto.CriarUsuarioDTO;
import com.projetos.backend.dto.UsuarioDTO;
import com.projetos.backend.models.Usuario;
import com.projetos.backend.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

@Service
public class UsuarioService {
    private final Path filesDir;
    private final UsuarioRepository repository;
    public UsuarioService(FileProperties fileProperties, UsuarioRepository repository) {
        this.filesDir = Paths.get(fileProperties.getUploadDir())
                .toAbsolutePath().normalize();
        this.repository = repository;
    }

    public List<UsuarioDTO> obterTodos() {


        return repository.findAll().stream().map(usuario ->
                new UsuarioDTO(
                        usuario.getUsername(),
                        usuario.getNome(),
                        gerarUrlDownload(usuario.getFotoUrl()),
                        gerarUrlDownload(usuario.getDocUrl())
                )
                ).toList();
    }
    private String gerarUrlDownload(String url) {
        return ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/files/download/")
                .path(url)
                .toUriString();
    }
    public Usuario criarPorDto(CriarUsuarioDTO dto) {
        Usuario newUser = new Usuario();
        newUser.setNome(dto.nome());
        newUser.setUsername(dto.username());
        String foto = salvarArquivo(dto.foto());
        String comprovante = salvarArquivo(dto.comprovante());
        newUser.setFotoUrl(foto);
        newUser.setDocUrl(comprovante);
        return repository.save(newUser);
    }
    private String salvarArquivo(MultipartFile file) {
        String nome = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        try {
            Path diretorio = filesDir.resolve(nome);
            file.transferTo(diretorio);
            return nome;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
