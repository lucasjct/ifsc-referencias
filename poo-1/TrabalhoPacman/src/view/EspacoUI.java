/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.EnumAchado;
import modelo.Espaco;

/**
 *
 * @author alexandre
 */
public class EspacoUI extends javax.swing.JPanel implements MouseListener {
    public static final int tamanho = 25;
    
    public final Espaco espaco;
    
    public boolean clicked;
    
    public EspacoUI(Espaco e) {
        Dimension d = new Dimension(tamanho, tamanho);
        setSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        
        espaco = e;
        atualizarCor();
        
        addMouseListener(this);
    }
    
    private void atualizarCor() {
        setBackground(espaco.estado().cor);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        espaco.buscar();
        atualizarCor();
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(espaco.estado() == EnumAchado.NAO_PROCURADO)
            setBackground(Color.black);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(espaco.estado() == EnumAchado.NAO_PROCURADO)
            atualizarCor();
    }
}
