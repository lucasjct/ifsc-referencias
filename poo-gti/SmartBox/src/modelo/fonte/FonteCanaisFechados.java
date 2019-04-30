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
public class FonteCanaisFechados extends FonteCanais {
    public FonteCanaisFechados(String no, int n) {
        super(no, n, TipoCanal.FECHADO);
    }
}
