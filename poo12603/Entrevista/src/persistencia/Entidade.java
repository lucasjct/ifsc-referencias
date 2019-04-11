/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public abstract class Entidade {
    protected static final String usuario = "root";
    protected static final String senha = "root";
    protected static final String url = "jdbc:mysql://localhost/entrevista";
    
    protected Connection conexao;
    
    protected Statement criarComando() throws SQLException {
        if(conexao != null)
            return conexao.createStatement();
        return null;
    }
    
    protected void abrirConexao() throws SQLException {
        if(conexao == null)
            conexao = DriverManager.getConnection(url, usuario, senha);
    }
    
    protected void fecharConexao() throws SQLException {
        if(conexao != null)
            conexao.close();
    }
    
    protected String queryBuscaIdsLista(ArrayList<Integer> ids) {
        String query = "";
        for(Integer id : ids)
            query += Integer.toString(id) + ",";
        return query.substring(0, query.length()-1);
    }
}