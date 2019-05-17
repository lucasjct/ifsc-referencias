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
public class Moeda {
    public final String nome;
    public final double conversao;
    
    public Moeda(String n, double c) {
        nome = n;
        conversao = c;
        testeConstrutor();
    }
    
    private void testeConstrutor() {
        if(nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome da moeda não pode ser vazio");
        if(conversao < 0)
            throw new IllegalArgumentException("Valor de conversão não pode ser menor que zero");
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Moeda))
            return false;
        Moeda outra = (Moeda) o;
        return nome.equals(outra.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
