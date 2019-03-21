/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Lampada;
import modelo.ObservadorLampada;

/**
 *
 * @author aluno
 */
public class UILampadaAlternativa implements ObservadorLampada {
    
    private Lampada lampada;
    
    public UILampadaAlternativa(Lampada l) {
        lampada = l;
        lampada.registrarObservador(this);
    }
    
    public void representar() {
        if(lampada.obterEstado())
            JOptionPane.showMessageDialog(null, "A lampada ligou");
        else
            JOptionPane.showMessageDialog(null, "A lampada desligou");
    }

    @Override
    public void estadoMudou() {
        representar();
    }
    
}
