/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listachamada;

/**
 *
 * @author aluno
 */
public class EntradaLista {
    public final String nome;
    private PresencaEnum estado;
    
    public EntradaLista(String n) {
        nome = n;
        estado = PresencaEnum.NAO_CHAMADO;
    }
    
    public PresencaEnum qualEstado() {
        return estado;
    }
    
    public void registrar(PresencaEnum p) {
        if(p != PresencaEnum.NAO_CHAMADO)
            estado = p;
    }
}
