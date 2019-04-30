/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fonte;

/**
 *
 * @author aluno
 */
public abstract class Canal {
    public final int numero;
    public final String nome;
    public final boolean disponivel;
    public final TipoCanal tipo;
    
    protected Canal(int n, String no, boolean d, TipoCanal t) {
        numero = n;
        nome = no;
        disponivel = d;
        tipo = t;
    }
}
