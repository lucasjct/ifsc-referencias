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
public class PainelControle {
    protected final SmartBox controlada;
    
    PainelControle(SmartBox c) {
        controlada = c;
    }
    
    public void aumentarVolume() {
        controlada.aumentarVolume();
    }
    
    public void diminuirVolume() {
        controlada.diminuirVolume();
    }
    
    public void proximoCanal() {
        controlada.proximoCanal();
    }
    
    public void canalAnterior() {
        controlada.canalAnterior();
    }
}
