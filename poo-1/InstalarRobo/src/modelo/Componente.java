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
    
    public Componente(String nome) {
        // Implementar este construtor
    }
    
    @Override
    public String nome() {
        return ""; // Implementar este método corretamente
    }
    
    @Override
    public boolean instalado() {
        return false; // Implementar este método corretamente
    }
}
