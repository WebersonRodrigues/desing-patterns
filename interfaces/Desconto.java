package interfaces;

import model.Orcamento;

public interface Desconto {
    
    double descontar(Orcamento orcamento);
    Desconto proximoDesconto(Desconto proximoDesconto);
}
