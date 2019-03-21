/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Lampada implements LampadaObservada {
    private boolean ligada;
    private ArrayList<ObservadorLampada> observadores;
    
    public Lampada() {
        observadores = new ArrayList();
    }
    
    @Override
    public void ligar() {
        ligada = true;
        for(ObservadorLampada o : observadores)
            o.estadoMudou();
    }
    
    @Override
    public void desligar() {
        ligada = false;
        for(ObservadorLampada o : observadores)
            o.estadoMudou();
    }
    
    public boolean obterEstado() {
        return ligada;
    }

    @Override
    public void registrarObservador(ObservadorLampada l) {
        observadores.add(l);
    }

    @Override
    public void removerObservador(ObservadorLampada l) {
        observadores.remove(l);
    }
}
