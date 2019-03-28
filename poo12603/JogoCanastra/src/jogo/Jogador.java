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
    private Mesa mesa;
    
    public Jogador() {
        mao = new ArrayList();
    }

    private void analisarEstado() {
        if(mesa == null)
            throw new IllegalStateException("O jogador precisa estar em uma mesa para jogar.");
    }
    
    public void comprar() {
        analisarEstado();
        mao.add(mesa.baralho.remove(0));
    }
    
    public void comprarDescarte() {
        analisarEstado();
        mao.addAll(mesa.descarte);
        mesa.descarte.clear();
    }
    
    public boolean descartar(int i) {
        analisarEstado();
        if(mao.size() < i)
            return false;
        mesa.descarte.add(0, mao.remove(i));
        return true;
    }

    public boolean jogar(ArrayList<Integer> jogada) {
        analisarEstado();
        ArrayList<Carta> cartas;
        
        try {
            cartas = obtemCartasPeloIndice(jogada);
        }catch(IllegalArgumentException e) {
            return false;
        }
        
        if(!jogadaValida(cartas))
            return false;
        
        mao.removeAll(cartas);
        return true;
    }
    
    @Override
    public String toString() {
        return mao.toString();
    }

    void fazParte(Mesa m) {
        mesa = m;
    }
    
    void fazParte(EnumTime representacao) {
        time = representacao;
    }
    
    public EnumTime obterTime() {
        return time;
    }

    private ArrayList<Carta> obtemCartasPeloIndice(ArrayList<Integer> jogada) {
        ArrayList<Carta> cartas = new ArrayList();
        
        if(jogada == null)
            throw new IllegalArgumentException();
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
