package com.api.casaDeApostas.controllers;

import com.api.casaDeApostas.dtos.AdminDashboardDTO;
import com.api.casaDeApostas.dtos.UpdateUserBlockedDTO;
import com.api.casaDeApostas.dtos.UserDTO;
import com.api.casaDeApostas.entities.User;
import com.api.casaDeApostas.repositories.UserRepository;
import com.api.casaDeApostas.services.JogoService;
import com.api.casaDeApostas.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminRoleController {

    private final UserService service;
    private final JogoService jogoService;
    private final UserRepository userRepository;

    @PatchMapping("/users/{id}/blocked")
    public ResponseEntity<Void> updateBlocked(
            @PathVariable UUID id,
            @RequestBody UpdateUserBlockedDTO data
    ) {

        service.updateBlocked(id, data.blocked());

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/dashboard")
    public ResponseEntity<AdminDashboardDTO> getDashboard() {
        return ResponseEntity.ok(jogoService.adminDashboard());
    }

    @GetMapping("/usersList")
    public ResponseEntity<List<User>> getUsersList(
    ) {
        return ResponseEntity.ok(userRepository.findAll());
    }
}