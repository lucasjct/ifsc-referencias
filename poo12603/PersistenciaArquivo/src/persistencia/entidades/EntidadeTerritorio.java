/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.entidades;

import java.util.ArrayList;
import modelo.Territorio;

/**
 *
 * @author alexandre
 */
public interface EntidadeTerritorio {
    public ArrayList<Territorio> territorios();
    public Territorio territorios(int i);
}
