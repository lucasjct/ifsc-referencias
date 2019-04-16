/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listacompras;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {
        Produto banana = new Produto(2.99, 4);
        Produto morango = new Produto(0.5, 8);
        Produto chocolate = new Produto(37, 1);
        
        ListaCompras lista = new ListaCompras();
        
        lista.registrar(banana);
        lista.registrar(morango);
        
        lista.pronta();
        
        lista.registrar(chocolate);
        
        System.out.println(lista.maisCaro().equals(banana));
        System.out.println(lista.maisComprado().equals(morango));
    }
    
}
