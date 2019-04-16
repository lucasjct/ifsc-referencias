/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listachamada;

/**
 * @author aluno
 */
public class ListaChamada {
    public final EntradaLista[] entradas;
    private int quantidade;
    
    public ListaChamada(int i) {
        entradas = new EntradaLista[i];
        quantidade = 0;
    }
    
    public int quantosAlunos() {
        return quantidade;
    }
    
    public void receber(String n) {
        if(quantidade < entradas.length) {
            entradas[quantidade] = new EntradaLista(n);
            quantidade++;
        }
    }
}
