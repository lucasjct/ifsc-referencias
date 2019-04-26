/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import modelo.Totem;
import modelo.TotemCentral;
import persistencia.CamadaPersistencia;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TotemCentral fachada = new TotemCentral();
        
        for(String rua : fachada.ruas())
            System.out.println(rua);
        
        fachada.novoCarro("AAA1234");
        fachada.novoCarro("BBB1234");
        fachada.estacionar(fachada.placas().get(0), fachada.ruas().get(0));
        fachada.estacionar(fachada.placas().get(1), fachada.ruas().get(1));
        fachada.passarTempo();
        fachada.sairEstacionamento(fachada.placas().get(0));
        fachada.passarTempo();
        fachada.sairEstacionamento(fachada.placas().get(1));
        
        fachada.salvar();
        
    }
}
