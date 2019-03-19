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
public class Personagem {
    int pontos;
    boolean poderoso;
    
    int obterPontuacao() {
        return pontos;
    }

    void comer(Bolinha b) {
        pontos += b.pontos();
        if(!b.jaComida())
            poderoso = false;
        b.serComida();
    }

    void comer(Fruta f) {
        pontos += f.pontos();
        if(!f.jaComida())
            poderoso = true;
        f.serComida();
    }
    
}
