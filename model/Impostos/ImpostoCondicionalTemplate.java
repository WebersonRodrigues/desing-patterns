package model.Impostos;

import interfaces.Imposto;
import model.Orcamento;

public abstract class ImpostoCondicionalTemplate implements Imposto {

    @Override
    public double calcular(Orcamento orcamento) {
        
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        }

        return minimaTaxacao(orcamento);
    }
    
    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    public abstract double maximaTaxacao(Orcamento orcamento);
    public abstract double minimaTaxacao(Orcamento orcamento);
}
