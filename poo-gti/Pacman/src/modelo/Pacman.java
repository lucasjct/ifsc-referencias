/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Professor
 */
public class Pacman {
    private int pontuacao;
    
    public Pacman() {
        pontuacao = 0;
    }
    
    public int obterPontuacao() {
        return pontuacao;
    }
    
    public void comerFruta(Fruta fruta) {
        pontuacao += fruta.coletar();
    }
    
    public void comerBolinha(Bolinha bolinha) {
        pontuacao += bolinha.coletar();
    }
}
