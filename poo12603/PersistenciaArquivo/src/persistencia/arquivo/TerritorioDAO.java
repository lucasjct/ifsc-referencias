/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.arquivo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import modelo.Territorio;
import persistencia.entidades.EntidadeTerritorio;

/**
 *
 * @author alexandre
 */
public class TerritorioDAO extends PersistenciaArquivo implements EntidadeTerritorio {
    public final static String arquivo = "recursos/territorios.csv";
    private final static int campos = 2;
    
    private HashMap<Integer, Territorio> objetos;

    public TerritorioDAO() throws IOException {
        super(arquivo, campos);
        objetos = new HashMap();
    }

    @Override
    protected void objetoEncontrado(ArrayList<String> parametros) {
        Integer indice = obterIndice(parametros.get(0));
        String nome = obterNome(parametros.get(1));
        
        objetos.put(indice, new Territorio(nome));
    }

    private Integer obterIndice(String s) {
        return Integer.parseInt(s);
    }

    private String obterNome(String s) {
        return s;
    }

    @Override
    public ArrayList<Territorio> territorios() {
        return new ArrayList(objetos.values());
    }

    @Override
    public Territorio territorios(int i) {
        return objetos.get(i);
    }

    @Override
    protected ArrayList<ArrayList<String>> representacaoObjetos() {
        ArrayList<ArrayList<String>> repr = new ArrayList();
        
        for(Entry<Integer, Territorio> chaveValor : objetos.entrySet()) {
            ArrayList<String> lista = new ArrayList();
            
            lista.add(chaveValor.getKey().toString());
            lista.add(chaveValor.getValue().toString());
            
            repr.add(lista);
        }
        
        return repr;
    }
}
