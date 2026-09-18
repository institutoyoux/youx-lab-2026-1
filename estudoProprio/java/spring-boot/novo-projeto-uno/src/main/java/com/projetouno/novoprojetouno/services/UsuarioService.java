package com.projetouno.novoprojetouno.services;

import com.projetouno.novoprojetouno.dto.CadastroDTO;
import com.projetouno.novoprojetouno.dto.LoginDTO;
import com.projetouno.novoprojetouno.models.UserRoles;
import com.projetouno.novoprojetouno.models.Usuario;
import com.projetouno.novoprojetouno.repositories.UsuarioRepository;
import com.projetouno.novoprojetouno.security.TokenService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    private final PasswordEncoder passwordEncoder;
    
    public Optional<Usuario> buscarPorUsername(String username) {
        return repository.findByUsername(username);
    }
    public String gerarTokenPorDto(@Valid LoginDTO dto) {
        UsernamePasswordAuthenticationToken user = new UsernamePasswordAuthenticationToken(
                dto.username(),
                dto.senha()
        );
        Authentication auth = authenticationManager.authenticate(user);
        return tokenService.gerarToken((Usuario) Objects.requireNonNull(auth.getPrincipal()));
    }

    public Usuario criarPorDTO(@Valid CadastroDTO dto) {
        if (buscarPorUsername(dto.username()).isPresent()) {
            throw new IllegalArgumentException("Este username já está em uso");
        }
        String senhaHash = passwordEncoder.encode(dto.senha());
        Usuario novoUsuario = new Usuario();
        novoUsuario.setUsername(dto.username());
        novoUsuario.setSenha(senhaHash);
        novoUsuario.setTipo(UserRoles.USER);
        return repository.save(novoUsuario);
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }
}
