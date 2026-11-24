package com.api.casaDeApostas.entities;


import com.api.casaDeApostas.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity(name = "user")
@Table(name = "user-tb")
@NoArgsConstructor
@AllArgsConstructor()
@Getter
@Setter
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @NotBlank(message = "O e-mail é obrigatório")
    @Email(message = "Formato de e-mail inválido")
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @NotNull(message = "A data de nascimento é obrigatória")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate nascDate;

    private String password;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "O perfil é obrigatório")
    private UserRole role;

    @Column(nullable = false)
    private boolean enabled = false;

    @Column(nullable = false)
    private boolean blocked = false;

    @Column(precision = 15, scale = 2)
    private BigDecimal balance;

    @Builder
    public User(String email, String password, UserRole role) {
        this.email = email;
        this.password = password;
        this.role = role;

        if (role == UserRole.USER) {
            this.balance = BigDecimal.ZERO;
        }
    }

    public User(User user) {}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN) {
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }

        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public boolean isBlocked() {
        return false;
    }


}
