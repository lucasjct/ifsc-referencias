/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igualdade;

import modelo.Carteira;
import modelo.Dollar;
import modelo.Real;

/**
 *
 * @author Professor
 */
public class Igualdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carteira carteira = new Carteira();
        Dollar dollares = new Dollar();
        Real reais = new Real();
        
        carteira.ganhaDollares(5);
        dollares.ganhar(5);
        reais.ganhar(20);
        
        System.out.println(dollares.equals(reais));
    }
    
}
