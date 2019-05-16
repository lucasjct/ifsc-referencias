/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import visao.TelaPrincipal;

/**
 *
 * @author Professor
 */
public class ControleTelaPrincipal implements ActionListener {
    private final TelaPrincipal tela;
    
    public ControleTelaPrincipal() {
        tela = new TelaPrincipal(this);
    }
    
    public void mostrar() {
        tela.setVisible(true);
    }
    
    public void esconder() {
        tela.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Usuario: " + tela.obterUsuario() + " senha: " + tela.obterSenha());
    }
}
