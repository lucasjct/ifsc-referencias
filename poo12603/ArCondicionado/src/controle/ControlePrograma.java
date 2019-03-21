/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.fachada.Sala;
import visao.MenuPrincipal;
import visao.UIArCondicionado;

/**
 *
 * @author aluno
 */
public class ControlePrograma extends ControleAbstrato {
    private final Sala sala;
    private final MenuPrincipal menuPrincipal;
    private final UIArCondicionado visaoAr;
    
    private final ControleControleArCondicionado controle;
    private final ControleDisjuntor disjuntor;
    
    public ControlePrograma(Sala s) {
        sala = s;
        menuPrincipal = new MenuPrincipal();
        controle = new ControleControleArCondicionado(sala.controle);
        disjuntor = new ControleDisjuntor(sala.disjuntor);
        visaoAr = new UIArCondicionado(sala.ar);
    }

    public void executar() {
        do {
            menuPrincipal.mostrar();
            int acao = lerInt();
            
            switch(acao) {
                case 0:
                    controle.executar();
                    break;
                case 1:
                    disjuntor.executar();
                    break;
                default:
                    menuPrincipal.mostrarAcaoNulaTomada();
            }
            menuPrincipal.loop();
        }while(lerBoolean());
    }
    
}
