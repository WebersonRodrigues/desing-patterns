package model.estados;

import model.Orcamento;

public interface IEstado {
    
    void aplicarDescontoExtra(Orcamento orcamento);
    void aprovar(Orcamento orcamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);
}
