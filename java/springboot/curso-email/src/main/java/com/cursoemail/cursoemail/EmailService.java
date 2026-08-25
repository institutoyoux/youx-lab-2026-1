package com.cursoemail.cursoemail;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;
    public void sendEmail(Email email) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("noreply@gmail.com");
            helper.setSubject("Deu certo");
            helper.setTo(email.to());
            String template = carregaTemplateEmail();
            template = template.replace("#{nome}", "tsts");
            helper.setText(template, true);
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String carregaTemplateEmail() throws IOException {
        ClassPathResource resource = new ClassPathResource("./templates/emailTemplate.html");

        return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    }
}
