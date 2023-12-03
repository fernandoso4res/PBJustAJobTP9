package br.com.fernando.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

public class Servico {
    private Imovel local;
    private Funcionario gerente;
    private double valor;
    private Date dataHoraCotacao;
    private Date dataHoraExecucao;
    private List<Funcionario> equipe;
    private double avaliacao;

    public Servico(Imovel local, double valor, Date dataHoraCotacao, Date dataHoraExecucao, List<Funcionario> equipe, double avaliacao) {
        this.local = local;
        this.valor = valor;
        this.dataHoraCotacao = dataHoraCotacao;
        this.dataHoraExecucao = dataHoraExecucao;
        this.equipe = equipe;
        this.avaliacao = avaliacao;
    }

    public Date marcarVisitaParaCotacao(Date data, Imovel imovel, Funcionario gerente){
        throw new NotImplementedException();
    }

    public Date marcarRealizacaoDoServico(Date data){
        throw new NotImplementedException();
    }

    public List<Funcionario> adicionarMembroEquipe(Funcionario faxineiro){
        throw new NotImplementedException();
    }

    public double avaliarServico(double nota){
        throw new NotImplementedException();
    }
}
