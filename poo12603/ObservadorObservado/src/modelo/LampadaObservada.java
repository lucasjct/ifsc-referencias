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
public interface LampadaObservada {
    public void ligar();
    public void desligar();
    
    public void registrarObservador(ObservadorLampada l);
    public void removerObservador(ObservadorLampada l);
}
