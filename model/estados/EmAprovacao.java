package model.estados;

import java.util.InputMismatchException;

import model.Orcamento;

public class EmAprovacao implements IEstado {

    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        var desconto = orcamento.getValor() - (orcamento.getValor() * 0.05);
        orcamento.setValor(desconto);
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado()); 
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new InputMismatchException("Orcamento em aprovação não pode ir para finalizado.");
    }
    
}
