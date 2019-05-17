/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.contratos;

import controle.contratos.RegistroNovasMoedas;
import modelo.Moeda;

/**
 *
 * @author alexandre
 */
public interface FabricaMoeda {
    public Moeda novaMoeda();
    public void prepararParaNovaMoeda();
    
    public void indicarInteressado(RegistroNovasMoedas m);
}
