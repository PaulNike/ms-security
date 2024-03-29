package com.codigo.mslogin.service;

import com.codigo.mslogin.entity.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioService {
    UserDetailsService userDetailsService();
    List<Usuario> getUsuarios();

}
