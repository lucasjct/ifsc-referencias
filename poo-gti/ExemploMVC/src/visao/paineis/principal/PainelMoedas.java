/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.paineis.principal;

import controle.contratos.InteressadoSeletorMoeda;
import controle.contratos.SeletorMoeda;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controle.contratos.FonteMoedas;
import controle.contratos.InteressadoMoedas;
import modelo.Moeda;

/**
 *
 * @author alexandre
 */
public class PainelMoedas extends JPanel implements InteressadoMoedas, SeletorMoeda, ListSelectionListener {
    private JList lista;
    private JScrollPane painelLista;
    private DefaultListModel elementos;
    
    private PainelDetalhesMoedas detalhesMoedas;
    
    private final FonteMoedas fonteMoedas;
    
    private InteressadoSeletorMoeda controle;
    
    private void inicializaComponentes() {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        
        // Adicionar borda
        TitledBorder borda = BorderFactory.createTitledBorder("Moedas Existentes");
        borda.setTitleJustification(TitledBorder.CENTER);
        setBorder(borda);
        
        // Criar a lista
        lista = new JList();
        lista.setFixedCellWidth(80);
        lista.setVisibleRowCount(5);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(this);
        painelLista = new JScrollPane(lista);
        
        elementos = new DefaultListModel();
        
        detalhesMoedas = new PainelDetalhesMoedas();
    }
    
    private void adicionarComponentes() {
        lista.setModel(elementos);
        
        add(painelLista);
        add(detalhesMoedas);
    }
    
    @Override
    public final void atualizarMoedas() {
        elementos.clear();
        for(String s : fonteMoedas.nomeMoedas())
            elementos.addElement(s);
        lista.clearSelection();
    }
    
    public PainelMoedas(FonteMoedas f) {
        fonteMoedas = f;
        fonteMoedas.adicionarInteressado(this);
        
        inicializaComponentes();
        atualizarMoedas();
        adicionarComponentes();
    }

    @Override
    public void moedaSelecionada(Moeda m) {
        detalhesMoedas.mostrarMoeda(m);
    }

    @Override
    public void indicarInteressado(InteressadoSeletorMoeda i) {
        controle = i;
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        if(!lse.getValueIsAdjusting())
            controle.ocorreuSelecao(lista.getSelectedIndex());
    }
}
