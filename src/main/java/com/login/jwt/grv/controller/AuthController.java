package com.login.jwt.grv.controller;

import com.login.jwt.grv.config.UsuarioAuthenticationProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.jwt.grv.dto.CredentialsDto;
import com.login.jwt.grv.dto.SignUpDto;
import com.login.jwt.grv.dto.UsuarioDto;
import com.login.jwt.grv.service.UsuarioService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.net.URI;

@RequiredArgsConstructor
@RestController
public class AuthController {

    private final UsuarioService usuarioService;
    private final UsuarioAuthenticationProvider usuarioAuthenticationProvider;

    @PostMapping("/login")
    public ResponseEntity<UsuarioDto> login(@RequestBody @Valid CredentialsDto credentialsDto) {
        UsuarioDto usuarioDto = usuarioService.login(credentialsDto);
        usuarioDto.setToken(usuarioAuthenticationProvider.createToken(usuarioDto));
        return ResponseEntity.ok(usuarioDto);
    }

    @PostMapping("/register")
    public ResponseEntity<UsuarioDto> register(@RequestBody @Valid SignUpDto user) {
        UsuarioDto createdUser = usuarioService.register(user);
        createdUser.setToken(usuarioAuthenticationProvider.createToken(createdUser));
        return ResponseEntity.created(URI.create("/users/" + createdUser.getId())).body(createdUser);
    }

}
