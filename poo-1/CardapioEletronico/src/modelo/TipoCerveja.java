/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandre
 */
public enum TipoCerveja {
    CERVEJOINHA(6.50),
    BIRITOVSK(8.30),
    PEPITA(7.20);
    
    public final double custo;
    
    private TipoCerveja(double c) {
        custo = c;
    }
}
