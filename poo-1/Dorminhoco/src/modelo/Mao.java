/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author aluno
 */
public class Mao {
    private Carta[] cartas;
    
    public Mao() {
        cartas = new Carta[4];
    }
    
    public void receber(Carta c) {
        for(int i = 0; i < cartas.length; ++i)
            if(cartas[i] == null) {
                cartas[i] = c;
                return;
            }
    }
    
    public Carta retirar(int i) {
        Carta c = cartas[i];
        cartas[i] = null;
        return c;
    }
    
    public boolean trinca() {
        return false;
    }
}
