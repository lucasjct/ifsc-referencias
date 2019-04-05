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

/**
 *
 * @author aluno
 */
public abstract class Entidade {
    protected static final String usuario = "root";
    protected static final String senha = "aluno";
    protected static final String url = "jdbc:mysql://localhost/War";
    
    protected Connection conexao;
    
    protected Statement criarComando() throws SQLException {
        conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao.createStatement();
    }
    
    protected void fecharConexao() throws SQLException {
        if(conexao != null)
            conexao.close();
    }
}
