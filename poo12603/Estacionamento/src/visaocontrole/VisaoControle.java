/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaocontrole;

import java.util.ArrayList;
import modelo.TotemCentral;

/**
 *
 * @author aluno
 */
public abstract class VisaoControle extends InterfaceUsuarioTexto {
    protected final TotemCentral fachada;
    
    protected final ArrayList<String> opcoes;
    
    VisaoControle(TotemCentral t) {
        fachada = t;
        opcoes = new ArrayList();
    }
    
    
    protected void mostrarOpcoes() {
        for(int i = 0; i < opcoes.size(); ++i) {
            escrever(i + ": " + opcoes.get(i));
        }
    }
    
    protected void escolherOpcao() {
        int i = 0;
        do {
            mostrarOpcoes();
            escrever("Escolha uma ação: ");
            i = lerInt();
        } while(i < 0 || i >= opcoes.size());
        
        escolheuOpcao(i);
    }
    
    protected abstract void escolheuOpcao(int op);
}
