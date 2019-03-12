/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instalarrobo;

import modelo.Robo;

/**
 *
 * @author alexandre
 */
public class InstalarRobo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robo robo = new Robo();
        robo.instalar();
        
        // Verifica se o Robo foi instalado com sucesso.
        if(robo.instalado())
            System.out.println("Sucesso!");
    }
    
}
