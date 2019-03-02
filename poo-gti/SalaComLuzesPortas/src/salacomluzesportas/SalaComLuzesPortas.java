/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacomluzesportas;

/**
 *
 * @author alexandre
 */
public class SalaComLuzesPortas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cor branca = new Cor("Branca");
        Chave chave = new Chave(2021);
        
        Sala sala = new Sala(branca, chave);
        
        Luz umaLuz = sala.primeiraLuz();
        
        umaLuz.acender();
    }
    
}
