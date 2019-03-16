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
public abstract class Dinheiro extends ImplValor implements Adquirivel {
    protected int quantidade;
    
    @Override
    public void ganhar(int n) {
        quantidade += n;
    }
    
    @Override
    public void perder(int n) {
        quantidade -= n;
    }
}
