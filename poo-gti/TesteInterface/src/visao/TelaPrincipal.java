/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Professor
 */
public class TelaPrincipal extends JFrame {
   
    private final PainelLogin login;
    
    public TelaPrincipal(ActionListener interessado) {
        setSize(400, 400);
        setTitle("Tela Principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        login = new PainelLogin(interessado);
        add(login);
    }

    public String obterUsuario() {
        return login.usuario();
    }

    public String obterSenha() {
        return login.senha();
    }
}
