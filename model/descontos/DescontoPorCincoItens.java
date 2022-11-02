package model.descontos;

import interfaces.Desconto;
import model.Orcamento;

public class DescontoPorCincoItens implements Desconto {
    
    private Desconto proximoDesconto;

    public double descontar(Orcamento orcamento){

        if(orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        } 
        
        return proximoDesconto.descontar(orcamento);
    }

    public Desconto proximoDesconto(Desconto proximoDesconto) {
        return this.proximoDesconto = proximoDesconto;
    }
}
