/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prateleira;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ConstrutorIndices {

    private static Indice criaParaIndice(EnumIndice i) {
        switch(i) {
            case ANO:
                return new IndiceAno();
            case AUTOR:
                return new IndiceAutor();
            case GENERO:
                return new IndiceGenero();
        }
        throw new UnsupportedOperationException("Construtor para esse tipo de indice nao foi criado ainda.");
    }
    
    private ConstrutorIndices(){}
    
    public static ArrayList<Indice> criarIndices() {
        ArrayList<Indice> indices = new ArrayList<>();
        for(EnumIndice i : EnumIndice.values())
            indices.add(criaParaIndice(i));
        return indices;
    }
}
