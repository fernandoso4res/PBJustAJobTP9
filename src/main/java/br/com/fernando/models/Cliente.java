package br.com.fernando.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Cliente extends Pessoa {
        private Imovel imovel;
        public Cliente visualizarDadosCliente(Pessoa pessoa){
            throw new NotImplementedException();
        }
        public List<Imovel> visualizarImoveis(Cliente cliente){
            throw new NotImplementedException();
        }

        public List<Imovel> visualizarImovelResidencial(){
            throw new NotImplementedException();
        }

        public void verificaDadosCliente(Pessoa pessoa){throw new NotImplementedException();}


}
