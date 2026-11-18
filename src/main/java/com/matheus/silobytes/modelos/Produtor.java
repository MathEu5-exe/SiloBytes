package com.matheus.silobytes.modelos;

public class Produtor {
    private String cpf;
    private String nome;
    private String telefone;
    private String propriedade;

    public Produtor() {

    }

    public Produtor(String propriedade, String cpf, String nome, String telefone) {
        this.propriedade = propriedade;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPropriedade() {
        return propriedade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
    }

    @Override
    public String toString() {
        return this.nome + "(" + this.cpf + ")";
    }
}
