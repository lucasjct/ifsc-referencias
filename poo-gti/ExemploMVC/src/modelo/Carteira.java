/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controle.contratos.InteressadoMoedas;
import controle.contratos.FonteMoedas;
import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public class Carteira implements FonteMoedas {
    private final ArrayList<Moeda> moedas;
    
    private final ArrayList<InteressadoMoedas> observadores;
    
    public Carteira() {
        moedas = new ArrayList();
        observadores = new ArrayList();
    }
    
    @Override
    public ArrayList<String> nomeMoedas() {
        ArrayList<String> ret = new ArrayList();
        
        for(Moeda m : moedas)
            ret.add(m.toString());
        
        return ret;
    }
    
    public void novaMoeda(Moeda m) {
        if(m != null && !moedas.contains(m)) {
            moedas.add(m);
            alertarNovaMoeda();
        }
    }
    
    private void alertarNovaMoeda() {
        for(InteressadoMoedas i : observadores)
            i.atualizarMoedas();
    }

    @Override
    public void adicionarInteressado(InteressadoMoedas i) {
        observadores.add(i);
    }

    public Moeda moedaNoIndice(int i) {
        return moedas.get(i);
    }
}
