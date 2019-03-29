/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.arquivo;

import persistencia.Persistencia;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre
 */
public abstract class PersistenciaArquivo implements Persistencia {
    private final Scanner leitor;
    private final FileWriter escritor;
            
    private final File arquivo;
    
    private final int numeroEntradas;
    
    protected PersistenciaArquivo(String n, int ne) throws IOException {
        arquivo = new File(n);
        leitor = new Scanner(arquivo);
        leitor.useDelimiter("[,\n]");
        escritor = new FileWriter(arquivo);
        numeroEntradas = ne;
    }
    
    @Override
    public void carregarObjetos() throws IllegalStateException {
        ArrayList<String> lista = new ArrayList();
        
        while(leitor.hasNext()) {
            lista.add(leitor.next());
            if(lista.size() == numeroEntradas) {
                objetoEncontrado(lista);
                lista.clear();
            }
        }
        
        if(lista.size() > 0)
            throw new IllegalStateException("O arquivo " + arquivo.getName() + " tem entradas incompletas.");
    }
    
    protected abstract void objetoEncontrado(ArrayList<String> parametros);
    protected abstract ArrayList<ArrayList<String>> representacaoObjetos();
    
    
    private String prepararConteudoArquivo() {
        ArrayList<ArrayList<String>> objetos = representacaoObjetos();
        String s = "";
        for(ArrayList<String> obj : objetos) {
            for(String p : obj)
                s += p + ",";
            s = s.substring(0, s.length()-1) + "\n";
        }
        return s;
    }
    
    @Override
    public void salvarObjetos() {
        String conteudo = prepararConteudoArquivo();
        
        try (PrintWriter p = new PrintWriter(escritor)) {
            p.print(conteudo);
            escritor.close();
        } catch (IOException ex) {
            System.out.println("Arquivo indisponivel");
        }
    }

}
