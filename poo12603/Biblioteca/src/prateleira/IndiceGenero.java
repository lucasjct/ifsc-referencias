/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prateleira;

import java.util.HashMap;
import livro.GeneroLivro;
import livro.Livro;

/**
 *
 * @author aluno
 */
public class IndiceGenero extends Indice {
    public final HashMap<GeneroLivro, ColecaoLivros> indice;
    
    public IndiceGenero() {
        indice = new HashMap();
    }
    
    @Override
    protected ColecaoLivros acharColecao(Livro livro) {
        return indice.get(livro.genero);
    }

    @Override
    protected void adicionarIndice(Livro livro, ColecaoLivros colecao) {
        indice.put(livro.genero, colecao);
    }
}
