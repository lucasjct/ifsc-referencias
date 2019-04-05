/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.jogador;


/**
 *
 * @author aluno
 */
public class Tropa {
    private int unidades;
    public final Cor cor;
    
    private void validarConstrutor() {
        if(unidades < 1)
            throw new IllegalArgumentException("Tropa não pode ser criada sem unidades");
        if(cor == null)
            throw new IllegalArgumentException("Tropa não pode ser criada sem cor");
    }
    
    public Tropa(int u, Cor c) {
        cor = c;
        unidades = u;
        validarConstrutor();
    }
    
    public int unidades() {
        return unidades;
    }
}
