/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.arcondicionado.ControleArCondicionado;
import modelo.arcondicionado.EnumBotoes;
import visao.UIControle;

/**
 *
 * @author aluno
 */
public class ControleControleArCondicionado extends ControleAbstrato {
    private final UIControle visao;
    private final ControleArCondicionado modelo;

    public ControleControleArCondicionado(ControleArCondicionado c) {
        modelo = c;
        this.visao = new UIControle(c);
    }
    
    public void executar() {
        EnumBotoes botao = null;
        
        visao.mostrar();
        botao = EnumBotoes.transforma(lerInt());
        if(botao == null)
            visao.mostrarAcaoNula();
        else
            modelo.pressionar(botao);
    }
    
}
