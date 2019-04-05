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
public abstract class Territorio {
    public final String nome;
    protected ArrayList<Pais> paises;
    
    public Territorio(String n) {
        nome = n;
        paises = new ArrayList();
        validarConstrutor();
    }
    
    public ArrayList<Pais> paises() {
        return paises;
    }
    
    public abstract Cor conquistado();

    private void validarConstrutor() {
        if(nome == null || nome.isEmpty())
            throw new IllegalArgumentException("Nome do Território não pode ser vazio.");
    }

}
