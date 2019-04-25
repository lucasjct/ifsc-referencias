/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import modelo.Totem;
import modelo.TotemCentral;

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
        
        fachada.novoCarro("AAA");
        fachada.novoTotem("Rua B");
        
        fachada.estacionar("AAA", "Rua B");
        fachada.passarTempo();
        fachada.sairEstacionamento("AAA");
    }
    
}
