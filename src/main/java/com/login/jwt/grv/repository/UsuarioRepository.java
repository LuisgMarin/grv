package com.login.jwt.grv.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.jwt.grv.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsuario(String usuario);
}
