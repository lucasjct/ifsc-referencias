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
public class Registro {

    public final int entrada, saida;
    
    private void validar() {
        if(entrada < 0 || saida < 0)
            throw new IllegalArgumentException("Horario não pode ser negativo.");
    }
    
    Registro(int e, int s) {
        entrada = e;
        saida = s;
        validar();
    }

    @Override
    public String toString() {
        return "[ " + entrada + ", " + saida + " ]";
    }
}
