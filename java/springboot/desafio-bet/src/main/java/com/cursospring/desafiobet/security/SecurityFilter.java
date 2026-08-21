package com.cursospring.desafiobet.security;

import com.cursospring.desafiobet.exceptions.ErroGenericException;
import com.cursospring.desafiobet.exceptions.InvalidBodyRequestException;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.services.UserService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SecurityFilter extends OncePerRequestFilter {
    private final TokenService tokenService;
    private final UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        var token = recoverToken(request);
        if (token != null) {
            var login  = tokenService.validateToken(token);
            Optional<User> optional = userService.buscarPorEmail(login);
            if (optional.isEmpty()) {
                throw new InvalidBodyRequestException("Usuario não encontrado!");
            }
            UserDetails user = optional.get();
            if (!user.isAccountNonLocked()) {
                throw new ErroGenericException("Usuario bloqeado!");
            }
            var authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        filterChain.doFilter(request, response);
    }

    private String recoverToken(HttpServletRequest request) {
        var authHedaer = request.getHeader("Authorization");
        if (authHedaer == null) {
            return null;
        }
        return authHedaer.replace("Bearer ", "");
    }
}
