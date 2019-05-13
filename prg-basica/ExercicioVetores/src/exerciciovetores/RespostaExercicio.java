/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciovetores;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public abstract class RespostaExercicio {
    protected Scanner sc = new Scanner(System.in);
    
    protected final char leiaChar() {
        return sc.next().charAt(0);
    }
    
    protected final boolean leiaBoolean() {
        return sc.nextInt() != 0;
    }
    
    protected final int leiaInt() {
        return sc.nextInt();
    }
    
    protected final String leiaString() {
        return sc.next();
    }
    
    protected final double leiaDouble() {
        return sc.nextDouble();
    }

    protected final void escreva(String txt) {
        System.out.println(txt);
    }

    protected final void escreva(double d) {
        System.out.println("" + d);
    }


    protected final void escreva(int i) {
        System.out.println("" + i);
    }
}
