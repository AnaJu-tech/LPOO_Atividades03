
package com.mycompany.papelaria;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String descrever(){
        return "Produto: " + nome;
    }
    
    public double precoComDesconto(double percentual){
        return preco * (1 - percentual / 100);
    }
    
    public double precoComDesconto(double percentual, double minimo){
        if (preco * (1 - percentual / 100) < minimo){
            return minimo;
        }else{
            return preco * (1 - percentual / 100);
        }
    }
}
