package com.api.casaDeApostas.infraSecurity;

import com.api.casaDeApostas.entities.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenServiceForgotPassword {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generatePasswordResetToken(User user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            String token = JWT.create()
                    .withIssuer("auth-api-register-confirmation")
                    .withSubject(user.getEmail())
                    .withClaim("purpose", "REGISTER_CONFIRMATION")
                    .sign(algorithm);

            return token;

        } catch (JWTCreationException exception) {
            throw new RuntimeException("Error while generation confirmation token", exception);
        }
    }

    public String validatePasswordResetToken(String token) {

        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            DecodedJWT decodedToken = JWT.require(algorithm)
                    .withIssuer("auth-api-register-confirmation")
                    .build()
                    .verify(token);

            if (!"REGISTER_CONFIRMATION".equals(
                    decodedToken.getClaim("purpose").asString())) {
                return "";
            }

            return decodedToken.getSubject();

        } catch (JWTVerificationException exception) {
            return "";
        }
    }
}
