/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lixeirainteligente;

/**
 *
 * @author aluno
 */
public class SeparadorLixo {
    private final Lixeira[] lixeiras;
    
    public SeparadorLixo() {
        lixeiras = new Lixeira[3];
        
        lixeiras[0] = new Lixeira(TipoLixo.ORGANICO);
        lixeiras[1] = new Lixeira(TipoLixo.PLASTICO);
        lixeiras[2] = new Lixeira(TipoLixo.VIDRO);
    }
    
    public void receber(Lixo l) {
        for(int i = 0; i < lixeiras.length; ++i)
            if(l.tipo == lixeiras[i].tipo)
                lixeiras[i].receber(l);
    }
}
