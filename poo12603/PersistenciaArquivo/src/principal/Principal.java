/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import modelo.Territorio;
import persistencia.AcessoDados;
import persistencia.arquivo.TerritorioDAO;

/**
 *
 * @author alexandre
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        AcessoDados d;
        
        try {
            d = new AcessoDados();
        } catch(FileNotFoundException e) {
            File f = new File(TerritorioDAO.arquivo);
            f.createNewFile();
            d = new AcessoDados();
        }
        
        d.territorios.carregarObjetos();
        d.territorios.salvarObjetos();
    }
    
}
