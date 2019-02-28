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
public enum Estado {
    PEQUENO(0),
    GRANDE(1),
    PODEROSO(2),
    VOADOR(2);
    
    public final int valor;
    
    private Estado(int v) {
        valor = v;
    }
    
    public static Estado estadoAnterior(Estado e) {
        switch(e) {
            case VOADOR:
            case PODEROSO:
                return GRANDE;
            case GRANDE:
                return PEQUENO;
            default:
                return PEQUENO;
        }
    }
}
