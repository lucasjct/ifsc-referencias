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
public class PowerUpEstadoIncremental implements PowerUp {
    public final Estado estado;

    public PowerUpEstadoIncremental(Estado e) {
        estado = e;
    }
    
    @Override
    public boolean surte_efeitos(Protagonista p) {
        return (p.estado.valor + 1) == estado.valor;
    }

    @Override
    public void aplicar_efeitos(Protagonista p) {
        if(surte_efeitos(p))
            p.estado = estado;
    }
    
}
