/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prateleira;

import java.util.ArrayList;
import livro.Livro;

/**
 *
 * @author aluno
 */
public class ColecaoLivros implements InterfaceIndice {
    private final ArrayList<Livro> livros;
    
    public ColecaoLivros() {
        livros = new ArrayList();
    }
    
    @Override
    public boolean adicionar(Livro l) {
        if(livros.contains(l))
            return false;
        livros.add(l);
        return true;
    }
    
    public void remover(Livro l) {
        livros.remove(l);
    }
}
