/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Uma interface que os aparelhos inteligentes desse software devem implementar para que suas simulações consigam acessar seus atuadores e sensores.
 * @author alexandre
 */
interface AparelhoInteligente {
    /***
     * @return O indice no vetor de sensores onde encontra-se uma instancia da classe Relogio.
     */
    int obterIndiceRelogio();
    
    /***
     * @return O indice no vetor de sensores onde encontra-se uma instancia da classe SensorTemperatura.
     */
    int obterIndiceSensorTemperatura();
    
    /***
     * @return O indice no vetor de atuadores onde encontra-se uma instancia da classe ControleTemperatura.
     */
    int obterIndiceControleTemperatura();
    
    /***
     * @return O indice no vetor de atuadores onde encontra-se uma instancia da classe ControleTampa.
     */
    int obterIndiceControleTampa();
}
