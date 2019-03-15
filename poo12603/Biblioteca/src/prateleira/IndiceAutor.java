/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prateleira;

import java.util.HashMap;
import livro.Livro;

/**
 *
 * @author aluno
 */
public class IndiceAutor extends Indice {
    public final HashMap<String, ColecaoLivros> indice;
    
    public IndiceAutor() {
        indice = new HashMap();
    }
    
    @Override
    protected ColecaoLivros acharColecao(Livro livro) {
        return indice.get(livro.ficha.autor);
    }

    @Override
    protected void adicionarIndice(Livro livro, ColecaoLivros colecao) {
        indice.put(livro.ficha.autor, colecao);
    }
}
