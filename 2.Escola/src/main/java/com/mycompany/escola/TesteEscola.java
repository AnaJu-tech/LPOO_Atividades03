
package com.mycompany.escola;

public class TesteEscola {

    public static void main(String[] args) {
        Funcionario f1 = new Professor("Ana", 3000, "POO");
        Funcionario f2 = new Coordenador("Bruno", 4500, "Pedagógico");
        
        Funcionario[] funcionarios = {f1, f2};
        
        for(Funcionario f:funcionarios){
            System.out.println(f.descrever());
        }
        
        System.out.println(f1.bonificacao());
        System.out.println(f1.bonificacao(20));
    }
}
