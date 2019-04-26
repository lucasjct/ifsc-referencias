/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Registro;
import modelo.Totem;

/**
 *
 * @author aluno
 */
public class RegistroEntidade extends Entidade {

    public void salvarRegistros(Totem t) {
        try {
            abrirConexao();
            
            final Integer idTotem = CamadaPersistencia.totem.mapeamento.get(t);
            final int nRegistros = t.registros().size();
            int idUltimoRegistro;
            
            for(Registro registro : t.registros())
                inserirRegistro(registro);
            
            idUltimoRegistro = ultimoRegistro();
            for(Registro registro : t.registros())
                inserirRegistroTotem(idTotem, idUltimoRegistro--);
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fecharConexao();
        }
    }
    
    private int ultimoRegistro() throws SQLException {
        final Statement pegarMaiorId = criarComando();
        final ResultSet resultado = pegarMaiorId.executeQuery("select MAX(id) as id from registro");

        Integer id = 1;
        if(resultado.next())
            id = resultado.getInt("id");
        return id;
    } 

    private void inserirRegistro(Registro registro) throws SQLException {
        Statement comando = criarComando();
        comando.executeUpdate("INSERT INTO registro(entrada,saida,placa) VALUES (" + registro.entrada + "," + registro.saida + ",'" + registro.placa + "');");
    }

    private void inserirRegistroTotem(Integer idTotem, int idRegistro) throws SQLException {
        Statement comandoTotemRegistro = criarComando();
        comandoTotemRegistro.executeUpdate("INSERT INTO totem_registro(tid, rid) VALUES(" + idTotem + "," + idRegistro + ");");
    }
    
}
