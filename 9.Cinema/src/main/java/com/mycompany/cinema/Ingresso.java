
package com.mycompany.cinema;

public class Ingresso {
    protected String filme;
    protected double valor;

    public Ingresso(String filme, double valor) {
        this.filme = filme;
        this.valor = valor;
    }
    
    public double valorFinal(){
        return valor;
    }
    
    public String resumo(){
        return filme;
    }
    
    public String resumo(boolean comValor){
        if(comValor == true){
            return filme + ", valor " + valorFinal();
        }else{
            return filme;
        }
    }
}
