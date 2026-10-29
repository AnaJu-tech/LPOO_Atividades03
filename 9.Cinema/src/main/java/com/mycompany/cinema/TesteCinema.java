
package com.mycompany.cinema;

public class TesteCinema {

    public static void main(String[] args) {
        Ingresso i1 = new MeiaEntrada("Divertida Mente ", 40, " 123");
        Ingresso i2 = new Vip("Duna ", 40, " setor A");
        
        Ingresso[] ingressos = {i1, i2};
        for(Ingresso i:ingressos){
            System.out.println(i.valorFinal());
        }
        
        System.out.println(i1.resumo());
        System.out.println(i1.resumo(true));
    }
}
