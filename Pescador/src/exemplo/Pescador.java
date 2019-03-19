/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

/**
 *
 * @author aluno
 */
public class Pescador {
    boolean mentiroso;
    int pesca;
    
    void pescar(Peixe p) {
        pesca += p.peso;
    }
    
    int quantoPescou() {
        if(mentiroso)
            return 2*pesca;
        else
            return pesca;
    }
}
