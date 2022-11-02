package model;

import interfaces.Desconto;
import interfaces.SemDesconto;
import model.descontos.DescontoMaiorQueQuinhentosReais;
import model.descontos.DescontoPorCincoItens;

public class CalculadoreDeDescontos {
    
    // public double calcular(Orcamento orcamento){
    //     // 1° Regra, quero poder dar desconto para mais que 5 itens.
    //     if(orcamento.getItens().size() > 5){
    //         return orcamento.getValor() * 0.1;

    //     }else if(orcamento.getValor() > 500.0){
    //         return orcamento.getValor() * 0.05;
    //     }

    //     // if(contição )
    //     return 0;

    //     // Continuar criando as regras
    // }


    // public double calcular(Orcamento orcamento){
    //     double desconto  = new DescontoPorCincoItens().descontar(orcamento);

    //     if(desconto == 0){
    //         desconto = new DescontoMaiorQueQuinhentosReais().descontar(orcamento);
    //     }

    //     // if(desconto == 0)

    //     return desconto;

    //     // d1 d2 e d3
     
    // }

    public double calcular(Orcamento orcamento){
        Desconto descontoPorCincoItens = new DescontoPorCincoItens();
        Desconto descontoPorMaisQueQuinhentosReais = new DescontoMaiorQueQuinhentosReais();
        Desconto semDesconto = new SemDesconto();

        descontoPorCincoItens.proximoDesconto(descontoPorMaisQueQuinhentosReais);
        descontoPorMaisQueQuinhentosReais.proximoDesconto(semDesconto);

        return descontoPorCincoItens.descontar(orcamento);
    }
}
