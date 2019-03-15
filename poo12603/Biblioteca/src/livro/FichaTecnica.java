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
public class FichaTecnica extends Comparavel {
    public final String nome, autor;
    public final int edicao;
        
    public FichaTecnica(String n, String a, int ed) {
        nome = n;
        autor = a;
        edicao = ed;
    }

    @Override
    public FichaTecnica id() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Identidade) {
            FichaTecnica outra = ((Identidade) obj).id();
            return nome.equals(outra.nome) && autor.equals(outra.autor) && edicao == outra.edicao;
        }
        return false;
    }
}
