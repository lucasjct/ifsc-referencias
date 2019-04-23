/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandre
 */
public class Cliente {
    public final String nome;
    private double valorComanda;
    
    public Cliente(String n) {
        nome = n;
        valorComanda = 0;
    }
    
    public void pedir(TipoCerveja cerveja) {
        valorComanda += cerveja.custo;
    }
    
    public double debitar(double v) {
        return valorComanda -= v;
    }
}
