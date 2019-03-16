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
public abstract class ImplValor implements Valor {
    @Override
    public boolean equals(Object o) {
        if(o instanceof Valor) {
            Valor v = (Valor) o;
            return valor() == v.valor();
        }
        return false;    
    }
}
