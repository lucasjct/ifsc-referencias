/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Professor
 */
public class PainelLogin extends JPanel {
    
    private static final Dimension dimCampo = new Dimension(100, 20);
    
    private final JLabel usuario, senha;
    private final JTextField cUsuario;
    private final JPasswordField cSenha;
    private final JButton confirmar;
    
    public PainelLogin(ActionListener interessado) {
        usuario = new JLabel("Usuário: ");
        senha = new JLabel("Senha: ");
        
        cUsuario = new JTextField();
        cSenha = new JPasswordField();
        
        cUsuario.setPreferredSize(dimCampo);
        cSenha.setPreferredSize(dimCampo);
        
        confirmar = new JButton("Login");
        confirmar.addActionListener(interessado);
        
        add(usuario);
        add(cUsuario);
        add(senha);
        add(cSenha);
        add(confirmar);
    }

    String usuario() {
        return cUsuario.getText();
    }

    String senha() {
        return new String(cSenha.getPassword());
    }

}
