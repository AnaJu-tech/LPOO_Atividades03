
package com.mycompany.academia;

public class TesteAcademia {

    public static void main(String[] args) {
        Atleta a1 = new Corredor("Lia", 10);
        Atleta a2 = new Nadador("Paulo", "crawl");
        
        Atleta[] atletas = {a1, a2};
        for(Atleta a: atletas){
            System.out.println(a.apresentar());
        }
        
        System.out.println(a1.registrarTempo(55.2));
        System.out.println(a1.registrarTempo(58,"100m"));
    }
}
