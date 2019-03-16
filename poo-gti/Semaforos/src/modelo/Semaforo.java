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
public abstract class Semaforo implements RepresentavelTexto {
    protected int id;
    
    protected abstract int maximo();
    
    public void avanca() {
        id = (id+1)%maximo();
    }

    @Override
    public String toString() {
        return representacao();
    }
    
    
}
