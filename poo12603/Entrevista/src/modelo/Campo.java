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
public enum Campo {
    MALANDRAGEM("Malandragem"),
    ALGORITMOS("Algoritmos"),
    DEEP_LEARNING("Redes Neurais Convolucionais"),
    MODELOS_PROBABILISTICO("Modelos Probabilisticos");
    
    public final String nome;
    
    private Campo(String n) {
        nome = n;
    }
    
    public static Campo comId(int i) {
        if(i < 0 || i >= Campo.values().length)
            return null;
        return Campo.values()[i];
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
