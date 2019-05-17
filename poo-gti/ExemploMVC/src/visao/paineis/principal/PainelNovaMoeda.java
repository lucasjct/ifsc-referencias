/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.paineis.principal;

import controle.contratos.RegistroNovasMoedas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import controle.contratos.FabricaMoeda;
import modelo.Moeda;

/**
 *
 * @author alexandre
 */
public class PainelNovaMoeda extends PainelMostrarMoeda implements FabricaMoeda, ActionListener {
    
    protected JButton botao;
    
    private RegistroNovasMoedas controle;
    
    private void adicionarBotao() {
        botao = new JButton("Criar");
        botao.addActionListener(this);
        
        add(Box.createRigidArea(dmsMargemV));
        add(botao);
    }
    
    public PainelNovaMoeda() {
        super();
        
        // Criação de borda
        TitledBorder borda = BorderFactory.createTitledBorder("Nova moeda");
        borda.setTitleJustification(TitledBorder.CENTER);
        setBorder(borda);
        // -----
        
        adicionarBotao();
    }
    
    @Override
    public Moeda novaMoeda() {
        double valor = 0;
        try {
            valor = Double.parseDouble(cValor.getText());
        }catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Digite um número para o valor de cotação.");
            return null;
        }
        try {
            return new Moeda(cNome.getText(), valor);
        } catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    @Override
    public void prepararParaNovaMoeda() {
        cNome.setText("");
        cValor.setText("");
    }

    public void registrarControleNovasMoedas(ActionListener a) {
        botao.addActionListener(a);
    }

    @Override
    public void indicarInteressado(RegistroNovasMoedas m) {
        controle = m;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        controle.novaMoeda(this);
    }
    
}
