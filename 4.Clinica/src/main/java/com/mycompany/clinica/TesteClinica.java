
package com.mycompany.clinica;

public class TesteClinica {

    public static void main(String[] args) {
        Pessoa p1 = new Paciente("Carla", "Unimed");
        Pessoa p2 = new Medico("Diego", "Clinica");
        
        Pessoa[] pessoas = {p1, p2};
        
        for(Pessoa p:pessoas){
            System.out.println(p.ficha());
        }
        
        System.out.println(p1.agendar("12/10/2026"));
        System.out.println(p1.agendar("12/10/2026", "14:00"));
    }
}
