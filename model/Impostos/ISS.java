package model.Impostos;

import interfaces.Imposto;
import model.Orcamento;

public class ISS extends ImpostoComposto implements Imposto {
    
    public ISS() {
    }

    public ISS(ImpostoComposto outroImposto) {
        super(outroImposto);
    }

    public double calcular(Orcamento orcamento){
        return orcamento.getValor() * 0.07 + this.calcularOutroImposto(orcamento);
    }
}
