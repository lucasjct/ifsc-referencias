/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.Jogo;

/**
 *
 * @author alexandre
 */
public class JogoUI extends JPanel {
    public static final int margemX = 10, margemY = 10;
    public static final int distancia = 3;
    
    Jogo jogo;
    ArrayList<EspacoUI> espacos;
    
    /**
     * Creates new form PainelJogo
     */
    public JogoUI() {
        setLayout(null);
        espacos = new ArrayList();
        setBackground(Color.blue);
        setSize(0, 0);
    }
    
    public void novoJogo(Jogo j) {
        jogo = j;
        
        limparPaineis();
        ajustarTamanho();
        criarPaineis();
    }
    
    private void limparPaineis() {
        espacos.forEach((e) -> { remove(e); });
        espacos.clear();
    }
    
    private void ajustarTamanho() {
        final int tamanho = jogo.tabuleiro.tamanho();
        final int x = margemX*2 + (distancia + EspacoUI.tamanho) * tamanho;
        final int y = margemY*2 + (distancia + EspacoUI.tamanho) * tamanho;
        
        Dimension d = new Dimension(x,y);
        setSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
    }
    
    private void criarEspaco(int i, int j) {
        final int t = jogo.tabuleiro.tamanho();
        EspacoUI novo = new EspacoUI(jogo.tabuleiro.espaco(i*t + j));
        int x = margemX + (distancia + EspacoUI.tamanho)*j;
        int y = margemY + (distancia + EspacoUI.tamanho)*i;
        novo.setLocation(x,y);
        
        espacos.add(novo);
        add(novo);
    }

    private void criarPaineis() {
        final int tamanho = jogo.tabuleiro.tamanho();
        for(int i = 0; i < tamanho; ++i)
            for(int j = 0; j < tamanho; ++j)
                criarEspaco(i, j);
        revalidate();
    }

    
}
