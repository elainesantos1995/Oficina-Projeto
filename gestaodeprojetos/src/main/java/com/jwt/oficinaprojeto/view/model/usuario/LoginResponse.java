package com.jwt.oficinaprojeto.view.model.usuario;

import com.jwt.oficinaprojeto.model.Usuario;

public class LoginResponse {

    private Usuario usuario;

    private String token;
    
    public LoginResponse() {
    }
    
    public LoginResponse(Usuario usuario, String token) {
        this.usuario = usuario;
        this.token = token;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    
    
}
