/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandre
 */
public class Mesa {
    public final int numero;
    private boolean pagando;
    private Cliente cliente;
    
    public Mesa(int n) {
        numero = n;
        pagando = false;
    }
    
    public void registrarCliente(String n) {
        if(cliente == null)
            cliente = new Cliente(n);
    }
    
    public void registrarPedido(TipoCerveja c) {
        if(cliente != null && !pagando)
            cliente.pedir(c);
    }
    
    public void registrarPagamento(double v) {
        pagando = true;
        if(cliente.debitar(v) <= 0) {
            cliente = null;
            pagando = false;
        }
    }
    
    public Cliente qualCliente() {
        return cliente;
    }
}
