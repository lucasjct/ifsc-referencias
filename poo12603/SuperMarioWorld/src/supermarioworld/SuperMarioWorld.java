/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarioworld;

import modelo.Item;
import modelo.Protagonista;
import modelo.Antagonista;
import modelo.Estrategia;
import modelo.Interacao;

/**
 *
 * @author aluno
 */
public class SuperMarioWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Protagonista mario = Protagonista.MARIO;
        
        Antagonista koopa = Antagonista.KOOPA;
        
        mario.novaEstrategia(new Estrategia(Interacao.ANDAR_FRENTE));
        
        koopa.interage(mario);
    }
    
}
