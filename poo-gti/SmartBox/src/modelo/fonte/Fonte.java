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
public abstract class Fonte {
    public final String nome;
    public final int numero;
    public final TipoFonte tipo;
    
    protected Fonte(String no, int n, TipoFonte t) {
        nome = no;
        numero = n;
        tipo = t;
    }
}
