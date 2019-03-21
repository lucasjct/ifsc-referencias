/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import modelo.arcondicionado.ControleArCondicionado;
import modelo.arcondicionado.EnumBotoes;

/**
 *
 * @author aluno
 */
public class UIControle {
    private final ControleArCondicionado controle;
    
    public UIControle(ControleArCondicionado c) {
        controle = c;
    }
    
    public void mostrar() {
        ArrayList<EnumBotoes> botoes = controle.obterBotoes();
        
        System.out.println("Interface para uso do controle:");
        for(int i = 0; i < botoes.size(); ++i)
            System.out.println("\t" + i + " -> " + botoes.get(i).toString());
    }

    public void mostrarAcaoNula() {
        System.out.println("Nenhuma ação tomada.");
    }
}
