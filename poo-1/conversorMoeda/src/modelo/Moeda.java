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
public enum Moeda {
    DOLAR(3.85),
    EURO(4.32),
    REAL(1),
    PESO(0.20);
    
    public final double cotacao;
    
    private Moeda(double d) {
        cotacao = d;
    }
}
