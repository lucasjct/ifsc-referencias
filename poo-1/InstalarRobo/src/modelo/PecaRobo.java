package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre
 */
public class PecaRobo extends Componente {

    PecaRobo(String nome, PecaBasica dependenciaBasica) {
        super(nome);
        // Fazer este construtor
    }

    PecaRobo(String nome, PecaRobo dependencia) {
        super(nome);
        // Fazer este construtor
    }
    
    PecaRobo(String nome, PecaRobo dependencia, PecaRobo outraDependencia) {
        super(nome);
        // Fazer este construtor
    }    

    @Override
    public void instalar() {
        // Implementar este método
    }

    @Override
    public boolean prontoInstalar() {
        return false;
        // Implementar este método
    }
}
