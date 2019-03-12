package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre
 */
public class Robo implements Instalavel {
    public final PecaRobo [] dependencias;
    private boolean instalado;
    
    /**
     * O construtor do objeto Robo que cria e explicita suas dependencias.
     */
    public Robo() {
        instalado = false; // O robo começa não estando instalado
        
        dependencias = new PecaRobo[5]; // O robo depende de 5 coisas
        dependencias[0] = new PecaRobo("Suporte", new PecaBasica("Microcontrolador"));
        dependencias[1] = new PecaRobo("Pernas", new PecaBasica("Motores"));
        dependencias[2] = new PecaRobo("Braco", new PecaBasica("Atuadores"));
        dependencias[3] = new PecaRobo("Torso", dependencias[0], dependencias[1]); // O Torso depende do Suporte e das Pernas.
        dependencias[4] = new PecaRobo("Cabeca", dependencias[3]); // A cabeça depende do Torso.
    }
    
    @Override
    public void instalar() {
        if(instalado) {
            System.out.println("[Robo] Já instalado.");
            return;
        }
        if(!prontoInstalar())
            System.out.println("[Robo] Ainda há dependencias a serem instaladas...");
        for(PecaRobo peca : dependencias) // Para cada dependencia, chame-a de peca...
            if(!peca.instalado())   // Se ela ainda nao foi instalada...
                peca.instalar(); // instale-a
        
        instalado = verificaInstalacao(); // verifica se as peças foram instaladas.
    }
    
    /**
     * @return True somente se as peças da dependencia foram instaladas
     */
    private boolean verificaInstalacao() {
        boolean sucesso = true;
        for(PecaRobo peca : dependencias) // Para cada dependencia, chame-a de peca..
            if(!peca.instalado())   // Se ela ainda nao foi instalada...
                sucesso = false;
        return sucesso;
    }

    @Override
    public boolean instalado() {
        return instalado;
    }

    @Override
    public boolean prontoInstalar() {
        boolean pronto = true; // Assume-se que ele está pronto
        for(PecaRobo peca : dependencias) // Para cada dependencia, chame-a de peca...
            if(!peca.instalado() && !peca.prontoInstalar()) // Se uma peca nao está instalada e não está pronta para instalar...
                pronto = false; // O robo nao está pronto para ser instalado
        return pronto;
    }
    
}
