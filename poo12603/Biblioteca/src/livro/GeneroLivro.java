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
public enum GeneroLivro {
    TERROR("Terror"),
    FANTASIA("Fantasia"),
    FICCAO_CIENTIFICA("Ficção Científica");
    
    private final String nome;
    
    private GeneroLivro(String n) {
        nome = n;
    }

    @Override
    public String toString() {
        return nome;
    }
}
