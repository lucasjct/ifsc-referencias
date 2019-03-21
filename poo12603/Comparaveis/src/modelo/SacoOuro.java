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
public class SacoOuro extends ItemValioso {
    private final boolean cheia;
    
    public SacoOuro(boolean c) {
        super(calculaValor(c));
        cheia = c;
    }
    
    private static int calculaValor(boolean cheia) {
        return (cheia)? 200 : 100; // Sacos cheios valem 200, sacos não-cheios valem 100
    }

    public String toString() {
        String textoMeio = (cheia)? "repleta de " : "até a metade com ";
        return "Uma sacola " + textoMeio + "ouro";
    }
}
