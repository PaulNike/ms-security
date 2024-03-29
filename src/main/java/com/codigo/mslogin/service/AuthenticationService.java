package com.codigo.mslogin.service;

import com.codigo.mslogin.entity.Usuario;
import com.codigo.mslogin.request.SignInRequest;
import com.codigo.mslogin.request.SignUpRequest;
import com.codigo.mslogin.response.AuthenticationResponse;

public interface AuthenticationService {
    Usuario signUpUser(SignUpRequest signUpRequest);
    Usuario signUpAdmin(SignUpRequest signUpRequest);
    AuthenticationResponse signin(SignInRequest signInRequest);
    //AuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
