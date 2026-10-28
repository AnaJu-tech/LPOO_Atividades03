
package com.mycompany.biblioteca;

public class Publicacao {
    protected String titulo;
    protected int ano;

    public Publicacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
    
    public String citar(){
        return titulo + " (" + ano + ")";
    }
    
    public String emprestar(int dias){
        return "Empréstimo de " + dias + " dias.";
    }
    
    public String emprestar(int dias, String leitor){
        return "Empréstimo de " + dias + " dias para " + leitor;
    }
}
