/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import persistencia.CamadaPersistencia;

/**
 *
 * @author aluno
 */
public class Empresa {
    private final ArrayList<Veiculo> frota;
    private final ArrayList<Rua> ruas;
    
    public Empresa() {
        frota = new ArrayList();
        ruas = new ArrayList();
    }
    
    public void registrar(String placa, TipoVeiculo t) {
        Veiculo v = new Veiculo(t, placa);
        frota.add(v);
        
        ArrayList<EventoEstacionamento> eventos = CamadaPersistencia.eventoEstacionamento.obterEventos(v);
        for(EventoEstacionamento e : eventos)
            v.registrar(e);
    }
    
    public int horasEstacionado(int i) {
        final Veiculo v = frota.get(i);
        return v.horasEstacionado();
    }
    
    public double custoEstacionamento(int i) {
        final Veiculo v = frota.get(i);
        return v.valorGasto();
    }
    
    public int frequenciaEstacionamentoRua(int i) {
        final Rua r = ruas.get(i);
        return r.quantosEventos();
    }
    
    public Veiculo veiculoMaisGastou() {
        Veiculo resposta = null;
        
        if(frota.isEmpty())
            return resposta;
        
        resposta = frota.get(0);
        for(Veiculo v : frota)
            if(v.valorGasto() > resposta.valorGasto())
                resposta = v;
        return resposta;
    }
    
    public Veiculo veiculoMaisEstacionou() {
        Veiculo resposta = null;
        
        if(frota.isEmpty())
            return resposta;
        
        resposta = frota.get(0);
        for(Veiculo v : frota)
            if(v.horasEstacionado() > resposta.horasEstacionado())
                resposta = v;
        return resposta;
    }
    
    public ArrayList<String> ruas() {
        final ArrayList<String> nomes = new ArrayList();
        
        for(Rua r : ruas)
            nomes.add(r.nome);
        
        return nomes;
    }
    
    public ArrayList<String> placas() {
        final ArrayList<String> placas = new ArrayList();
        
        for(Veiculo v : frota)
            placas.add(v.placa);
        
        return placas;
    }
}
