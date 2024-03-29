package com.codigo.mslogin.response;

import com.codigo.mslogin.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioReponse {

    private Long id;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private Role role;
}
