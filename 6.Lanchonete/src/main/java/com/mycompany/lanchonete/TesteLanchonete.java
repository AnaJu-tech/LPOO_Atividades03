
package com.mycompany.lanchonete;

public class TesteLanchonete {

    public static void main(String[] args) {
        Item i1 = new Lanche("X-burguer", 18, 2);
        Item i2 = new Bebida("Suco", 8, 300);
        
        Item[] itens = {i1, i2};
        for(Item i: itens){
            System.out.println(i.descrever());
        }
        
        System.out.println(i1.total());
        System.out.println(i1.total(2));
    }
}
