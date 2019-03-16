/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Professor
 */
public enum EstadosPessoa implements RepresentavelTexto {
    ABERTO("Aberto"),
    FECHADO("Fechado");

    private final String repr;

    private EstadosPessoa(String s) {
        this.repr = s;
    }
    
    public static int quantidadeEstados() {
        return EstadosPessoa.values().length;
    }
    
    @Override
    public String toString() {
        return representacao();
    }

    @Override
    public String representacao() {
        return "Semaforo para Pedestres está " + repr;
    }
}
