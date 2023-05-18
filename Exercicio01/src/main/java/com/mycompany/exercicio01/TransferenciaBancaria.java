
package com.mycompany.exercicio01;

public class TransferenciaBancaria implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Transferencia bancaria: " +valor);
    }

    public TransferenciaBancaria() {
    }
    
}
