package com.cursospring.desafiobet.services;

import com.cursospring.desafiobet.model.email.EmailResetPass;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendResetCode(EmailResetPass email) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setSubject("Seu código para resetar sua senha");
            helper.setTo(email.destino());

            String template = carregarTemplateReset();

            template = template.replace("${codigo}", email.code().toString());
            helper.setText(template, true);
            helper.addInline("estudante.png", new ClassPathResource("./templates/estudante.png"));
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao enviar o código!");
        }
    }
    public String carregarTemplateReset() throws IOException {
        ClassPathResource resource = new ClassPathResource("./templates/ResetEmailTemplate.html");

        return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    }
}
