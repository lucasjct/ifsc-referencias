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
public class CanalFechado extends Canal {
    public CanalFechado(int n, String no, boolean d) {
        super(n, no, d, TipoCanal.FECHADO);
    }
}
