/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Uma classe que representa um sensor capaz de obter a temperatura dentro de uma chaleira coletando dados do usuário.
 * @author alexandre
 */
public class SensorTemperatura extends SensorManual {
    private static final String msgUsuario = "Qual a temperatura atual?\n\t0) Baixa\n\t1) Adequada";

    @Override
    public String obterMensagemUsuario() {
        return SensorTemperatura.msgUsuario;
    }

}
