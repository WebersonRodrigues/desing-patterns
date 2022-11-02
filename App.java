import java.util.ArrayList;
import java.util.Date;

import interfaces.Imposto;
import model.CalculadoraDeImpostos;
import model.CalculadoreDeDescontos;
import model.Item;
import model.NotaFiscal;
import model.NotaFiscalBuilder;
import model.Orcamento;
import model.Impostos.COFINS;
import model.Impostos.ICMS;
import model.Impostos.ISS;
import model.Impostos.PIS;
import model.Impostos.ST;
import model.estados.Aprovado;
import service.EmailService;
import service.WhatsAppService;

public class App {
    public static void main(String[] args) {
        System.out.println("Desing Patterns");
        System.out.println();


        // Orcamento orcamento = new Orcamento(300.0);
        // Imposto icms = new ICMS();
        // Imposto iss = new ISS();
        // Imposto pis = new PIS();

        // Imposto cofins = new COFINS();
        // Imposto st = new ST();

        // CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        // double valorICMS = calculadora.RealizarCaculo(orcamento, "ICMS");
        // double valorISS = calculadora.RealizarCaculo(orcamento, "ISS");

        // double valorICMS = calculadora.RealizarCalculoICMS(orcamento);
        // double valorISS = calculadora.RealizarCalculoISS(orcamento);

        // double valorImcs = calculadora.calcular(orcamento, icms);
        // double valorIss = calculadora.calcular(orcamento, iss);
        // double valorPis = calculadora.calcular(orcamento, pis);

        // ==============================

        // CalculadoreDeDescontos calculadoreDeDescontos = new CalculadoreDeDescontos();

        // orcamento.adicionarItem(new Item("Teclado Mecanico", 300.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
        // orcamento.adicionarItem(new Item("Teclado Mecanico", 100.0));
      
        // double descontoTotal = calculadoreDeDescontos.calcular(orcamento);
        // System.out.println(descontoTotal);

        // double valorCofins = calculadora.calcular(orcamento, cofins);
        // double valorST = calculadora.calcular(orcamento, st);

        // Imposto iss = new ISS(new ICMS());

        // Orcamento orcamento = new Orcamento(500.0);

        // double valor = iss.calcular(orcamento);
        
        // System.out.println(valor);

        // Orcamento reforma = new Orcamento(500.0);
        // System.out.println(reforma.getValor());

        // reforma.aplicarDescontoExtra();
        // System.out.println(reforma.getValor());
        
        // reforma.aprovar();
        // reforma.aplicarDescontoExtra();
        // System.out.println(reforma.getValor());

        // reforma.finalizar();
        // //Aqui lance uma excption
        // reforma.aplicarDescontoExtra();
        // System.out.println(reforma.getValor());


        NotaFiscalBuilder construtor = new NotaFiscalBuilder();

        NotaFiscal notafiscal = construtor
            .comRazaoSocial("Desenvolvimento LTDA")
            .comItem(new Item("Martelo", 50.0))
            .comItem(new Item("Furadeira", 150.0))
            .comCnpj("123.168.12/0001-12")
            .comObservacao("Teste")
            .adicionarServico(new EmailService())
            .adicionarServico(new WhatsAppService())

            .construir();
            
        System.out.println("teste");



    }
}