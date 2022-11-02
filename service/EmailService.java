package service;

import model.NotaFiscal;

public class EmailService  implements IService{

    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.println("Enviado por e-mail.");
    }
    
}
