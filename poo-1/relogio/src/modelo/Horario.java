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
public class Horario {
    private final UnidadeTempo horas, minutos, segundos;
    
    public Horario(int h, int m, int s) {
        horas = new UnidadeTempo(h, 24);
        minutos = new UnidadeTempo(m, 60);
        segundos = new UnidadeTempo(s, 60);
    }
    
    public int hora() {
        return horas.valor();
    }
    
    public int minuto() {
        return minutos.valor();
    }
    
    public int segundo() {
        return segundos.valor();
    }
    
    public void incrementa() {
        if(segundos.incrementa())
            if(minutos.incrementa())
                horas.incrementa();
    }
}
