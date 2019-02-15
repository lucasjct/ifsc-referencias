/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarioworld;

import modelo.ColecaoItens;
import modelo.Item;
import modelo.Mario;

/**
 *
 * @author aluno
 */
public class SuperMarioWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColecaoItens colecao = new ColecaoItens();
        Mario mario = new Mario();
        
        mario.setEstado(98999);
        System.out.println(colecao.todos[2].surte_efeitos(mario));
    }
    
}
