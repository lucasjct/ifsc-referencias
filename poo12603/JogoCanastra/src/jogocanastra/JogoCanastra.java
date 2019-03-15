/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocanastra;

import jogo.Jogador;
import jogo.Mesa;

/**
 *
 * @author aluno
 */
public class JogoCanastra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        
        mesa.novoJogador(new Jogador());
        mesa.novoJogador(new Jogador());
        
        mesa.comecarJogo();
        
        System.out.println(mesa);
    }
    
}
