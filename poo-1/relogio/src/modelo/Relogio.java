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
public class Relogio {
    private Horario horario;
    private Cronometro cronometro;
    private final Alarme alarme;
    
    public Relogio() {
        alarme = new Alarme();
        cronometro = new Cronometro();
    }
    
    public void imprimeHora() {
        System.out.println("Horario atual: " + horario.hora() + "h " + horario.minuto() + "m " + horario.segundo() + "s");
    }
    
    public void registrarAlarme(Horario h) {
        alarme.ligar(h);
    }
    
    public void ligarCronometro() {
        cronometro.ligar(horario);
    }
    
    public int desligarCronometro() {
        return cronometro.diferenca(horario);
    }
    
    public void tic() {
        horario.incrementa();
        alarme.checar(horario);
    }
}
