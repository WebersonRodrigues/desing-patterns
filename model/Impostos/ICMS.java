package model.Impostos;

import model.Orcamento;

public class ICMS extends ImpostoComposto {
    
    public ICMS() {
    }

    public ICMS(ImpostoComposto outroImposto) {
        super(outroImposto);
    }

    public double calcular(Orcamento orcamento){
        return orcamento.getValor() * 0.1 + calcularOutroImposto(orcamento);
    }
}
