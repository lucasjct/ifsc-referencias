/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Prova {
    private EstadoProva estado;
    
    private ArrayList<Questao> questoes; // Não sabemos o número de questoes, logo usamos um arraylist.
    
    public Prova() {
        estado = EstadoProva.CONFECCAO;
        questoes = new ArrayList();
    }
    
    public void adicionar(Questao q) {
        if(estado == EstadoProva.CONFECCAO)
            questoes.add(q);
    }
    
    public Questao questao(int i) {
        return questoes.get(i);
    }
    
    public void pronta() {
        if(estado == EstadoProva.CONFECCAO)
            estado = EstadoProva.PRONTA;
    }
    
    public void respondida() {
        if(estado == EstadoProva.PRONTA)
            estado = EstadoProva.RESPONDIDA;
    }

    @Override
    public String toString() {
        String s = "-- Prova --\n";
        int i = 0;
        for(Questao q : questoes)
            s += "\t-- Questao " + (i++) + "--\n" + q.toString() + "\n";
        return s;
    }
    
}
