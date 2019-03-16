/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Professor
 */
public class SemaforoCarro extends Semaforo {
    @Override
    protected int maximo() {
        return EstadosCarro.quantidadeEstados();
    }

    @Override
    public String representacao() {
        return EstadosCarro.values()[id].toString();
    }
    
}
