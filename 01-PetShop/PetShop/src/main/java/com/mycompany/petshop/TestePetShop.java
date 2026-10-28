
package com.mycompany.petshop;

public class TestePetShop {

    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex", 3, "Labrador");
        Animal a2 = new Gato("Mia", 2, "curta");
        
        Animal[] animais = {a1, a2};
        
        for(Animal a:animais){
            System.out.println(a.descrever());
        }
        
        System.out.println(a1.idadeEmMeses());
        System.out.println(a1.idadeEmMeses(6));
    }
}
