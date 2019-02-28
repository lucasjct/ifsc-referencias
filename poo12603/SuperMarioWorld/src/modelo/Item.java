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
public enum Item implements Interativo {
    COGUMELO_VERMELHO("Cogumelo Vermelho", true, false, true, false, new PowerUpEstadoIncremental(Estado.GRANDE)),
    FLOR_FOGO("Flor Fogo", true, false, true, true, new PowerUpEstadoIncremental(Estado.PODEROSO)),
    YOSHI("Yoshi", true, false, false, true, new PowerUpIndependenteEstado()),
    PENA("Pena", true, true, true, true, new PowerUpEstadoIncremental(Estado.VOADOR)),
    MOEDA("Moeda", true, true, false, false, null);
    
    public final String nome;
    public final boolean caixa, mundo;
    public final boolean mudanca_visual, novos_controles;
    public final PowerUp powerup;

    private Item(String nome, boolean caixa, boolean mundo, boolean mudanca_visual, boolean novos_controles, PowerUp p) {
        this.nome = nome;
        this.caixa = caixa;
        this.mundo = mundo;
        this.mudanca_visual = mudanca_visual;
        this.novos_controles = novos_controles;
        this.powerup = p;
    }

    @Override
    public void interage(Protagonista p) {
        powerup.aplicar_efeitos(p);
    }

    @Override
    public boolean pode_interagir(Protagonista p) {
        return powerup != null;
    }
}
