package br.com.fernando.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {
    private int diasDeTrabalho;
    private Funcionario funcionario;

    public Agenda(int diasDeTrabalho){
        this.diasDeTrabalho = diasDeTrabalho;
    }

    public ArrayList<Date> verificarDatasDisponiveis(){
        throw new NotImplementedException();
    }

    public boolean visualizarDisponibilidadeData(Date data){
        throw new NotImplementedException();
    }

    public ArrayList<Servico> visualizarCompromissos(Date data){
        throw new NotImplementedException();
    }

    public Funcionario visualizarFuncionario(Pessoa pessoa){
        throw new NotImplementedException();
    }

    public List<Funcionario> visualizarFuncionarios(List<Pessoa> pessoa){
        throw new NotImplementedException();
    }
}
