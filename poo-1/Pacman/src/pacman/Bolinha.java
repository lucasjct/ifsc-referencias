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
public class Bolinha {
    boolean comida;
    
    int pontos() {
        if(!comida)
            return 100;
        else
            return 0;
    }
    
    void serComida() {
        comida = true;
    }
    
    boolean jaComida() {
        return comida;
    }
}
