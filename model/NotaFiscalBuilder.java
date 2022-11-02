package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import service.IService;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private Date dataEmissao;
    private List<Item> itens;
    private Double valorTotal;
    private String nomeCliente;
    private String cpfCliente;
    private String observacao;
    private List<IService> servicos;

    public NotaFiscalBuilder(){
        this.itens = new ArrayList<Item>();
        this.dataEmissao = new Date();
        this.valorTotal = 0.0;
        this.servicos = new ArrayList<IService>();
    }

    public NotaFiscalBuilder comRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(Item item){
        itens.add(item);
        return this;
    }

    public NotaFiscalBuilder comDataEmissao(Date dataEmissao){
        this.dataEmissao = dataEmissao;
        return this;
    }

    public NotaFiscalBuilder comNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
        return this;
    }

    public NotaFiscalBuilder comCpfCliente(String cpfCliente){
        this.cpfCliente = cpfCliente;
        return this;
    }

    public NotaFiscalBuilder comObservacao(String observacao){
        this.observacao = observacao;
        return this;
    }

    private void calcularValorTotal(){

        for(Item item : itens){
            this.valorTotal += item.getValor();
        }
    }

    public NotaFiscalBuilder adicionarServico(IService servico){
        this.servicos.add(servico);
        return this;
    }

    private void executarServicos(NotaFiscal notaFiscal){

        for(IService servico : servicos){
            servico.executar(notaFiscal);
        }
    }

    public NotaFiscal construir(){
        calcularValorTotal();

        NotaFiscal notaFiscal = new NotaFiscal(
            razaoSocial,
            cnpj, 
            dataEmissao, 
            itens, 
            valorTotal, 
            nomeCliente, 
            cpfCliente, 
            observacao);
            
        executarServicos(notaFiscal);
        
        return notaFiscal;
    }

}
