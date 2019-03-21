/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

import java.awt.Point;

/**
 *
 * @author aluno
 */
public class Exemplo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pescador pescador = new Pescador();
        
        InterfaceComUsuario.informe("Era uma vez um pescador...");
        pescador.mentiroso = InterfaceComUsuario.leiaBoolean("\tDigite 0 para que ele seja mentiroso.");
        InterfaceComUsuario.informe((pescador.mentiroso)? "... mentiroso." : "... honesto.");
        InterfaceComUsuario.informe("Ele foi pescar...");
        
        while(InterfaceComUsuario.leiaBoolean("Digite 0 para pescar um peixe.")) {
            Peixe peixe = new Peixe();
            InterfaceComUsuario.informe("\tUm novo peixe foi pescado.");
            peixe.peso = InterfaceComUsuario.leiaInt("\tDigite o peso do Peixe:");
            pescador.pescar(peixe);
        }
        InterfaceComUsuario.informe("\nA pescaria acabou.\n");
        InterfaceComUsuario.informe("O pescador diz que pescou " + pescador.quantoPescou() + " kilos de peixe.");
    }
    
}
