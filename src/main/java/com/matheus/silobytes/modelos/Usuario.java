package com.matheus.silobytes.modelos;

public class Usuario {
    private String nome;
    private String login;
    private String senha;

    public Usuario() {

    }

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(String senhaDigitada) {
        if (this.senha != null && this.senha.equals(senhaDigitada)) {
            return true;
        } else {
            return false;
        }
    }
}
