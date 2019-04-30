/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.smartbox;

/**
 *
 * @author aluno
 */
public class ControleRemoto extends PainelControle {

    public ControleRemoto(SmartBox c) {
        super(c);
    }
    
    public void mudarCanal(int n) {
        controlada.mudarCanal(n);
    }
    
    public void mudarVolume(int n) {
        controlada.mudarVolume(n);
    }
}
