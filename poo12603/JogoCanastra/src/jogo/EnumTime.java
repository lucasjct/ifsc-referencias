/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author aluno
 */
public enum EnumTime {
    A("A"),
    B("B");
    
    public final String nome;
    
    private EnumTime(String n) {
        nome = n;
    }
}
