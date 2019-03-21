/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.arcondicionado.Disjuntor;
import modelo.interfaces.ObservadorDisjuntor;

/**
 *
 * @author aluno
 */
public class UIDisjuntor implements ObservadorDisjuntor {
    private final Disjuntor disjuntor;
    
    public UIDisjuntor(Disjuntor d) {
        disjuntor = d;
        disjuntor.registarInteressado(this);
    }
    
    public void mostrarAcaoNulaTomada() {
        System.out.println("Nenhuma ação tomada");
    }

    public void mostrar() {
        System.out.println("Interações com o Disjuntor:");
        System.out.println("\t0 -> Desligar");
        System.out.println("\t1 -> Ligar");
    }

    @Override
    public void ativou() {
        System.out.println("O disjuntor foi Ativo.");
    }

    @Override
    public void desativou() {
        System.out.println("O disjuntor foi desativado.");
    }
    
}
