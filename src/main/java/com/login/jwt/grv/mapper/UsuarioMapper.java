package com.login.jwt.grv.mapper;

import com.login.jwt.grv.dto.SignUpDto;
import com.login.jwt.grv.dto.UsuarioDto;
import com.login.jwt.grv.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDto toUsuariorDto(Usuario usuario);

    @Mapping(target = "contrasena", ignore = true)
    Usuario signUpToUser(SignUpDto signUpDto);

}
