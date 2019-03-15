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
public abstract class Comparavel implements Identificavel {

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Identidade))
            return false;
        Identidade i = (Identidade) obj;
        return mesmaIdentidade(i);
    }

    @Override
    public boolean mesmaIdentidade(Identidade i) {
        return id().equals(i);
    }
}
