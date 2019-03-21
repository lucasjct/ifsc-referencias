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
public class Espaco {
    private boolean procurado;
    private final EnumAchado achado;
    
    public Espaco(EnumAchado a) {
        achado = a;
    }
    
    public EnumAchado estado() {
        return (procurado)? achado : EnumAchado.NAO_PROCURADO;
    }
    
    public EnumAchado buscar() {
        procurado = true;
        return estado();
    }
}
