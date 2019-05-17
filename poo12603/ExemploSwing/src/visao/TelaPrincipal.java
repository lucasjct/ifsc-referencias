/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends JFrame implements ActionListener {
    
    private JLabel lTexto, lSenha, lMensagens;
    private JTextField cUsuario;
    private JPasswordField cSenha;
    private JButton botaoConfirmar;
    
    private void iniciarComponentes() {
        lTexto = new JLabel("Usuário: ");
        lSenha = new JLabel("Senha: ");
        
        add(lTexto);
        
        cUsuario = new JTextField();
        cUsuario.setPreferredSize(new Dimension(100, 25));
        add(cUsuario);
        
        cSenha = new JPasswordField();
        add(lSenha);
        
        cSenha.setPreferredSize(new Dimension(100, 25));
        add(cSenha);
        
        botaoConfirmar = new JButton("Login");
        botaoConfirmar.addActionListener(this);
        add(botaoConfirmar);
        
        lMensagens = new JLabel();
        add(lMensagens);
    }
    
    public TelaPrincipal() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        
        iniciarComponentes();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lMensagens.setText(cUsuario.getText() + " " + new String(cSenha.getPassword()));
    }
}
