/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Professor
 */
public class Carteira extends ImplValor {
    private Dinheiro dollares, reais;
    
    public Carteira() {
        dollares = new Dollar();
        reais = new Real();
    }

    @Override
    public double valor() {
        return dollares.valor() + reais.valor();
    }
    
    public void ganhaDollares(int n) {
        dollares.ganhar(n);
    }
    
    public void ganhaReais(int n) {
        reais.ganhar(n);
    }
}
