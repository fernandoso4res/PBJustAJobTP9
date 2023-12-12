package br.com.fernando.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Imovel {

    private Cliente cliente;
    private String Logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;


    public Imovel(Cliente cliente, String logradouro, String numero, String complemento, String bairro, String cidade, String estado, int cep) {
        this.cliente = cliente;
        Logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Imovel visualizarDadosImovel(Imovel imovel){
        throw new NotImplementedException();
    }

    public Cliente visualizarDadosProprietario(Imovel imovel){
        throw new NotImplementedException();
    }

    public Servico visualizarHistoricoServicos(Cliente cliente){
        throw new NotImplementedException();
    }

    public void verificaImovel(Imovel imovel){throw new NotImplementedException();}
}
