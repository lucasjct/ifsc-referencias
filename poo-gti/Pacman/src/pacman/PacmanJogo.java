/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import modelo.Bolinha;
import modelo.Fruta;
import modelo.Pacman;

/**
 *
 * @author Professor
 */
public class PacmanJogo {

    public static void main(String[] args) {
        Pacman pac = new Pacman();
        Fruta[] frutas = new Fruta[4];
        Bolinha[] bolinhas = new Bolinha[4];
        
        for(int i = 0; i < 2; ++i)
            frutas[i] = new Fruta("Cereja", 500);
        for(int i = 2; i < 4; ++i)
            frutas[i] = new Fruta("Banana", 1000);
        for(int i = 0; i < 4; ++i)
            bolinhas[i] = new Bolinha();
        
        for(Fruta f : frutas){
            pac.comerFruta(f);
        }
        System.out.println(pac.obterPontuacao());
        for(Fruta f : frutas){
            pac.comerFruta(f);
        }
        System.out.println(pac.obterPontuacao());
        for(Bolinha b : bolinhas){
            pac.comerBolinha(b);
        }
        System.out.println(pac.obterPontuacao());
    }
    
}
