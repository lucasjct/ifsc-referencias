/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public class Tabuleiro {
    private final ArrayList<Espaco> espacos;
    
    public Tabuleiro() {
        espacos = new ArrayList();
    }
    
    public void ajustar(int tamanho) {
        espacos.clear();
        do {
            espacos.add(new Espaco(EnumAchado.ESPACO));
        }while(espacos.size() < tamanho*tamanho);
    }
    
    public int tamanho() {
        return (int) Math.sqrt(espacos.size());
    }
    
    public Espaco espaco(int i) {
        return espacos.get(i);
    }
}
