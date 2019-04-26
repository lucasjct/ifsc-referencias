/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class EventoEstacionamento {
    public final int entrada, saida;
    
    public EventoEstacionamento(int e, int s) {
        entrada = e;
        saida = s;
    }
    
    public int periodo() {
        return saida - entrada;
    }
}
