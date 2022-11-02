package model.Impostos;

import interfaces.Imposto;
import model.Orcamento;

public class PIS implements Imposto{

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor()  * 0.05;
    }
    
}
