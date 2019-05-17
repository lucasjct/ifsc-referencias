/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.paineis.principal;

import modelo.Moeda;

/**
 *
 * @author alexandre
 */
public class PainelDetalhesMoedas extends PainelMostrarMoeda {
    
    public PainelDetalhesMoedas() {
        super();
        
        cNome.setEditable(false);
        cValor.setEditable(false);
    }
    
    public void mostrarMoeda(Moeda m) {
        String nome = "";
        String conversao = "";
        if(m != null) {
            nome = m.nome;
            conversao = "" + m.conversao;
        }
        cNome.setText(nome);
        cValor.setText(conversao);
    }
}
