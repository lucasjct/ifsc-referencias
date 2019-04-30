/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public abstract class Alternativa {
    public final TipoQuestao tipo;
    public final String enunciado;
    
    private final EstadoAlternativa esperado;
    protected EstadoAlternativa estado;
    
    public Alternativa(String en, EstadoAlternativa e, TipoQuestao t) {
        enunciado = en;
        esperado = e;
        tipo = t;
        estado = EstadoAlternativa.NAO_RESPONDIDA;
    }
    
    public void assinalar(boolean r) {
        if(podeMarcar())
            estado = (r)? EstadoAlternativa.MARCADO_V : EstadoAlternativa.MARCADO_F;
    }
    
    public void selecionar() {
        if(podeSelecionar())
            estado = EstadoAlternativa.ASSINALADA;
    }
    
    public abstract boolean podeMarcar();
    public abstract boolean podeSelecionar();
    
    public boolean correto() {
        return estado == esperado;
    }

    @Override
    public String toString() {
        return enunciado;
    }
    
}
