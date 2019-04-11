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
public enum Graduacao {
    MEDIO("Média"),
    BOM("Boa"),
    PROFICIENTE("Proeficiente"),
    MESTRE("Mestre"),
    VISIONARIO("Visionária"),
    SUPREMA("Suprema");
    
    public final String nome;
    
    private Graduacao(String n) {
        nome = n;
    }
    
    public static Graduacao comId(int i) {
        if(i < 0 || i >= Graduacao.values().length)
            return null;
        return Graduacao.values()[i];
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
