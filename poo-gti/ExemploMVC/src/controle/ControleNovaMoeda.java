/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controle.contratos.RegistroNovasMoedas;
import java.awt.event.ActionEvent;
import modelo.Carteira;
import controle.contratos.FabricaMoeda;
import modelo.Moeda;

/**
 *
 * @author alexandre
 */
class ControleNovaMoeda implements RegistroNovasMoedas {

    protected final Carteira carteira;

    ControleNovaMoeda(Carteira c, FabricaMoeda f) {
        carteira = c;
        f.indicarInteressado(this);
    }

    @Override
    public void novaMoeda(FabricaMoeda f) {
        final Moeda m = f.novaMoeda();
        if(m != null)
            carteira.novaMoeda(m);
        f.prepararParaNovaMoeda();
    }
}
