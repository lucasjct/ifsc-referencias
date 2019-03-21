/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadorobservado;

import modelo.Lampada;
import visao.UILampada;
import visao.UILampadaAlternativa;

/**
 *
 * @author aluno
 */
public class ObservadorObservado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada modelo = new Lampada();
        
        UILampadaAlternativa lampada = new UILampadaAlternativa(modelo);
        
        modelo.ligar();
        modelo.desligar();
    }
    
}
