/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author aluno
 */
public class MenuPrincipal {
    
    public void mostrar() {
        System.out.println("Interações com a Sala:");
        System.out.println("\t0 -> Interagir com o controle");
        System.out.println("\t1 -> Interagir com o disjuntor");
    }
    
    public void loop() {
        System.out.println("Digite 0 para sair ou outro número para continuar");
    }

    public void mostrarAcaoNulaTomada() {
        System.out.println("Nenhuma Ação Tomada.");
    }
}
