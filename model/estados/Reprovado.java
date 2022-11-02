package model.estados;

import java.util.InputMismatchException;

import model.Orcamento;

public class Reprovado implements IEstado {

    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        throw new InputMismatchException("Orcamentos reprovados não podem ter descontos extras");   
    }
    
    @Override
    public void aprovar(Orcamento orcamento) {
        throw new InputMismatchException("Orcamento já está reprovado, não é possível aprovar.");   
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new InputMismatchException("Orcamento já está reprovado."); 
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }

}
