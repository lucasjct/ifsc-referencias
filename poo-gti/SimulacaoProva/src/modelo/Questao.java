/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Questao {
    public final TipoQuestao tipo;
    public final String enunciado;
    
    private boolean respondida;
    private final ArrayList<Alternativa> alternativas;
    
    public Questao(String e, TipoQuestao t) {
        enunciado = e;
        tipo = t;
        respondida = false;
        alternativas = new ArrayList();
    }

    public void adicionar(Alternativa a) {
        if(!respondida && tipo == a.tipo) // Só pode adicionar a alternativa na questão se a questão ainda não foi respondida e se a alternativa é de tipo compatível com a questão.
            alternativas.add(a);
    }
    
    public void responder(int i, boolean marca) {
        alternativas.get(i).assinalar(marca);
        respondida = true;
    }
    
    public void responder(int i) {
        alternativas.get(i).selecionar();
        respondida = true;
    }
    
    public boolean acertou() {
        // Se ao menos uma alternativa foi respondida de maneira errada, a questão toda está errada.
        for(Alternativa a : alternativas)
            if(!a.correto())
                return false;
        return true;
    }

    @Override
    public String toString() {
        String s = "\t" + enunciado + "\n";
        int i = 0;
        for(Alternativa a : alternativas)
            s += "\t\t" + (char)('A'+i++) + ") " + a.toString() + "\n";
        return s;
    }
    
}
