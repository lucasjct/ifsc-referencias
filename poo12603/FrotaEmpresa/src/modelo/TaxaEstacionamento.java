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
public enum TaxaEstacionamento {
    CARRO(TipoVeiculo.CARRO, 2),
    MOTO(TipoVeiculo.MOTO, 1);
    
    public final TipoVeiculo tipo;
    public final double valor;
    
    private TaxaEstacionamento(TipoVeiculo t, double v) {
        tipo = t;
        valor = v;
    }
    
    public static TaxaEstacionamento porTipo(TipoVeiculo t) {
        switch(t) {
            case CARRO:
                return CARRO;
            default:
                return MOTO;
        }
    }
            
}
