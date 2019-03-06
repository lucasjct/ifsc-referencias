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
abstract class ChaleiraInteligente implements AparelhoInteligente {
    protected final Sensor[] sensores;
    
    protected final Atuador[] atuadores;
    
    /***
     * Construtor que inicializa os vetores de sensores e atuadores da maneira com que eles devem estar organizados para funcionar.
     */
    public ChaleiraInteligente() {
        super();
        sensores = new Sensor[2];
        sensores[0] = new SensorTemperatura();
        sensores[1] = new Relogio();
        
        atuadores = new Atuador[2];
        atuadores[0] = new ControleTampa();
        atuadores[1] = new ControleTemperatura();
    }
    
    @Override
    public int obterIndiceRelogio() {
        return 1;
    }
    
    @Override
    public int obterIndiceSensorTemperatura() {
        return 0;
    }
    
    @Override
    public int obterIndiceControleTampa() {
        return 0;
    }
    
    @Override
    public int obterIndiceControleTemperatura() {
        return 1;
    }
}
