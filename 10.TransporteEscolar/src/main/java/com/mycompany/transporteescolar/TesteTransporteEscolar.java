
package com.mycompany.transporteescolar;

public class TesteTransporteEscolar {

    public static void main(String[] args) {
        Transporte t1 = new Van("Centro", 15);
        Transporte t2 = new OnibusEscolar("Bairro", 2);
        
        Transporte[] transportes = {t1, t2};
        for(Transporte t:transportes){
            System.out.println(t.anunciar());
        }
        
        System.out.println(t1.lotacao(12));
        System.out.println(t1.lotacao(12,15));
    }
}
