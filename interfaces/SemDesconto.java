package interfaces;

import model.Orcamento;

public class SemDesconto implements Desconto{

    @Override
    public double descontar(Orcamento orcamento) {
        return 0;
    }

    @Override
    public Desconto proximoDesconto(Desconto proximoDesconto) {
        return null;
    }
    
}
