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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author aluno
 */
public class TelaLogin extends JFrame {
    
    private FormularioLogin formulario;
    
    private void inicializarComponentes() {
        formulario = new FormularioLogin();
        
        add(formulario);
    }
    
    public TelaLogin() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        inicializarComponentes();
        
        setPreferredSize(new Dimension(1000, 1000));
        pack();
        setVisible(true);
    }
}
