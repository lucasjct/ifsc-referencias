/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.paineis.principal;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alexandre
 */
public abstract class PainelMostrarMoeda extends JPanel {
    
    protected final static Dimension dmsCampos = new Dimension(120, 30);
    protected final static Dimension dmsMargemH = new Dimension(10, 0);
    protected final static Dimension dmsMargemV = new Dimension(0, 10);
    protected final static Dimension dmsAjuste = new Dimension(32, 0);
    
    protected JLabel lNome, lValor;
    protected JTextField cNome, cValor;
    
    protected JPanel pNome, pValor;
    
    protected void configurarPaineis() {
        pNome = new JPanel();
        pValor = new JPanel();
        
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        pNome.setLayout(new BoxLayout(pNome, BoxLayout.LINE_AXIS));
        pValor.setLayout(new BoxLayout(pValor, BoxLayout.LINE_AXIS));
    }
    
    protected void iniciarComponentes() {
        configurarPaineis();
        
        lNome = new JLabel("Nome: ");
        lValor = new JLabel("Conversão: ");
        
        cNome = new JTextField();
        cValor = new JTextField();
        
        cNome.setPreferredSize(dmsCampos);
        cValor.setPreferredSize(dmsCampos);
    }
    
    protected void adicionarSubPainel(JPanel painel, JLabel label, JTextField campo, boolean ajuste) {
        painel.add(Box.createRigidArea(dmsMargemH));
        painel.add(label);
        
        if(ajuste)
            painel.add(Box.createRigidArea(dmsAjuste));
        
        painel.add(campo);
        painel.add(Box.createRigidArea(dmsMargemH));
        
        add(Box.createRigidArea(dmsMargemV));
        add(painel);
    }
    
    protected void adicionarComponentes() {
        adicionarSubPainel(pNome, lNome, cNome, true);
        adicionarSubPainel(pValor, lValor, cValor, false);
    }
    
    public PainelMostrarMoeda() {
        iniciarComponentes();
        adicionarComponentes();
    }
    
}
