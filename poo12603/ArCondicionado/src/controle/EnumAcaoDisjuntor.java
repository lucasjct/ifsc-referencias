/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author aluno
 */
public enum EnumAcaoDisjuntor {
    DESLIGAR,
    LIGAR,
    NENHUMA;
    
    public static EnumAcaoDisjuntor transforma(int i) {
        EnumAcaoDisjuntor acao = NENHUMA;
        if(i >= 0 && i < EnumAcaoDisjuntor.values().length)
            acao = EnumAcaoDisjuntor.values()[i];
        return acao;
    }
}
