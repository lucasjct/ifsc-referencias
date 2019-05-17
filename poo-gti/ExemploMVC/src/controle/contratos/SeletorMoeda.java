/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.contratos;

import modelo.Moeda;

/**
 *
 * @author alexandre
 */
public interface SeletorMoeda {
    public void moedaSelecionada(Moeda m);
    public void indicarInteressado(InteressadoSeletorMoeda i);
}
