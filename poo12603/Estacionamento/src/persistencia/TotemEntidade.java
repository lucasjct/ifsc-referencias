/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import modelo.Totem;

/**
 *
 * @author aluno
 */
public class TotemEntidade extends Entidade {
    private final HashMap<Totem, Integer> mapeamento;
    public final ArrayList<Totem> totens;
    
    TotemEntidade() {
        mapeamento = new HashMap();
        totens = new ArrayList();
        criarTodos();
        totens.addAll(mapeamento.keySet());
    }
    
    private void criarTodos() {
        try {
            abrirConexao();
            Statement comando = criarComando();
            ResultSet resultados = comando.executeQuery("SELECT * FROM totem;");
            
            while(resultados.next())
                mapeamento.put(new Totem(resultados.getString("rua")), resultados.getInt("id"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fecharConexao();
        }
    }
}
