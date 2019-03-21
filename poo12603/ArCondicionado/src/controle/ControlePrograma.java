/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Sala;
import visao.MenuPrincipal;

/**
 *
 * @author aluno
 */
public class ControlePrograma extends ControleAbstrato {
    private final Sala sala;
    private final MenuPrincipal menuPrincipal;
    
    public ControlePrograma(Sala s) {
        sala = s;
        menuPrincipal = new MenuPrincipal();
    }

    public void executar() {
        do {
            // ...
            menuPrincipal.mostrar();
        }while(lerBoolean());
    }
    
}
