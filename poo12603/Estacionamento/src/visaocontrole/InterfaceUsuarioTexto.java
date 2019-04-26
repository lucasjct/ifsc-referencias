/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaocontrole;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public abstract class InterfaceUsuarioTexto {
    protected final static Scanner sc = new Scanner(System.in);
    
    protected void escrever(String t) {
        System.out.println(t);
    }
    
    protected void escrever(int i) {
        System.out.println("" + i);
    }
    
    protected int lerInt() {
        return sc.nextInt();
    }
    
    protected String lerString() {
        return sc.next();
    }
}
