/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforos;

import modelo.Semaforo;
import modelo.SemaforoCarro;
import modelo.SemaforoPessoa;

/**
 *
 * @author Professor
 */
public class Semaforos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo pessoa, carro;
        
        pessoa = new SemaforoPessoa();
        carro = new SemaforoCarro();
        
        System.out.println(pessoa);
        System.out.println(carro);
        
        carro.avanca();
        carro.avanca();
        carro.avanca();
        
        System.out.println(pessoa);
        System.out.println(carro);
    }
    
}
