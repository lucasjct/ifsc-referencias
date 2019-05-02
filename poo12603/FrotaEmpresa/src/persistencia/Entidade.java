/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import static java.lang.System.exit;
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
    protected static final String url = "jdbc:mysql://localhost/Estacionamento";
    
    protected Connection conexao;
    
    protected void abrirConexao() throws SQLException {
        if(conexao == null) {
            conexao = DriverManager.getConnection(url, usuario, senha);
        }
    }
    
    protected Statement criarComando() throws SQLException {
        if(conexao != null)
            return conexao.createStatement();
        return null;
    }
    
    protected void fecharConexao() {
        try {
                if(conexao != null){
                    conexao.close();
                    conexao = null;
                }
            } catch (SQLException ex) {
                exit(-1);
            }
    }
}
