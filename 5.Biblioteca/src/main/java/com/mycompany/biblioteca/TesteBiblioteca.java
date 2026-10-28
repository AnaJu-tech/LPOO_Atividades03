
package com.mycompany.biblioteca;

public class TesteBiblioteca {

    public static void main(String[] args) {
        Publicacao p1 = new Livro("Dom Casmurro", 1899, 256);
        Publicacao p2 = new Revista("Ciencia Hoje",2024, 301);
        
        Publicacao[] publicacoes = {p1, p2};
        
        for(Publicacao p: publicacoes){
            System.out.println(p.citar());
        }
        
        System.out.println(p1.emprestar(7));
        System.out.println(p1.emprestar(7, "Ana"));
        
    }
}
