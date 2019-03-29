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
public class Territorio {
    public final String nome;
    
    public Territorio(String n) {
        nome = n;
    }

    @Override
    public String toString() {
        return nome;
    }
}
