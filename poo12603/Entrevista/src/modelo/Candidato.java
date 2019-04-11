/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public class Candidato {
    public final String nome;
    private final ArrayList<Habilidade> habilidades;

    private void validarConstrutor() {
        if(nome == null)
            throw new IllegalArgumentException("Nome do Candidato não pode ser vazio.");
    }
    
    public Candidato(String n){
        nome = n;
        habilidades = new ArrayList();
        
        validarConstrutor();
    }
    
    public void adicionarHabilidade(Habilidade h) {
        if(h != null)
            habilidades.add(h);
    }

    @Override
    public String toString() {
        String str = nome + "\n\t";
        for(Habilidade h : habilidades)
            str += h.toString() + "\n\t";
        return str;
    }
}
