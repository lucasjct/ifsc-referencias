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
public class ItemIndependenteEstado extends Item {
    public ItemIndependenteEstado(String nome, boolean caixa, boolean mundo, boolean mudanca_visual, boolean novos_controles) {
        super(nome, caixa, mundo, mudanca_visual, novos_controles);
    }
    
    @Override
    public boolean surte_efeitos(Mario m) {
        return !m.yoshi;
    }
}
