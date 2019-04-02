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
public class Dinheiro {
    public final Moeda moeda;
    public final double quantidade;
    
    public Dinheiro(Moeda m, double qtd) {
        quantidade = qtd;
        moeda = m;
    }
    
    public double valor(Moeda base) {
        return quantidade * moeda.cotacao / base.cotacao;
    }
}
