package br.com.fernando.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

public class Servico {
    private Imovel local;
    private Funcionario funcionario;
    private double valor;
    private Date dataHoraCotacao;
    private Date dataHoraExecucao;
    private List<Funcionario> equipe;
    private double avaliacao;
    private Fatura fatura;

    public Servico(Imovel local, Funcionario funcionario, double valor, Date dataHoraCotacao, Date dataHoraExecucao, List<Funcionario> equipe, double avaliacao, Fatura fatura) {
        this.local = local;
        this.funcionario = funcionario;
        this.valor = valor;
        this.dataHoraCotacao = dataHoraCotacao;
        this.dataHoraExecucao = dataHoraExecucao;
        this.equipe = equipe;
        this.avaliacao = avaliacao;
        this.fatura = fatura;
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
