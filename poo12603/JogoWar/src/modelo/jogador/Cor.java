/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.jogador;

/**
 *
 * @author aluno
 */
public enum Cor {
    VERMELHO("Vermelho"),
    VERDE("Verde"),
    AMARELO("Amarelo"),
    AZUL("Azul");
    
    public final String nome;
    
    private Cor(String n) {
        nome = n;
    }
    
    public static Cor noIndice(int i) {
        if(i < 0 || i >= Cor.values().length)
            throw new IllegalArgumentException("Índice de Cor inválido.");
        return Cor.values()[i];
    }
}
