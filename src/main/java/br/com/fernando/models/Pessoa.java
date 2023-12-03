package br.com.fernando.models;

public class Pessoa {

    private String nome;
    private int telefone;
    private String email;
    private String cpf;
    private String perfil;

    public Pessoa(){

    }

    public Pessoa(String nome, int telefone, String email, String cpf, String perfil){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.perfil = perfil;
    }
}
