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
public enum EstadosCarro implements RepresentavelTexto {
    VERDE("Verde"),
    AMARELO("Amarelo"),
    VERMELHO("Vermelho");

    private final String repr;

    private EstadosCarro(String s) {
        this.repr = s;
    }
    
    public static int quantidadeEstados() {
        return EstadosCarro.values().length;
    }
    
    @Override
    public String toString() {
        return representacao();
    }

    @Override
    public String representacao() {
        return "Semaforo para Carros está " + this.repr;
    }
}
