/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.telas;

import controle.contratos.SeletorMoeda;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Carteira;
import controle.contratos.FabricaMoeda;
import visao.paineis.principal.PainelMoedas;
import visao.paineis.principal.PainelNovaMoeda;

/**
 *
 * @author alexandre
 */
public class TelaPrincipal extends JFrame {
 
    private PainelMoedas moedas;
    private PainelNovaMoeda novasMoedas;
    
    public TelaPrincipal(Carteira c) {
        moedas = new PainelMoedas(c);
        novasMoedas = new PainelNovaMoeda();
        
        setSize(new Dimension(400,400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Registro de moedas estrangeiras");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        add(moedas);
        add(novasMoedas);
    }
    
    public FabricaMoeda fonteNovasMoedas() {
        return novasMoedas;
    }

    public void registrarControleNovasMoedas(ActionListener a) {
        novasMoedas.registrarControleNovasMoedas(a);
    }

    public SeletorMoeda seletorMoeda() {
        return moedas;
    }
}
