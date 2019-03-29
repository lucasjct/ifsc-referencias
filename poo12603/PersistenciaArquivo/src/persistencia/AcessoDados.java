/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileNotFoundException;
import persistencia.arquivo.TerritorioDAO;

/**
 *
 * @author alexandre
 */
public class AcessoDados {
    public final TerritorioDAO territorios;
    
    public AcessoDados() throws FileNotFoundException {
        territorios = new TerritorioDAO();
    }
}
