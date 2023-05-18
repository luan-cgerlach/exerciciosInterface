
package com.mycompany.exercicio01;

public class Pix implements Pagamento{

    public Pix() {
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("pix: " +valor);
    }

}
