/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Uma interface base para todos os sensores da simulação.
 * @author alexandre
 */
public interface Sensor {
    /***
     * Sensoria o ambiente e registra uma leitura no estado interno do sensor.
     */
    public void sensoriar();
    
    /***
     * @return Obtem o estado interno do sensor para obter um código que representa sua leitura.
     */
    public int obterLeitura();
}
