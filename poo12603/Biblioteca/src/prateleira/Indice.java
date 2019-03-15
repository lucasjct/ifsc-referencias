/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prateleira;

import livro.Livro;

/**
 *
 * @author aluno
 */
public abstract class Indice implements InterfaceIndice {
    protected abstract ColecaoLivros acharColecao(Livro livro);
    protected abstract void adicionarIndice(Livro livro, ColecaoLivros colecao);
    
    @Override
    public boolean adicionar(Livro livro) {
        ColecaoLivros colecao = acharColecao(livro);
        
        if(colecao == null) {
            colecao = new ColecaoLivros();
            adicionarIndice(livro, colecao);
        }
        
        return colecao.adicionar(livro);
    }
}
