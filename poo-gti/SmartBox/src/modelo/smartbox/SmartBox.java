/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.smartbox;

import java.util.ArrayList;
import modelo.fonte.Canal;
import modelo.fonte.Fonte;
import modelo.fonte.FonteCanais;
import modelo.fonte.TipoFonte;

/**
 *
 * @author aluno
 */
public class SmartBox {
    public final PainelControle painel;
    
    private final ArrayList<Fonte> fontes;
    private int volume;
    
    private Fonte atual;
    
    public SmartBox() {
        fontes = new ArrayList();
        atual = null;
        volume = 0;
        painel = new PainelControle(this);
    }
    
    public void registrar(Fonte f) {
        fontes.add(f);
    }
    
    public Fonte fonteAtual() {
        return atual;
    }
    
    public Canal canalAtual() {
        if(fonteAtual().tipo == TipoFonte.ESPELHAMENTO)
            return null;
        return ((FonteCanais) fonteAtual()).canalAtual();
    }
    
    private void ajusteVolume() {
        if(volume > 100)
            volume = 100;
        if(volume < 0)
            volume = 0;
    }
    
    void aumentarVolume() {
        ++volume;
        ajusteVolume();
    }
    
    void diminuirVolume() {
        --volume;
        ajusteVolume();
    }
    
    void mudarVolume(int i) {
        volume = i;
        ajusteVolume();
    }
    
    private boolean consegueTrocarCanal() {
        return canalAtual() != null;
    }
    
    public int numeroCanalAtual() {
        if(!consegueTrocarCanal())
            return 0;
        return canalAtual().numero;
    }
    
    void proximoCanal() {
        if(!consegueTrocarCanal())
            return;
        ((FonteCanais) atual).trocarCanal(numeroCanalAtual() + 1);
    }
    
    void canalAnterior() {
        if(!consegueTrocarCanal())
            return;
        ((FonteCanais) atual).trocarCanal(numeroCanalAtual() + 1);
    }
    
    void mudarCanal(int n) {
        if(!consegueTrocarCanal())
            return;
        ((FonteCanais) atual).trocarCanal(n);
    }
    
}
