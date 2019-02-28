/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static java.lang.System.exit;

/**
 *
 * @author aluno
 */
public enum Protagonista {
    MARIO("Mario"),
    LUIGI("Luigi");
    
    public final String nome;
    protected Estado estado; // Pequeno (0), Grande (1), Poderoso (2)
    protected boolean yoshi;
    
    protected Estrategia estrategia;
    
    private Protagonista(String n) {
        estado = Estado.PEQUENO;
        yoshi = false;
        nome = n;
    }
    
    public void novaEstrategia(Estrategia e) {
        estrategia = e;
    }
    
    public void morreu() {
        System.out.println("Mama Mia, o " + nome + " morreu");
        exit(0);
    }
}
