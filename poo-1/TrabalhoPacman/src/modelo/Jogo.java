/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandre
 */
public class Jogo {

    public final Tabuleiro tabuleiro;
    
    public Jogo() {
        tabuleiro = new Tabuleiro();
    }
    
    public void comecar(int tamanho) {
        tabuleiro.ajustar(tamanho);
    }
}
