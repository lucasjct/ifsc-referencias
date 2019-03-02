/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacomluzesportas;

public class Luz {
    private Cor cor;
    private boolean acesa, quebrada;
    
    public Luz(Cor c) {
        cor = c;
        acesa = false;
        quebrada = false;
    }
    
    public Cor qualCor() {
        return cor;
    }
    
    public boolean estaAcesa() {
        return acesa;
    }
    
    public boolean estaQuebrada() {
        return quebrada;
    }
    
    public void acender() {
        if(!quebrada)
            acesa = true;
    }
    
    public void apagar() {
        acesa = false;
    }
}
