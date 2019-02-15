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
public class Mario {
    int estado; // Pequeno (0), Grande (1), Poderoso (2)
    boolean yoshi;
    
    public Mario() {
        estado = 0;
        yoshi = false;
    }

    public void setEstado(int i) {
        estado = i;
    }
}
