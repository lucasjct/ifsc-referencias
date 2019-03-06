/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaleirasim;

import modelo.ChaleiraSimulada;

/**
 * Classe principal da simulacao de uma chaleira em ebulicao
 * @author alexandre
 */
public class ChaleiraSim {

    /***
     * O objetivo deste programa é simular uma chaleira que fará a agua entrar em ebulição.
     * A simulação acaba quando passarem-se 100 segundos com a chaleira na temperatura ideal.
     * Quando a chaleira está abaixo da temperatura ideal, ela ativa seu controle de temperatura para tentar aumentar a temperatura (apenas print na tela para fins de estudo)
     * Quando a chaleira está na temperatura ideal, ela soltará vapor e contará o tempo no estado.
     * Quando a chaleira acabar, a tampa dela se abre e a simulação acaba.
     * @param args 
     */
    public static void main(String[] args) {
        ChaleiraSimulada chaleira = new ChaleiraSimulada();
        
        while(!chaleira.acabou())
            chaleira.simular();
    }
    
}
