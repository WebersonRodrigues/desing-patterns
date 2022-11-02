package model.descontos;

import interfaces.Desconto;
import model.Orcamento;

public class DescontoMaiorQueQuinhentosReais implements Desconto {

    private Desconto proximoDesconto;

    public double descontar(Orcamento orcamento){

        if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.06;
        } 
        
        return proximoDesconto.descontar(orcamento);
    }

    public Desconto proximoDesconto(Desconto proximoDesconto) {
        return this.proximoDesconto = proximoDesconto;
    }

}
