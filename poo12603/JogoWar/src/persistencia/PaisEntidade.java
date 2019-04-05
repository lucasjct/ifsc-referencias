/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.tabuleiro.Pais;

/**
 *
 * @author aluno
 */
public class PaisEntidade extends Entidade {
    
    public Pais criar(int id) throws SQLException {
        Pais pais = null;
        try {
            Statement comando = criarComando();
            ResultSet resultados = comando.executeQuery("select * from Pais where idPais=" + id + ";");
        
            if(resultados.next()) {
                String nome = resultados.getString("Nome");
                Integer tropasId = resultados.getInt("Tropa");
                pais = criaPais(nome, tropasId);
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            fecharConexao();
        }
        
        return pais;
    }
    
    private Pais criaPais(String nome, Integer idTropas) {
        return new Pais(nome);
    }
}
