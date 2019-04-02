/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enumerados;

import java.util.Scanner;
import modelo.Dinheiro;
import modelo.Moeda;

/**
 *
 * @author aluno
 */
public class Enumerados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dinheiro d;
        
        d = new Dinheiro(Moeda.values()[sc.nextInt()], sc.nextDouble());
        
        System.out.println(d.valor(Moeda.values()[sc.nextInt()]));
    }
    
}
