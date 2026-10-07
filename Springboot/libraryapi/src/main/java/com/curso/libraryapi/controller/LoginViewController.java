package com.curso.libraryapi.controller;

import com.curso.libraryapi.security.CustomAuthentication;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class LoginViewController {

    @GetMapping("/")
    public String paginaLogin() {
        return "login";
    }

    @GetMapping("/")
    @ResponseBody
    public String paginaHome(Authentication authentication){
        if (authentication instanceof CustomAuthentication customAuth) {
            System.out.println(customAuth.getUsuario);
        }
        return "Olá " + authentication.getName();

    }

    @GetMapping("/authorized")
    @ResponseBody
    public String getAuthorizationCode(@RequestParam("code") String code) {
        return "Seu authorization code: " + code;
    }
}
