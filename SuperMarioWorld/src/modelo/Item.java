/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public abstract class Item implements Incremento {
    String nome;
    boolean caixa, mundo;
    boolean mudanca_visual, novos_controles;

    public Item(String nome, boolean caixa, boolean mundo, boolean mudanca_visual, boolean novos_controles) {
        this.nome = nome;
        this.caixa = caixa;
        this.mundo = mundo;
        this.mudanca_visual = mudanca_visual;
        this.novos_controles = novos_controles;
    }
    
    public String getNome() {
        return nome;
    }
}
