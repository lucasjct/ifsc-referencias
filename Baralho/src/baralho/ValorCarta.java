/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 * A representacao de todos os possiveis valores de carta em um baralho tradicional.
 * @author alexandre
 */
public enum ValorCarta {
    AS("Ás", 0),
    DOIS("Dois", 1),
    TRES("Três", 2),
    QUATRO("Quatro", 3),
    CINCO("Cinco", 4),
    SEIS("Seis", 5),
    SETE("Sete", 6),
    OITO("Oito", 7),
    NOVE("Nove", 8),
    DEZ("Dez", 9),
    VALETE("Valete", 10),
    DAMA("Dama", 11),
    REI("Rei", 11);
    
    public final String nome;
    public final int ordem;
    
    /***
     * Um construtor privado do enumerado de valores possiveis de cartas.
     * @param n Um nome para o valor.
     * @param o Um valor para construir uma ordem crescente.
     */
    private ValorCarta(String n, int o) {
        nome = n;
        ordem = o;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
