package service;

import model.NotaFiscal;

public class WhatsAppService implements IService{
    
    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.println("Enviado por WhatsApp.");
    }
}
