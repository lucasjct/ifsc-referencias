/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaveis;

/**
 *
 * @author alexandre
 */
public abstract class ItemValioso implements Valioso {
    public final int valor;
    
    public ItemValioso(int v) {
        valor = v;
    }
    
    @Override
    public int valor() {
        return valor;
    }

    @Override
    public int compareTo(Valioso outro) {
        return valor() - outro.valor();
    }
    
}
