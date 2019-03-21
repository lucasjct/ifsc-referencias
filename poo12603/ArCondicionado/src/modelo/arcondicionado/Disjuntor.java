/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.arcondicionado;

import modelo.interfaces.ObservadorDisjuntor;
import modelo.interfaces.DisjuntorObservavel;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Disjuntor implements DisjuntorObservavel {
    private final ArrayList<ObservadorDisjuntor> interessados;
    
    private boolean ativo;
    
    public Disjuntor() {
        ativo = true;
        interessados = new ArrayList();
    }
    
    public boolean estaAtivo() {
        return ativo;
    }
    
    
    public void ligar() {
        boolean antes = ativo;
        ativo = true;
        if(!antes)
            for(ObservadorDisjuntor o : interessados)
                o.ativou();
    }
    
    public void desligar() {
        boolean antes = ativo;
        ativo = false;
        if(antes)
            for(ObservadorDisjuntor o : interessados)
                o.desativou();
    }

    @Override
    public void registarInteressado(ObservadorDisjuntor o) {
        interessados.add(o);
    }
}
