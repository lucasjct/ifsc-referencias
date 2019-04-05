/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.SQLException;
import modelo.tabuleiro.Pais;
import persistencia.PaisEntidade;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        PaisEntidade p = new PaisEntidade();
        
        Pais pais = p.criar(3);
        
        System.out.println(pais.nome);
    }
    
}
