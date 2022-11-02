package model.Impostos;

import interfaces.Imposto;
import model.Orcamento;

public abstract class ImpostoComposto implements Imposto{
    
    private ImpostoComposto outroImposto;

    public ImpostoComposto(ImpostoComposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public ImpostoComposto() {
        this.outroImposto = null;
    }

    public ImpostoComposto getOutroImposto() {
        return outroImposto;
    }

    public void setOutroImposto(ImpostoComposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract double calcular(Orcamento orcamento);

    protected double calcularOutroImposto(Orcamento orcamento){

        if(this.outroImposto == null) return 0;
        
        return this.outroImposto.calcular(orcamento);
    }


}
