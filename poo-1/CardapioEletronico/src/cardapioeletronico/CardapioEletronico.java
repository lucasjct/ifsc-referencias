/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapioeletronico;

import modelo.Mesa;
import modelo.TipoCerveja;

/**
 *
 * @author alexandre
 */
public class CardapioEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1);
        Mesa mesa13 = new Mesa(13);
        
        mesa13.registrarCliente("Claudia");
        mesa1.registrarCliente("Paulo");
        
        mesa13.registrarPedido(TipoCerveja.PEPITA);
        mesa1.registrarPedido(TipoCerveja.BIRITOVSK);
        
        mesa13.registrarPagamento(10);
        mesa1.registrarPagamento(1);
        
        if(mesa13.qualCliente() == null)
            System.out.println("Mesa " + mesa13.numero + " está vazia.");
        System.out.println("Mesa " + mesa1.numero + " está com o cliente: " + mesa1.qualCliente().nome);
    }
    
}
