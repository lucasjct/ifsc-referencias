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
public class Cronometro {
    private Horario referencia;
    
    public int diferenca(Horario horario) {
        if(referencia == null)
            return 0;
        return 0;
    }

    public void ligar(Horario horario) {
        referencia = horario;
    }
    
}
