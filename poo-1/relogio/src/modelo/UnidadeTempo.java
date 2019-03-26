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
public class UnidadeTempo {
    private int valor, maximo;
    
    public UnidadeTempo(int v, int max) {
        maximo = max;
        valor = v%maximo;
    }
    
    public boolean incrementa() {
        valor = (valor+1)%maximo;
        return valor == 0;
    }
    
    public int valor() {
        return valor;
    }
}
