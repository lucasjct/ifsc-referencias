/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.ArrayList;

/***
 * Uma representacao da classe baralho que nao pode gerar objetos.
 * @author alexandre
 */
public class Baralho {

    /***
     * Um construtor privado para que não possam ser criados objetos da classe baralho.
     */
    private Baralho() {}
    
    /***
     * @return Uma lista de cartas que compoem um baralho tradicional sem coringas.
     */
    public static ArrayList<Carta> completo() {
        ArrayList<Carta> lista = new ArrayList();
        for(Naipe n : Naipe.values())
            for(ValorCarta v : ValorCarta.values())
                lista.add(new Carta(n, v));
        return lista;
    }
    
    /***
     * Cria um baralho de canastra não embaralhado para jogo.
     * @return Uma lista de cartas composto de dois baralho tradicionais sem coringas.
     */
    public static ArrayList<Carta> canastra() {
        ArrayList<Carta> lista = completo();
        lista.addAll(completo());
        return lista;
    }
}
