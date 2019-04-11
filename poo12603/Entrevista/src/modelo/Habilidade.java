/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandre
 */
public class Habilidade {

    public final Campo campo;
    public final Graduacao graduacao;
    
    private void validarHabilidade() {
        if(campo == null)
            throw new IllegalArgumentException("Campo da habilidade não pode ser vazio.");
        if(graduacao == null)
            throw new IllegalArgumentException("Graduação da habilidade não pode ser vazio.");
    }
    
    public Habilidade(Campo c, Graduacao g) {
        campo = c;
        graduacao = g;
        validarHabilidade();
    }

    @Override
    public String toString() {
        return campo.toString() + ": " + graduacao.toString();
    }
}
