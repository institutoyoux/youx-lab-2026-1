package com.api.casaDeApostas.controllers;

import com.api.casaDeApostas.dtos.UserDashboardDTO;
import com.api.casaDeApostas.services.JogoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRoleController {

    private final JogoService jogoService;

    @GetMapping("/dashboard")
    public ResponseEntity<UserDashboardDTO> getDashboard() {
        return ResponseEntity.ok(jogoService.userDashboard());
    }
}
