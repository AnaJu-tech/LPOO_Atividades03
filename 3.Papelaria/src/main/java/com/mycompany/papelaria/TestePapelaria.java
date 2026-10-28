
package com.mycompany.papelaria;

public class TestePapelaria {

    public static void main(String[] args) {
        Produto p1 = new Caderno("Universitário", 20, 96);
        Produto p2 = new Caneta("Bic", 5, "Azul");
        
        Produto[] produtos = {p1, p2};
        
        for(Produto p:produtos){
            System.out.println(p.descrever());
        }
        
        System.out.println(p1.precoComDesconto(10));
        System.out.println(p1.precoComDesconto(90, 8));
    }
}
