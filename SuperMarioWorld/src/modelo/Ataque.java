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
public enum Ataque {
    BASICO(new Estrategia(Interacao.PULAR)),
    DISTANCIA(new Estrategia(Interacao.ANDAR_FRENTE, Interacao.PULAR)),
    LANCA(new Estrategia(Interacao.ANDAR_TRAS, Interacao.PULAR));
    
    public final Estrategia estrategiaVencedora;
    
    private Ataque(Estrategia e) {
        estrategiaVencedora = e;
    }
}
