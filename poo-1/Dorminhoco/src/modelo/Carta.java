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
public class Carta {
    public final ValorCarta valor;
    public final Naipe naipe;
    
    public Carta(ValorCarta v, Naipe n) {
        valor = v;
        naipe = n;
    }
    
    public boolean igual(Carta c) {
        return valor == c.valor;
    }
}
