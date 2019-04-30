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
public class CanalAberto extends Canal {
    // Um canal aberto está sempre disponível.
    public CanalAberto(int n, String no) {
        super(n, no, true, TipoCanal.ABERTO);
    }
}
