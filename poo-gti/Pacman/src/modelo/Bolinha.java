/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Professor
 */
public class Bolinha {
    private boolean coletada;
    
    public Bolinha() {
        coletada = false;
    }
    
    public int coletar() {
        if(coletada)
            return 0;
        coletada = true;
        return 100;
    }
}
