/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fonte;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class FonteCanais extends Fonte {
    private final ArrayList<Canal> canais;
    private Canal atual;
    
    public FonteCanais(String no, int n, TipoCanal t) {
        super(no, n, (t == TipoCanal.ABERTO)? TipoFonte.CANAIS_ABERTOS : TipoFonte.CANAIS_FECHADOS);
        canais = new ArrayList();
        atual = null;
    }
    
    private boolean podeReceberCanal(Canal c) {
        if(c.tipo == TipoCanal.ABERTO)
            return tipo == TipoFonte.CANAIS_ABERTOS;
        return tipo == TipoFonte.CANAIS_FECHADOS;
    }
    
    public void adicionar(Canal c) {
        if(podeReceberCanal(c))
            canais.add(c);
    }
    
    public Canal canalAtual() {
        return atual;
    }
    
    public Canal trocarCanal(int numero) {
        for(Canal c : canais)
            if(c.numero == numero)
                atual = c;
        return canalAtual();
    }
}
