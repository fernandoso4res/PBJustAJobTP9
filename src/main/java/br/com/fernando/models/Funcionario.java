package br.com.fernando.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Funcionario extends Pessoa{

    private String perfil;
    private int matricula;
    private List<Servico> servicos;

    public Funcionario(String perfil, int matricula){
        this.perfil = perfil;
        this.matricula = matricula;
    }
    public List<Servico> insereServico(Servico servico){throw new NotImplementedException();}
}
