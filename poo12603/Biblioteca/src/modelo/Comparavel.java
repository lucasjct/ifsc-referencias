/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public abstract class Comparavel implements Identificavel {

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Identificavel))
            return false;
        Identificavel i = (Identificavel) obj;
        return mesmaIdentidade(i);
    }

    @Override
    public boolean mesmaIdentidade(Identificavel i) {
        return id().equals(i.id());
    }
}
