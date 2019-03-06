/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Enumeracao de todos os comandos possiveis do controle de temperatura da chaleira.
 * @author alexandre
 */
public enum ComandosControleTemperatura {
    ESQUENTAR(0),
    MANTER(1);
    
    public final int codigo;
    
    private ComandosControleTemperatura(int c) {
        codigo = c;
    }
    
    /***
     * @param c Um inteiro que representa uma codificacao para um valor de controle.
     * @return O comando que o inteiro representa.
     */
    public static ComandosControleTemperatura converter(int c) {
       switch(c) {
           case 0:
               return ESQUENTAR;
           default:
               return MANTER;
       }
    }
}
