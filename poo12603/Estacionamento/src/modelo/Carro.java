/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Carro {
    private Totem estacionamento;
    
    public final String placa;
    
    private void validar() {
        if(placa == null || placa.isEmpty())
            throw new IllegalArgumentException("Carro não pode ser criado sem placa.");
    }
    
    public Carro(String p) {
        placa = p;
        validar();
    }
    
    public void estacionar(Totem t) {
        if(t != null) {
            estacionamento = t;
            estacionamento.registrarEntrada(this);
        }
    }
    
    public void sair() {
        if(estacionamento != null) {
            estacionamento.registrarSaida(this);
            estacionamento = null;
        }
    }

    @Override
    public String toString() {
        return placa;
    }
}
