/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public abstract class ControleAbstrato {
    protected final Scanner sc;
    
    protected ControleAbstrato() {
        sc = new Scanner(System.in);
    }
    
    protected int lerInt() {
        return sc.nextInt();
    }
    
    protected boolean lerBoolean() {
        return sc.nextInt() != 0;
    }
}
