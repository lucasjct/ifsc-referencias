/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fachada;

import modelo.arcondicionado.ArCondicionado;
import modelo.arcondicionado.Disjuntor;
import modelo.arcondicionado.ControleArCondicionado;

/**
 *
 * @author aluno
 */
public class Sala {
    public final ArCondicionado ar;
    public final ControleArCondicionado controle;
    public final Disjuntor disjuntor;
    
    public Sala() {
        controle = new ControleArCondicionado();
        disjuntor = new Disjuntor();
        ar = new ArCondicionado(disjuntor, controle);
    }
}
