/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.SQLException;
import modelo.Candidato;
import persistencia.CamadaPersistencia;

/**
 *
 * @author alexandre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Candidato candidato = CamadaPersistencia.candidato.criar(1);

        System.out.println(candidato);
    }
    
}
