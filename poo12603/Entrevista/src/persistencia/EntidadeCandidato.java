/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Candidato;
import modelo.Habilidade;

/**
 *
 * @author alexandre
 */
public class EntidadeCandidato extends Entidade {
    
    public Candidato criar(int id) throws SQLException {
        Candidato candidato = null;
        try{
            abrirConexao();
            
            Statement comando = criarComando();
            ResultSet resultados = comando.executeQuery("select id, nome from candidato where id=" + id + ";");
            
            if(resultados.next()) {
                candidato = new Candidato(resultados.getString("nome"));
                ArrayList<Habilidade> habilidades = CamadaPersistencia.habilidade.criar(id);
                for(Habilidade h : habilidades)
                    candidato.adicionarHabilidade(h);
            }
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            fecharConexao();
        }
        
        return candidato;
    }
    
}
