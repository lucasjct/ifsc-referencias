/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lixeirainteligente;

/**
 * @author aluno
 */
public class Lixo {
    public final double peso;
    public final TipoLixo tipo;
    
    public Lixo(TipoLixo t, double p) {
        peso = p;
        tipo = t;
    }
}
