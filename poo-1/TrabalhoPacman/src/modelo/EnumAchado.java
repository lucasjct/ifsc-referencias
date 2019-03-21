/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;

/**
 *
 * @author alexandre
 */
public enum EnumAchado {
    NAO_PROCURADO(Color.gray),
    BANDEIRA(Color.green),
    BOMBA(Color.red),
    ESPACO(Color.white);
    
    public final Color cor;
    
    private EnumAchado(Color c) {
        cor = c;
    }
}
