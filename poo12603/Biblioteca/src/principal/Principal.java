/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import livro.FichaTecnica;
import livro.GeneroLivro;
import livro.Livro;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FichaTecnica ficha = new FichaTecnica("Nome", "Autor", 1);
        FichaTecnica ficha2 = new FichaTecnica("Nome", "Autor", 1);
        
        Livro livro = new Livro(ficha2, GeneroLivro.FANTASIA, 1999);
        
        System.out.println(livro.equals(ficha));
        System.out.println(ficha.equals(livro));
        System.out.println(ficha2.equals(ficha));
        System.out.println(livro.equals(ficha2));
    }
    
}
