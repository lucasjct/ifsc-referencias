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
import java.util.HashMap;

/**
 *
 * @author aluno
 */
public class Mesa {
    public final ArrayList<Carta> baralho, descarte;
    private final HashMap<EnumTime, Time> times;
    
    public Mesa() {
        times = new HashMap();
        for(EnumTime t : EnumTime.values())
            times.put(t, new Time(t));
        
        descarte = new ArrayList();
        baralho = Baralho.canastra();
    }
    
    public void novoJogador(Jogador j) {
        if(j == null)
            throw new IllegalArgumentException("Um jogador nulo não pode entrar na Mesa.");
        Time t = times.get(EnumTime.A);
        
        if(t.quantosJogadores() > times.get(EnumTime.B).quantosJogadores())
            t = times.get(EnumTime.B);
        
        t.recebeJogador(j);
    }
    
    private int quantosJogadores() {
        int i = 0;
        
        for(Time t : times.values())
            i += t.quantosJogadores();
        
        return i;
    }
    
    private boolean podeComecar() {
        final int njogadores = quantosJogadores();
        return njogadores == 2 || njogadores == 4;
    }
    
    private void comprarMaoInicial() {
        for(Time t : times.values())
            for(int i = 0; i < t.quantosJogadores(); ++i) {
                Jogador j = t.obterJogador(i);
                for(int w = 0; w < 11; ++w)
                    j.comprar();
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

        for(Time t : times.values())
            repr += t.toString();
        
        return repr;
    }
    
    
}
