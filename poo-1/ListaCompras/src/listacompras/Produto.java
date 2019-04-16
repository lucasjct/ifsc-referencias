/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listacompras;

/**
 *
 * @author aluno
 */
public class Produto {
    public int quantidade;
    public final double preco;
    
    public Produto(double p) {
        preco = p;
    }
    
    public Produto(double p, int q) {
        preco = p;
        quantidade = q;
    }
    
    public boolean contabilizado() {
        return quantidade > 0 && preco > 0;
    }
    
    public double precoTotal() {
        return preco * quantidade;
    }
}
