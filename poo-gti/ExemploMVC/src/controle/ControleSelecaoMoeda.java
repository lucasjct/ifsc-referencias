/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controle.contratos.SeletorMoeda;
import controle.contratos.InteressadoSeletorMoeda;
import modelo.Carteira;
import modelo.Moeda;

/**
 *
 * @author alexandre
 */
public class ControleSelecaoMoeda implements InteressadoSeletorMoeda {
    
    protected final Carteira carteira;  
    protected final SeletorMoeda seletor;
    
    ControleSelecaoMoeda(Carteira c, SeletorMoeda s) {
        carteira = c;
        seletor = s;
        seletor.indicarInteressado(this);
    }

    @Override
    public void ocorreuSelecao(int i) {
        if(i < 0){
            seletor.moedaSelecionada(null);
            return;
        }
        
        final Moeda destaque = carteira.moedaNoIndice(i);
        seletor.moedaSelecionada(destaque);
    }
}
