package com.mycompany.exercicio02;

public class Main {

    public static void main(String[] args) {
        Ataque socoCuca = new Soco();
        Ataque chuteGean = new Chute();
        Ataque especialLuan = new Especial();
        
        socoCuca.executar();
        chuteGean.executar();
        especialLuan.executar();
    }
}
