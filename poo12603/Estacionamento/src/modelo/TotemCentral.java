/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author aluno
 */
public class TotemCentral {
    
    private final HashMap<String, Totem> totens;
    private final HashMap<String, Carro> carros;
    
    public TotemCentral() {
        totens = new HashMap();
        carros = new HashMap();
    }
    
    public void novoTotem(String rua) {
        totens.put(rua, new Totem(rua));
    }
    
    public ArrayList<String> ruas() {
        return new ArrayList(totens.keySet());
    }
    
    public void novoCarro(String placa) {
        carros.put(placa, new Carro(placa));
    }
    
    public ArrayList<String> placas() {
        return new ArrayList(carros.keySet());
    }
    
    public void estacionar(String placa, String rua) {
        if(!carros.containsKey(placa) && !totens.containsKey(rua))
            return;
        Carro carro = carros.get(placa);
        Totem totem = totens.get(rua);
        
        carro.estacionar(totem);
    }
    
    public void sairEstacionamento(String placa) {
        if(!carros.containsKey(placa))
            return;
        Carro carro = carros.get(placa);
        carro.sair();
    }
    
    public void passarTempo() {
        for(Totem t : totens.values())
            t.incrementaHora();
    }
    
    public void salvar() {
    }
}
