package com.login.jwt.grv.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "rol", nullable = false)
    @Size(max = 1)
    private Integer rol;

    @Column(nullable = false)
    @Size(max = 100)
    private String usuario;

    @Column(nullable = false)
    @Size(max = 100)
    private String contrasena;
    
    @Column(name = "nombre", nullable = false)
    @Size(max = 100)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    @Size(max = 100)
    private String apellido;


}
