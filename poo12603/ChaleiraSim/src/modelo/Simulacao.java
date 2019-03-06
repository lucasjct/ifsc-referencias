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
interface Simulacao {
    /***
     * Simula um instante do objeto.
     */
    void simular();
    
    /***
     * @return True se a simulação deve acabou, false caso contrário.
     */
    boolean acabou();
}
