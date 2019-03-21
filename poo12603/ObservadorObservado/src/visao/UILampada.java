/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.Lampada;
import modelo.ObservadorLampada;

/**
 *
 * @author aluno
 */
public class UILampada implements ObservadorLampada {
    
    private Lampada lampada;
    
    public UILampada(Lampada l) {
        lampada = l;
        lampada.registrarObservador(this);
    }
    
    public void representar() {
        if(lampada.obterEstado())
            System.out.println("A lampada ligou");
        else
            System.out.println("A lampada desligou");
    }

    @Override
    public void estadoMudou() {
        representar();
    }
}
