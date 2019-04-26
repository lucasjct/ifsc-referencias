/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Veiculo implements ContainerEventos {
    public final TipoVeiculo tipo;
    public final String placa;
    
    private final ArrayList<EventoEstacionamento> eventos;
    
    public Veiculo(TipoVeiculo t, String p) {
        tipo = t;
        placa = p;
        eventos = new ArrayList();
    }
    
    @Override
    public void registrarEvento(EventoEstacionamento e) {
        eventos.add(e);
    }
    
    public int horasEstacionado() {
        int soma = 0;
        for(EventoEstacionamento e : eventos)
            soma += e.periodo();
        return soma;
    }
    
    public double valorGasto() {
        return horasEstacionado() * TaxaEstacionamento.porTipo(tipo).valor;
    }
}
