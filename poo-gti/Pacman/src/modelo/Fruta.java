/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Professor
 */
public class Fruta {
    private boolean coletada;
    private final String nome;
    private final int pontuacao;
    
    public Fruta(String n, int p) {
        coletada = false;
        nome = n;
        pontuacao = p;
    }
    
    public String qualNome() {
        return nome;
    }
    
    public int coletar() {
        if(coletada)
            return 0;
        coletada = true;
        return pontuacao;
    }
}
