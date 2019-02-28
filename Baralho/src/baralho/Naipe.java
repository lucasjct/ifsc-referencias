/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 * Uma representacao de todos os possiveis Naipes de baralhos tradicionais.
 * @author alexandre
 */
public enum Naipe {
    OURO("Ouro", 0),
    ESPADAS("Espadas", 1),
    COPAS("Copas", 2),
    PAUS("Paus", 3);
    
    public final String nome;
    public final int ordem;
    
    /***
     * Um construtor privado para os enums que inicializa todas as constantes
     * @param n O nome do Naipe.
     * @param o Uma ordem dada ao Naipe
     */
    private Naipe(String n, int o) {
        nome = n;
        ordem = o;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
