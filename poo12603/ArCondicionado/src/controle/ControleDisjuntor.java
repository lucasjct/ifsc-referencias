/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import visao.UIDisjuntor;
import modelo.arcondicionado.Disjuntor;

/**
 *
 * @author aluno
 */
public class ControleDisjuntor extends ControleAbstrato {
    private final UIDisjuntor visao;
    private final Disjuntor modelo;
    
    public ControleDisjuntor(Disjuntor d) {
        modelo = d;
        visao = new UIDisjuntor(modelo);
    }
    
    public void executar() {
        EnumAcaoDisjuntor acao;
        
        visao.mostrar();
        
        acao = EnumAcaoDisjuntor.transforma(lerInt());
        
        switch(acao) {
            case DESLIGAR:
                modelo.desligar();
                break;
            case LIGAR:
                modelo.ligar();
                break;
            default:
                visao.mostrarAcaoNulaTomada();
        }
    }
}
