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
public interface PowerUp {
    public boolean surte_efeitos(Protagonista p);
    public void aplicar_efeitos(Protagonista p);
}
