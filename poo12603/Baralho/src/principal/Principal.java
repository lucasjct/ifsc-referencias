/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import baralho.Baralho;
import baralho.Carta;
import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public class Principal {
    
    
    public static void main(String [] args) {
        ArrayList<Carta> baralho = Baralho.completo();
        System.out.println("Um baralho completo tem " + baralho.size() + " cartas.");
        System.out.println("Elas são: " + baralho);
    }
}
