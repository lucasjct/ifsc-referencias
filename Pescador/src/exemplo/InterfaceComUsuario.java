/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;
import java.util.Scanner;

/**
 * Classe estatica para realizar interacoes com o usuario.
 * @author Alexandre
 */
public class InterfaceComUsuario {
    private static final Scanner sc = new Scanner(System.in);
    
    /***
     * Construtor privado para que nao possa ser criado nenhuma instancia de InterfaceComUsuario
     */
    private InterfaceComUsuario(){}
    
    /***
     * Escreve na tela uma mensagem para o usuario.
     * @param msg A mensagem a ser mostrada na tela.
     */
    public static void informe(String msg) {
        System.out.println(msg);
    }
    
    /***
     * Escreve uma mensagem de dica na tela e le um valor inteiro em seguida.
     * @param msg A mensagem de dica a ser mostrada
     * @return Um valor inteiro lido pelo usuario
     */
    public static int leiaInt(String msg) {
        informe(msg);
        return sc.nextInt();
    }
    
    /***
     * Le um valor inteiro do usuario e o retorna.
     * @return Um valor inteiro lido pelo usuario
     */
    public static int leiaInt() {
        return sc.nextInt();
    }
    
    /***
     * Escreve uma mensagem de dica na tela e le um valor inteiro do usuario.
     * @param msg A mensagem de dica a ser mostrada
     * @return True se o valor digitado foi 0 e False se o valor digitado foi outra coisa.
     */
    public static boolean leiaBoolean(String msg) {
        informe(msg);
        return sc.nextInt() == 0;
    }
    
    /***
     * Le um valor inteiro do usuario.
     * @return True se o valor digitado foi 0 e False se o valor digitado foi outra coisa.
     */
    public static boolean leiaBoolean() {
        return sc.nextInt() == 0;
    }
}

