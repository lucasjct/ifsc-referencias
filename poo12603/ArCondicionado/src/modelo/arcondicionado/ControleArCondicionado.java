/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.arcondicionado;

import modelo.interfaces.ObservadorControle;
import modelo.interfaces.ControleObservavel;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author aluno
 */
public class ControleArCondicionado implements ControleObservavel {
    private final ArrayList<EnumBotoes> botoes;
    private final ArrayList<ObservadorControle> interessados;

    public ControleArCondicionado() {
        botoes = new ArrayList();
        botoes.addAll(Arrays.asList(EnumBotoes.values()));
        
        interessados = new ArrayList();
    }

    public ArrayList<EnumBotoes> obterBotoes() {
        return botoes;
    }
    
    public void pressionar(EnumBotoes b) {
        switch(b) {
            case LIGAR:
                for(ObservadorControle o : interessados)
                    o.ligarPressionado();
                break;
            case DESLIGAR:
                for(ObservadorControle o : interessados)
                    o.desligarPressionado();
                break;
            case DIMINUIR:
                for(ObservadorControle o : interessados)
                    o.diminuirPressionado();
                break;
            case AUMENTAR:
                for(ObservadorControle o : interessados)
                    o.aumentarPressionado();
                break;
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        for(EnumBotoes b : EnumBotoes.values())
            s += b.toString();
        return s;
    }

    @Override
    public void registrarInteressado(ObservadorControle o) {
        interessados.add(o);
    }
}
