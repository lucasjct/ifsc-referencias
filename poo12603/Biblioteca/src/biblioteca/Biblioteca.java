/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import livro.Livro;
import prateleira.ConstrutorIndices;
import prateleira.Indice;
import prateleira.IndiceAno;
import prateleira.IndiceAutor;
import prateleira.IndiceGenero;

/**
 *
 * @author aluno
 */
public class Biblioteca {
    private final ArrayList<Indice> indices;
//    private final IndiceAutor indiceAutor;
//    private final IndiceGenero indiceGenero;
//    private final IndiceAno indiceAno;
//    
    public Biblioteca() {
        indices = ConstrutorIndices.criarIndices();
//        indiceAno = new IndiceAno();
//        indiceGenero = new IndiceGenero();
//        indiceAutor = new IndiceAutor();
    }
    
    public void registrarLivro(Livro livro) {
//        indiceAno.adicionar(livro);
//        indiceAutor.adicionar(livro);
//        indiceGenero.adicionar(livro);
        for(Indice i : indices)
            i.adicionar(livro);
    }
}
