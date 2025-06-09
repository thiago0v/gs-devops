package br.com.sird.dto;

import jakarta.validation.constraints.NotBlank;

public class AuthenticationDTO {

    @NotBlank
    private String login;

    @NotBlank
    private String senha;

    // Getters e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
