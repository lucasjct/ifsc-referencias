/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Um enumerado com todas os estados de leituras de temperatura possiveis na simulação.
 * @author alexandre
 */
public enum LeituraTemperatura {
    ABAIXO(0),
    ADEQUADA(1);

    public final int codigo;
    
    private LeituraTemperatura(int c) {
        codigo = c;
    }
    
    /***
     * Transforma um inteiro em uma representacao de possiveis estados da temperatura no ambiente simulado.
     * @param leitura Um inteiro que representa o codigo de uma leitura
     * @return O valor do enum correspondente ao codigo.
     */
    static public LeituraTemperatura converter(int leitura) {
        switch(leitura) {
            case 0:
                return ABAIXO;
            default:
                return ADEQUADA;
        }
    }
}
