/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandre
 */
public class ControleTemperatura implements Atuador {

    @Override
    public void atuar(int comando) {
        ComandosControleTemperatura cmd = ComandosControleTemperatura.converter(comando);
        
        switch(cmd){
            case ESQUENTAR:
                System.out.println("\t\tA temperatura vai aumentar.");
                break;
            default:
                System.out.println("\t\tA temperatura se mantém.");
                break;
        }
    }
    
}
