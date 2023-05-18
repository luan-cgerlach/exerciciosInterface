
package com.mycompany.exercicio01;

public class CartaoCredito implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("cartão de credito: " +valor);
    }

    public CartaoCredito() {
    }
    
    
}
