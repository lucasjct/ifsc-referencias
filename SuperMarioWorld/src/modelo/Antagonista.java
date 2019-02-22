/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public enum Antagonista implements Interativo {
    KOOPA("Koopa", Ataque.BASICO),
    PARATROOPA("Paratroopa", Ataque.DISTANCIA),
    MAGIKOOPA("Magickoopa", Ataque.DISTANCIA),
    TROOPA("Troopa", Ataque.LANCA);
    
    public final String nome;
    public final Ataque ataque;
    
    private Antagonista(String n, Ataque a) {
        nome = n;
        ataque = a;
    }
    
    public boolean perdeComEstrategia(Estrategia e) {
        return e.equals(ataque.estrategiaVencedora);
    }

    private void causarDanos(Protagonista p) {
        if(p.yoshi) {
            p.yoshi = false;
            return;
        }
        if(p.estado.valor == 0) {
            p.morreu();
            return;
        }
        p.estado = Estado.estadoAnterior(p.estado);
    }
    
    @Override
    public void interage(Protagonista p) {
        if(perdeComEstrategia(p.estrategia))
            return;
        causarDanos(p);
    }

    @Override
    public boolean pode_interagir(Protagonista p) {
        return true;
    }
}
