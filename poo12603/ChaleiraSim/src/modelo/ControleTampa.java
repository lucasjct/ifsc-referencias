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
class ControleTampa implements Atuador {
    @Override
    public void atuar(int comando) {
        ComandosControleTampa cmd = ComandosControleTampa.converter(comando);
        
        switch(cmd){
            case SOLTARVAPOR:
                System.out.println("\t\tA chaleira soltou vapor.");
                break;
            default:
                System.out.println("\t\tA tampa abriu.");
                break;
        }
    }
    
}
