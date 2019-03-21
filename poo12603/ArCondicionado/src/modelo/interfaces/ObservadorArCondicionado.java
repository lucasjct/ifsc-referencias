/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfaces;

/**
 *
 * @author aluno
 */
public interface ObservadorArCondicionado {
    public void temperaturaSubiu(int t);
    public void temperaturaDesceu(int t);
    
    public void desligou();
    public void ligou();
}
