/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandre
 */
public class PecaBasica extends Componente {

    public PecaBasica(String nome) {
        super(nome);
    }

    @Override
    public void instalar() {
        // Implementar este método
    }

    @Override
    public boolean prontoInstalar() {
        // Implementar este método
        return false;
    }
    
}
