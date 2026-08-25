package com.cursospring.desafiobet.services;

import com.cursospring.desafiobet.model.email.EmailResetPass;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendResetCode(EmailResetPass email) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("noreply@gmail.com");
            helper.setSubject("Deu certo");
            helper.setTo(email.destino());

            String template = """
                    <img src="https://imgs.search.brave.com/o5sISSkaMAMEYMHXzeShF1u76x-Ck55ao3BGLqAnz2M/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9wYXJj/ZWlyb3NlcG4uaW1n/LmNvbS5ici93cC1j/b250ZW50L3VwbG9h/ZHMvZWxlbWVudG9y/L3RodW1icy82MTM5/MmNhMTYyMjNmLXF2/N2k0anRhb2Ryem8z/bHY3ajFmaWxwcW9t/cHo5dmJnbDg3b3ow/Y3Fiby5wbmc">
                    Seu código é: ${codigo}
                    """;

            template = template.replace("${codigo}", email.code().toString());
            helper.setText(template, true);
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
