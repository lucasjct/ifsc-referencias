/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tabuleiro;

import java.util.ArrayList;
import modelo.jogador.Cor;

/**
 *
 * @author aluno
 */
public class Continente extends Territorio {

    private void validarConstrutor(ArrayList<Pais> ps) {
        if(ps == null || ps.isEmpty())
            throw new IllegalArgumentException("Um continente deve ter ao menos 1 país.");
    }
    
    public Continente(String n, ArrayList<Pais> ps) {
        super(n);
        validarConstrutor(ps);
        paises.addAll(ps);
    }
    
    @Override
    public Cor conquistado() {
        Cor c = paises.get(0).conquistado();
        for(Pais p : paises())
            if(p.conquistado() != c)
                return null;
        return c;
    }
}
