package com.cursospring.desafiobet.components;

import org.springframework.stereotype.Component;

@Component
public class VerifyPass {
    public static boolean isValidPass(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean letraMaiuscula = false;
        boolean temLetra = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (char caractere : password.toCharArray()) {
            if (Character.isLetter(caractere)) {
                temLetra = true;
                if (Character.isUpperCase(caractere)) {
                    letraMaiuscula = true;
                }
            } else if (Character.isDigit(caractere)) {
                temNumero = true;
            } else {
                temEspecial = true;
            }
        }
        return letraMaiuscula && temLetra && temNumero && temEspecial;
    }
}
