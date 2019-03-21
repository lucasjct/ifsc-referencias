/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.arcondicionado;

/**
 *
 * @author aluno
 */
public enum EnumBotoes {
    LIGAR("Ligar"),
    DESLIGAR("Desligar"),
    AUMENTAR("Aumentar Temperatura"),
    DIMINUIR("Diminuir Temperatura");
    
    public final String repr;
    
    private EnumBotoes(String r) {
        repr = r;
    }

    public static EnumBotoes transforma(int i) {
        EnumBotoes[] valores = EnumBotoes.values();
        if(i >= valores.length && i > 0)
            return null;
        return EnumBotoes.values()[i];
    }
    
    @Override
    public String toString() {
        return repr;
    }
}
