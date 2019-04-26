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
        for(Totem t : CamadaPersistencia.totem.totens)
            System.out.println(t.rua);
    }
}
