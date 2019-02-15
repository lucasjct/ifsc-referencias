/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class ColecaoItens {
    public final Item todos[];
    
    public ColecaoItens() {
        todos = new Item[5];
        
        todos[0] = new ItemEstadoIncremental("Cogumelo Vermelho", true, false, true, false, 1);
        todos[1] = new ItemEstadoIncremental("Flor Fogo", true, false, true, true, 2);
        todos[2] = new ItemIndependenteEstado("Yoshi", true, false, false, true);
        todos[3] = new ItemEstadoIncremental("Pena", true, true, true, true, 2);
        todos[4] = new ItemColecionavel("Moeda", true, true, false, false);
    }
}
