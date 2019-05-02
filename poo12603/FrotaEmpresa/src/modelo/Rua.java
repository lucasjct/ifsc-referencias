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
public class Rua implements ContainerEventos {
    public final String nome;
    
    private final ArrayList<EventoEstacionamento> eventos;
    
    public Rua(String n) {
        nome = n;
        eventos = new ArrayList();
    }
    
    @Override
    public void registrar(EventoEstacionamento e) {
        eventos.add(e);
    }
    
    public int quantosEventos() {
        return eventos.size();
    }
}
