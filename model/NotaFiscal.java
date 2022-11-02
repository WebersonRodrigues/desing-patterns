package model;

import java.util.Date;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private Date dataEmisao;
    private List<Item> itens;
    private Double valorTotal;
    private String nomeCliente;
    private String cpfCliente;
    private String observacoes;
    // Aqui posso ter uma infinidade de propriedades...

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public NotaFiscal(String razaoSocial, String cnpj, Date dataEmisao, List<Item> itens, Double valorTotal,
            String nomeCliente, String cpfCliente, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmisao = dataEmisao;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.observacoes = observacoes;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataEmisao() {
        return dataEmisao;
    }

    public void setDataEmisao(Date dataEmisao) {
        this.dataEmisao = dataEmisao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}
