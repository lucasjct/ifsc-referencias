/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.TentativaLogin;

/**
 *
 * @author aluno
 */
public class FormularioLogin extends JPanel implements ActionListener {
    
    private JLabel textoUsuario, textoSenha;
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton confirmar;
    
    private void inicializarLabels() {
        textoUsuario = new JLabel("Usuario");
        textoSenha = new JLabel("Senha");

        textoUsuario.setSize(60,15);
        textoUsuario.setLocation(30, 30);
        
        textoSenha.setSize(60,15);
        textoSenha.setLocation(30, 60);
        
        add(textoUsuario);
        add(textoSenha);
    }
    
    private void inicializarCampos() {
        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();
        
        campoUsuario.setSize(100, 15);
        campoUsuario.setLocation(textoUsuario.getLocation().x + textoUsuario.getSize().width + 15, textoUsuario.getLocation().y);
   
        campoSenha.setSize(100, 15);
        campoSenha.setLocation(textoSenha.getLocation().x + textoSenha.getSize().width + 15, textoSenha.getLocation().y);
        
        add(campoUsuario);
        add(campoSenha);
    }
    
    private void inicializarBotao() {
        confirmar = new JButton("Login");
        
        confirmar.setSize(100, 20);
        confirmar.setLocation(campoSenha.getLocation().x, campoSenha.getLocation().y + 30);
        
        confirmar.addActionListener(this);
        
        add(confirmar);
    }
    
    private void inicializarComponentes() {
        inicializarLabels();
        inicializarCampos();
        inicializarBotao();
    }
    
    public FormularioLogin() {
        setLayout(null);
        
        setSize(400, 400);
        
        inicializarComponentes();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final String usuario = campoUsuario.getText();
        final String senha = new String(campoSenha.getPassword());
        
        TentativaLogin tentativa = new TentativaLogin(usuario, senha);
        TentativaLogin correto = new TentativaLogin("poo", "jiu");
        System.out.println(tentativa.equals(correto));
    }
}
