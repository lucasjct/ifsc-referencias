/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lixeirainteligente;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lixo lixo0 = new Lixo(TipoLixo.ORGANICO, 2.6);
        Lixo lixo1 = new Lixo(TipoLixo.PLASTICO, 1.4);
        
        SeparadorLixo sep = new SeparadorLixo();
        
        sep.receber(lixo0);
        sep.receber(lixo1);
    }
    
}
