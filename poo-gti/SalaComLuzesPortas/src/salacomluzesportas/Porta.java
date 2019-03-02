/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacomluzesportas;

/**
 *
 * @author alexandre
 */
public class Porta {
    private int senha;
    private boolean aberta;
    
    public Porta(int s) {
        senha = s;
    }
    
    public void abrir(Chave c) {
        if(c.qualSenha() == senha)
            aberta = true;
    }
    
    public void fechar() {
        aberta = false;
    }
}
