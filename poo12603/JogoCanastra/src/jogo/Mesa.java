/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import baralho.Baralho;
import baralho.Carta;
import static java.lang.System.exit;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Mesa {
    public final ArrayList<Carta> baralho, descarte;
    private final ArrayList<Jogador> jogadores;
    
    public Mesa() {
        jogadores = new ArrayList();
        
        descarte = new ArrayList();
        baralho = Baralho.canastra();
    }
    
    public void novoJogador(Jogador j) {
        jogadores.add(j);
    }
    
    private boolean podeComecar() {
        final int njogadores = jogadores.size();
        return njogadores == 2 || njogadores == 4;
    }
    
    private void comprarMaoInicial() {
        for(int i = 0; i < 11; ++i) {
            for(Jogador j : jogadores)
                j.comprar(this);
        }
    }
    
    public void comecarJogo() {
        if(!podeComecar()) {
            System.out.println("Número inválido de Jogadores");
            exit(1);
        }
        comprarMaoInicial();
    }

    @Override
    public String toString() {
        String repr = "--Mesa--\n";
        repr += "\t--Descarte--\n";
        repr += "\t\t" + descarte.toString() + "\n";
        
        repr += "\n\t--Jogadores--";
        int i = 0;
        for(Jogador j : jogadores) {
            repr += "\n\t\tJogador " + i++;
            repr += "\n\t\t\t" + j.toString();
        }
        
        return repr;
    }
    
    
}
