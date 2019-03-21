/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacman;

/**
 *
 * @author aluno
 */
public class Pacman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personagem pac = new Personagem();
        Fruta f = new Fruta();
        Fruta f2 = new Fruta();
        
        f.pontos = 500;
        f2.pontos = 1000;
        
        System.out.println("A pontuação atual é: " + pac.obterPontuacao());
        System.out.println("O pacman esta poderoso? " + pac.poderoso);
        pac.comer(f);
        System.out.println("O pacman esta poderoso? " + pac.poderoso);
        pac.poderoso = false;
        pac.comer(f);
        System.out.println("O pacman esta poderoso? " + pac.poderoso);
        
    }
    
}
