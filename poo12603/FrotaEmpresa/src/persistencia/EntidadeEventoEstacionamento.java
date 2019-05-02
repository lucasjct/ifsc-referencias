/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.EventoEstacionamento;
import modelo.Veiculo;

/**
 *
 * @author aluno
 */
public class EntidadeEventoEstacionamento extends Entidade {
    
    public ArrayList<EventoEstacionamento> obterEventos(Veiculo v) {
        final ArrayList<EventoEstacionamento> eventos = new ArrayList();
        
        try {
            abrirConexao();

            Statement comando = criarComando();
            ResultSet rs = comando.executeQuery("SELECT * FROM registro WHERE placa = '" + v.placa + "';");
            
            while(rs.next()) {
                
            }
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fecharConexao();
        }
        
        return eventos;
    }
}
