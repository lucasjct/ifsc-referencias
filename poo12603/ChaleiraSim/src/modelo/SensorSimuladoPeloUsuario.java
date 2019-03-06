/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Uma interface para dizer que um dado sensor na verdade é simulado pelo usuário ao invés de um ambiente real.
 * @author alexandre
 */
public interface SensorSimuladoPeloUsuario {
    /***
     * @return Uma mensagem para mostrar para o usuário antes de fazer a leitura.
     */
    String obterMensagemUsuario();
}
