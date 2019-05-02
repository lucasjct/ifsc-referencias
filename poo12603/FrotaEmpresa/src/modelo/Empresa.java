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
    
    public void registrar(String placa, TipoVeiculo t) {
        frota.add(new Veiculo(t, placa));
        // Pegar todos os eventos de estacionamento no banco de dados.
    }
    
}
