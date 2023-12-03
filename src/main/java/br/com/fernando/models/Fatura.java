package br.com.fernando.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

public class Fatura {
    private double valor;
    private Date dataEmissao;
    private Date dataVencimento;
    private double valorPago;
    private String servico;

    public double atualizarvalorPago(double valor){
        throw new NotImplementedException();
    }
}
