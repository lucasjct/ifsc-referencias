/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Uma representação da chaleira simulada que é uma chaleira inteligente e implementa uma simulação.
 * @author alexandre
 */
public class ChaleiraSimulada extends ChaleiraInteligente implements Simulacao {
    private static final int tempoEbulicao = 100;
    
    private LeituraTemperatura temperatura;
    private int tempoTotalNoEstadoAdequado;
    
    /***
     * Cria uma chaleira simulada inicializando todos as variaveis da chaleira inteligente na classe pai.
     */
    public ChaleiraSimulada() {
        super();
    }
    
    @Override
    /**
     * Simula uma iteração do objeto.
     */
    public void simular() {
        int [] leituras = new int[sensores.length]; // Declara um novo vetor de leituras para salvar as leituras dos sensores.
        
        /// Obtem todas as leituras de todos os sensores e salva em um vetor temporário
        for(int i = 0; i < sensores.length; ++i) {
            sensores[i].sensoriar(); // Faz o sensoriamento e registra no estado interno.
            leituras[i] = sensores[i].obterLeitura(); // Coleta o estado interno do sensor.
        }
        
        analisarSensores(leituras); /// Analisa as leituras obtidas pelo sensor
    }
    
    @Override
    public boolean acabou() {
        return tempoTotalNoEstadoAdequado >= tempoEbulicao;
    }
    
    /***
     * Analisa os resultados das leituras dos sensores e toma decisões.
     * @param leituras Um conjunto de identificadores de leituras.
     */
    private void analisarSensores(int [] leituras) {
        LeituraTemperatura novaTemperatura = LeituraTemperatura.converter(leituras[obterIndiceSensorTemperatura()]); // obtem a leitura da temperatura nova ja decodificada para o valor do enum.
        int tempoDecorrido = leituras[obterIndiceRelogio()]; // obtem a leitura de quantos segundos passaram do relogio.
        
        // Se a temperatura estiver baixa, mandar o controlador de temperatura esquentar, caso contrario, mantenha a temperatura.
        if(novaTemperatura == LeituraTemperatura.ABAIXO)
            atuadores[obterIndiceControleTemperatura()].atuar(ComandosControleTemperatura.ESQUENTAR.codigo);
        else {
            atuadores[obterIndiceControleTemperatura()].atuar(ComandosControleTemperatura.MANTER.codigo);
            tempoTotalNoEstadoAdequado += tempoDecorrido;
        }
        
        // Se a temperatura estiver adequada e a agua ainda nao ebuliu inteira, solte vapor.
        if(novaTemperatura == LeituraTemperatura.ADEQUADA)
            atuadores[obterIndiceControleTampa()].atuar(ComandosControleTampa.SOLTARVAPOR.codigo);
        
        // Caso a agua esteja pronta, abra a tampa.
        if(acabou())
            atuadores[obterIndiceControleTampa()].atuar(ComandosControleTampa.ABRIR.codigo);
    }
  
}
