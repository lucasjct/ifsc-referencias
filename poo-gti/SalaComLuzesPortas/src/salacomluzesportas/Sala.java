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
public class Sala {
    private Luz luz1, luz2;
    private Porta porta1, porta2;
    
    public Sala(Cor cor, Chave chave) {
        luz1 = new Luz(cor);
        luz2 = new Luz(cor);
        porta1 = new Porta(chave.qualSenha());
        porta2 = new Porta(chave.qualSenha());
    }
    
    public Luz primeiraLuz() {
        return luz1;
    }
    
    public Luz segundaLuz() {
        return luz2;
    }
    
    public Porta primeiraPorta() {
        return porta1;
    }
    
    public Porta segundaPorta() {
        return porta2;
    }
}
