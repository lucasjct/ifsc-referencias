/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import baralho.Carta;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Jogador {
    private final ArrayList<Carta> mao;
    
    public Jogador() {
        mao = new ArrayList();
    }

    public void comprar(Mesa mesa) {
        mao.add(mesa.baralho.remove(0));
    }
    
    public boolean descartar(Mesa mesa, int i) {
        if(mao.size() < i)
            return false;
        mesa.descarte.add(0, mao.remove(i));
        return true;
    }

    @Override
    public String toString() {
        return mao.toString();
    }
    
    
}
