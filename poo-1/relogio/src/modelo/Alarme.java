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
public class Alarme {
    private Horario horario;
    
    public void ligar(Horario h) {
        horario = h;
    }
    
    public void checar(Horario h) {
        if(horario == null)
            return;
        if(horario.hora() == horario.hora())
            if(horario.minuto() == horario.minuto())
                if(horario.segundo() == horario.segundo())
                    apitar();
    }

    private void apitar() {
        System.out.println("[Alarme]: Beeep");
    }
}
