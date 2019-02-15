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
public class ItemEstadoIncremental extends Item {
    public final int estado;

    public ItemEstadoIncremental(String nome, boolean caixa, boolean mundo, boolean mudanca_visual, boolean novos_controles, int estado) {
        super(nome, caixa, mundo, mudanca_visual, novos_controles);
        this.estado = estado;
    }
    
    @Override
    public boolean surte_efeitos(Mario m) {
        return (m.estado + 1) == estado;
    }
    
}
