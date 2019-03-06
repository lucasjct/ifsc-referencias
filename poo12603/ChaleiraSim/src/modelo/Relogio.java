/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Uma classe que representa um sensor que captura o tempo (Relogio) através do input do usuario.
 * @author alexandre
 */
public class Relogio extends SensorManual {
    private static final String msgLeitura= "Quanto tempo passou (segundos)?";
    
    @Override
    public String obterMensagemUsuario() {
        return Relogio.msgLeitura;
    }
}
