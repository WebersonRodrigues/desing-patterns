package model;

import interfaces.Imposto;
import model.Impostos.ICMS;
import model.Impostos.ISS;

public class CalculadoraDeImpostos {
    
    // public double RealizarCaculo(Orcamento orcamento, String imposto){
    //     if("ICMS".equals(imposto)){
    //         return  orcamento.getValor() * 0.1;

    //     }else if("ISS".equals(imposto)){
    //         return  orcamento.getValor() * 0.07;
    //     }

    //     return 0;
    // }

    // public double RealizarCalculoICMS(Orcamento orcamento){
    //     // return  orcamento.getValor() * 0.1;
    //     return new ICMS().calcular(orcamento);
    // }

    // public double RealizarCalculoISS(Orcamento orcamento){
    //     // return  orcamento.getValor() * 0.07;
    //     return new ISS().calcular(orcamento);
    // }

    public double calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }

}
