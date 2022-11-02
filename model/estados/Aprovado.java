package model.estados;

import java.util.InputMismatchException;

import model.Orcamento;

public class Aprovado implements IEstado {
    
    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        var desconto = orcamento.getValor() - (orcamento.getValor() * 0.02);
        orcamento.setValor(desconto);
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new InputMismatchException("Orcamento já está aprovado.");   
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new InputMismatchException("Orcamento já está aprovado, não é possível reprovar."); 
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
