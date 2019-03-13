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
public abstract class Componente implements Instalavel, Identificavel {
    private boolean instalado;
    private final String nome;
    
    public Componente(String n) {
        nome = n;
        instalado = false;
    }
    
    @Override
    public String nome() {
        return nome;
    }
    
    @Override
    public boolean instalado() {
        return instalado;
    }
}
