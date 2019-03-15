/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

/**
 *
 * @author aluno
 */
public class Livro extends Comparavel {
    public final FichaTecnica ficha;
    public final GeneroLivro genero;
    public final int ano;
    
    public Livro(FichaTecnica f, GeneroLivro g, int a) {
        ficha = f;
        genero = g;
        ano = a;
    }

    @Override
    public FichaTecnica id() {
        return ficha;
    }
}
