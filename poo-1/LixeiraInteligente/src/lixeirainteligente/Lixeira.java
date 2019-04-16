/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lixeirainteligente;

/**
 *
 * @author aluno
 */
public class Lixeira {
    public final TipoLixo tipo;
    private double peso;
    
    public Lixeira(TipoLixo t) {
        peso = 0;
        tipo = t;
    }
    
    public double quantoPeso() {
        return peso;
    }
    
    public void receber(Lixo li){
        peso += li.peso;
    }
}
