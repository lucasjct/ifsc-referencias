/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import baralho.Carta;
import baralho.Naipe;
import baralho.ValorCarta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aluno
 */
public class Jogador {
    private final ArrayList<Carta> mao;
    private EnumTime time;
    
    public Jogador() {
        mao = new ArrayList();
    }

    public void comprar(Mesa mesa) {
        mao.add(mesa.baralho.remove(0));
    }
    
    public void comprarDescarte(Mesa m) {
        mao.addAll(m.descarte);
        m.descarte.clear();
    }
    
    public boolean descartar(Mesa mesa, int i) {
        if(mao.size() < i)
            return false;
        mesa.descarte.add(0, mao.remove(i));
        return true;
    }

    public void jogar(ArrayList<Integer> jogada) {
        ArrayList<Carta> cartas = obtemCartasPeloIndice(jogada);
        
        if(!jogadaValida(cartas))
            return;
        
        mao.removeAll(cartas);
    }
    
    @Override
    public String toString() {
        return mao.toString();
    }

    public void fazParte(EnumTime representacao) {
        time = representacao;
    }
    
    public EnumTime obterTime() {
        return time;
    }

    private ArrayList<Carta> obtemCartasPeloIndice(ArrayList<Integer> jogada) {
        ArrayList<Carta> cartas = new ArrayList();
        
        for(Integer i : jogada)
            if(mao.size() > i && i > 0)
                cartas.add(mao.get(i));
        
        return cartas;
    }

    private boolean jogadaValida(ArrayList<Carta> jogada) {
        if(jogada.size() < 3)
            return false;
        
        Naipe n = jogada.get(0).naipe;
        for(int i = 1; i < jogada.size(); ++i)
            if(!n.equals(jogada.get(i).naipe))
                return false;
        
        Collections.sort(jogada);
        
        int reiAs = 0;
        if(jogada.get(jogada.size()-1).valor.equals(ValorCarta.REI) && jogada.get(0).valor.equals(ValorCarta.AS))
            reiAs = 1;
        
        for(int i = 1+reiAs; i < jogada.size(); ++i) {
            Carta c = jogada.get(i-1);
            Carta o = jogada.get(i);
            if(c.compareTo(o) != -1)
                return false;
        }
            
        return true;
    }
}
