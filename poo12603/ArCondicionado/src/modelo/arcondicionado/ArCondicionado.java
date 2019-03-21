/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.arcondicionado;

import java.util.ArrayList;
import modelo.interfaces.ArCondicionadoObservavel;
import modelo.interfaces.ObservadorArCondicionado;
import modelo.interfaces.ObservadorDisjuntor;
import modelo.interfaces.ObservadorControle;

/**
 *
 * @author aluno
 */
public class ArCondicionado implements ObservadorControle, ObservadorDisjuntor, ArCondicionadoObservavel {
    private final ArrayList<ObservadorArCondicionado> interessados;
    
    private static final int temperaturaMinima = 14;
    private static final int temperaturaMaxima = 30;
    
    private int temperatura;
    private boolean ligado;
    private final Disjuntor disjuntor;
    private final ControleArCondicionado controle;
    
    public ArCondicionado(Disjuntor d, ControleArCondicionado c) {
        ligado = false;
        temperatura = 25;
        
        disjuntor = d;
        controle = c;
        
        controle.registrarInteressado(this);
        disjuntor.registarInteressado(this);
        
        interessados = new ArrayList();
    }
    
    private void ligar() {
        boolean antes = ligado;
        if(disjuntor.estaAtivo()) {
            ligado = true;
            if(!antes)
                for(ObservadorArCondicionado o : interessados)
                    o.ligou();
        }
            
    }
    
    private void desligar() {
        boolean antes = ligado;
        ligado = false;
        if(antes)
            for(ObservadorArCondicionado o : interessados)
                o.desligou();
    }
    
    private void diminuirTemperatura() {
        --temperatura;
        temperatura = (temperatura < temperaturaMinima)? temperaturaMinima : temperatura;
        for(ObservadorArCondicionado o : interessados)
            o.temperaturaDesceu(temperatura);
    }
    
    private void aumentarTemperatura() {
        ++temperatura;
        temperatura = (temperatura > temperaturaMaxima)? temperaturaMaxima : temperatura;
        for(ObservadorArCondicionado o : interessados)
            o.temperaturaSubiu(temperatura);
    }

    @Override
    public void ligarPressionado() {
        ligar();
    }

    @Override
    public void desligarPressionado() {
        desligar();
    }

    @Override
    public void aumentarPressionado() {
        aumentarTemperatura();
    }

    @Override
    public void diminuirPressionado() {
        diminuirTemperatura();
    }

    @Override
    public void ativou() {}

    @Override
    public void desativou() {
        desligar();
    }

    @Override
    public void registrarInteressados(ObservadorArCondicionado o) {
        interessados.add(o);
    }
}
