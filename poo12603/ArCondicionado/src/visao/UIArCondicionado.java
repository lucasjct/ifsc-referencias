/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modelo.arcondicionado.ArCondicionado;
import modelo.interfaces.ObservadorArCondicionado;

/**
 *
 * @author aluno
 */
public class UIArCondicionado implements ObservadorArCondicionado {
    public final ArCondicionado modelo;

    public UIArCondicionado(ArCondicionado m) {
        this.modelo = m;
        modelo.registrarInteressados(this);
    }
    
    @Override
    public void temperaturaSubiu(int t) {
        System.out.println("A temperatura subiu para " + t);
    }

    @Override
    public void temperaturaDesceu(int t) {
        System.out.println("A temperatura desceu para " + t);
    }

    @Override
    public void desligou() {
        System.out.println("O ar condicionado desligou");
    }

    @Override
    public void ligou() {
        System.out.println("O ar condicionado ligou");
    }
    
}
