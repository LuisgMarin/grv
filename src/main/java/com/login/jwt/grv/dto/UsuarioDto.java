package com.login.jwt.grv.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDto {

    private Long id;
    private Integer rol;
    private String usuario;
    private String token;
    private String nombre;
    private String apellido;


}
