package model;

import java.util.ArrayList;
import java.util.List;

import model.estados.EmAprovacao;
import model.estados.IEstado;

public class Orcamento {
    
    private Double valor;
    private List<Item> itens;
    private IEstado estadoAtual;

    public Orcamento(Double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    public void adicionarItem(Item item){
        this.itens.add(item);
    }

    public IEstado getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(IEstado estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void aplicarDescontoExtra(){
        this.estadoAtual.aplicarDescontoExtra(this);
    }

    public void aprovar(){
        this.estadoAtual.aprovar(this);
    }

    public void reprovar(){
        this.estadoAtual.reprovar(this);
    }

    public void finalizar(){
        this.estadoAtual.finalizar(this);
    }
}
