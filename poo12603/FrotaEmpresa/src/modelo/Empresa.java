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
public class Empresa {
    private final ArrayList<Veiculo> frota;
    private final ArrayList<Rua> ruas;
    
    public Empresa() {
        frota = new ArrayList();
        ruas = new ArrayList();
    }
    
    public void novoEvento(int idRua, int idVeiculo, int entrada, int saida) {
        EventoEstacionamento evento = new EventoEstacionamento(entrada, saida);
        
        ruas.get(idRua).registrarEvento(evento);
        frota.get(idVeiculo).registrarEvento(evento);
    }
    
}
