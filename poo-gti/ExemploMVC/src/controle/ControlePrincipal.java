/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Carteira;
import visao.telas.TelaPrincipal;

/**
 *
 * @author alexandre
 */
public class ControlePrincipal {
    private final TelaPrincipal tela;
    
    private final ControleNovaMoeda novaMoeda;
    private final ControleSelecaoMoeda selecionarMoeda;
    
    private final Carteira carteira;
    
    public ControlePrincipal() {
        carteira = new Carteira();
        tela = new TelaPrincipal(carteira);
        
        novaMoeda = new ControleNovaMoeda(carteira, tela.fonteNovasMoedas());
        selecionarMoeda = new ControleSelecaoMoeda(carteira, tela.seletorMoeda());
    }
    
    public void comecar() {
        tela.setVisible(true);
    }
}
