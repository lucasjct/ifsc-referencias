/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaveis;

import modelo.SacoOuro;
import modelo.Joia;
import java.util.ArrayList;
import java.util.Collections;
import modelo.ItemValioso;

/**
 *
 * @author alexandre
 */
public class Comparaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ItemValioso> valiosos = new ArrayList();
        
        valiosos.add(new Joia()); // Uma joia
        valiosos.add(new SacoOuro(false));  // Um saco de ouro pela metade
        valiosos.add(new SacoOuro(true)); // Um saco de ouro cheio
        
        Collections.sort(valiosos); // Método da Collections.sort organiza os elementos de uma lista pelo seu compareTo
        
        // A lista estará ordenada do item com o menor valor para o item com maior valor, trocando os objetos de posição para a seguinte ordem:
        // Saco metade, Saco cheio, Joia
        for(ItemValioso v : valiosos) {
            System.out.println(v);
        }
    }
    
}
