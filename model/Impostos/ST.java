package model.Impostos;

import interfaces.Imposto;
import model.Item;
import model.Orcamento;

public class ST implements Imposto {

    @Override
    public double calcular(Orcamento orcamento) {

        // ST = valor >= 500 && ter algum item com valor > 100 6% || 4%
        if(orcamento.getValor() >= 500 && existeAlgumItemComValorMaiorQueCemReais(orcamento)){
            return orcamento.getValor() * 0.06;
        }

        return orcamento.getValor() * 0.04;
    }

    private boolean existeAlgumItemComValorMaiorQueCemReais(Orcamento orcamento){
        
        for (Item item : orcamento.getItens()) {
            
            if(item.getValor() > 100) {
                return true;
            }
        }
        
        return false;
    }
    
}
