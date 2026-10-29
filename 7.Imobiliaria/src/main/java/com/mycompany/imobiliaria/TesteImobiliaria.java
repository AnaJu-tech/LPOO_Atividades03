
package com.mycompany.imobiliaria;

public class TesteImobiliaria {

    public static void main(String[] args) {
        Imovel i1 = new Casa("Rua A, 10", 80, 3);
        Imovel i2 = new Apartamento("Rua B, 200", 60, 5);
        
        Imovel[] imoveis = {i1, i2};
        for(Imovel i: imoveis){
            System.out.println(i.descrever());
        }
        
        System.out.println(i1.valorEstimado(3000));
        System.out.println(i1.valorEstimado(3000, 2000));
                
    }
}
