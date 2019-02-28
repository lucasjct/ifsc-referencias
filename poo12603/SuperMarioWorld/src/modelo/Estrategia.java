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
public class Estrategia {
    public final Interacao[] forma;
    
    public Estrategia(Interacao[] interacoes) {
        forma = interacoes;
    }
    
    public Estrategia(Interacao primeira) {
        forma = new Interacao[1];
        forma[0] = primeira;
    }
    
    public Estrategia(Interacao primeira, Interacao segunda) {
        forma = new Interacao[2];
        forma[0] = primeira;
        forma[1] = segunda;
    }
    
    @Override
    public boolean equals(Object outro) {
        if(!(outro instanceof Estrategia))
            return false;
        
        Estrategia outra_estrategia = (Estrategia) outro;
        if(forma.length != outra_estrategia.forma.length)
            return false;
        
        for(int i = 0; i < forma.length; ++i)
            if(!forma[i].equals(outra_estrategia.forma[i]))
                return false;
        return true;
    }
}
