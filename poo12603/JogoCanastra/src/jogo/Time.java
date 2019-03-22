/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Time {
    public final EnumTime representacao;
    private final ArrayList<Jogador> jogadores;
    
    public Time(EnumTime r) {
        representacao = r;
        jogadores = new ArrayList();
    }
    
    public void recebeJogador(Jogador j) {
        jogadores.add(j);
        j.fazParte(representacao);
    }
    
    public int quantosJogadores() {
        return jogadores.size();
    }
    
    public Jogador obterJogador(int i) {
        return jogadores.get(i);
    }
}
