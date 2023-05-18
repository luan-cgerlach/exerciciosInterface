package com.mycompany.exercicio01;

public class Main {
    public static void main(String[] args) {
        
Pagamento cartaoCuca = new CartaoCredito();
Pagamento transferenciaLuan = new TransferenciaBancaria();
Pagamento pixGean = new Pix();

cartaoCuca.realizarPagamento(10);
transferenciaLuan.realizarPagamento(100);
pixGean.realizarPagamento(99);
    }
}
