/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Enumeração de todos os comandos que a tampa pode receber.
 * @author alexandre
 */
public enum ComandosControleTampa {
    SOLTARVAPOR(0),
    ABRIR(1);
    
    public final int codigo;
    
    private ComandosControleTampa(int c) {
        codigo = c;
    }
    
    /***
     * @param c Um inteiro que representa uma codificacao para um valor de controle.
     * @return O comando que o inteiro representa.
     */
    public static ComandosControleTampa converter(int c) {
       switch(c) {
           case 0:
               return SOLTARVAPOR;
           default:
               return ABRIR;
       }
    }
    
}
