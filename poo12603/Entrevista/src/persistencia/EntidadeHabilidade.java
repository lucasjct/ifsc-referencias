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
import modelo.Campo;
import modelo.Graduacao;
import modelo.Habilidade;

/**
 *
 * @author alexandre
 */
public class EntidadeHabilidade extends Entidade {
    
    public ArrayList<Habilidade> criar(int idCandidato) throws SQLException {
        ArrayList<Habilidade> habilidades = new ArrayList();
        try{
            abrirConexao();
            ArrayList<Integer> ids = idHabilidades(idCandidato);
            if(ids.isEmpty()) {
                fecharConexao();
                return habilidades;
            }
            
            Statement comando = criarComando();
            ResultSet resultados = comando.executeQuery("select tipo, nivel from habilidade where id IN (" + queryBuscaIdsLista(ids) + ");");
            while(resultados.next())
                habilidades.add(new Habilidade(Campo.comId(resultados.getInt("tipo")), Graduacao.comId(resultados.getInt("nivel"))));
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            fecharConexao();
        }
        return habilidades;
    }
    
    
    
    private ArrayList<Integer> idHabilidades(int idCandidato) throws SQLException {
        ArrayList<Integer> habilidades = new ArrayList();
        Statement comando = criarComando();
        ResultSet resultados = comando.executeQuery("select hid from candidato_habilidade where cid=" + idCandidato + ";");
        
        while(resultados.next()) {
            habilidades.add(resultados.getInt("hid"));
        }
        
        return habilidades;
    }
}
