package com.projetos.backend.services;

import com.projetos.backend.dto.CriarUsuarioDTO;
import com.projetos.backend.dto.UsuarioDTO;
import com.projetos.backend.models.Usuario;
import com.projetos.backend.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;
    private final FileService fileService;

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
        String foto = fileService.salvarArquivo(dto.username(), dto.foto());
        String comprovante = fileService.salvarArquivo(dto.username(), dto.comprovante());
        newUser.setFotoUrl(foto);
        newUser.setDocUrl(comprovante);
        return repository.save(newUser);
    }
}
