/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.contratos;

import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public interface FonteMoedas {
    public ArrayList<String> nomeMoedas();
    public void adicionarInteressado(InteressadoMoedas i);
}
