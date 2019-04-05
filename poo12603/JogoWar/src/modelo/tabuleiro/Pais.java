/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tabuleiro;

import modelo.jogador.Tropa;
import java.util.ArrayList;
import modelo.jogador.Cor;

/**
 *
 * @author aluno
 */
public class Pais extends Territorio {
    private Tropa tropas;

    public Pais(String n) {
        super(n);
    }
    
    @Override
    public Cor conquistado() {
        if(tropas == null)
            return null;
        return tropas.cor;
    }
    
    public ArrayList<Pais> conexoes() {
        return paises();
    }
    
    public void recebeTropas(Tropa t) {
        if(tropas != null)
            throw new IllegalStateException("O País não pode receber tropas se ele já possui tropas.");
        tropas = t;
    }
}
