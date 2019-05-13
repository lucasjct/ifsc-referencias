/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;

import exerciciovetores.RespostaExercicio;

/**
 * @details Um time de basquete possui 12 jogadores. Deseja-se um programa que, dado o nome e a altura 
    dos jogadores, determine:
    - o nome e a altura do jogador mais alto;
    - a média de altura do time;
    - a quantidade de jogadores com altura superior a média, listando o nome e a altura de cada um.
 * @author alexandre
 */
public class Exercicio1 extends RespostaExercicio {
    
    public Exercicio1() {
        final int n = 12;
        final String[] nomes = new String[n];
        final double[] alturas = new double[n];
        
        // Leia do usuário todos os dados do usuário sobre os jogadores
        for(int i = 0; i < n; i++) {
            escreva("Digite o nome do jogador " + i);
            nomes[i] = leiaString();
            escreva("Digite a altura do jogador " + i);
            alturas[i] = leiaDouble();
        }
        
        // Descoberta de quem é o mais alto e do somatório da altura.
        int maisAlto = 0;
        double media = 0;
        for(int i = 1; i < n; i++) {
            media += alturas[i];
            if(alturas[i] > alturas[maisAlto]){
                maisAlto = i;
            }
        }
        escreva("O jogador mais alto é o " + nomes[maisAlto] + " com uma altura de " + alturas[maisAlto]);
        media = media/n;
        escreva("A altura média do time é: " + media);
        
        // Descoberta de quantos jogadores estão acima da média de altura
        int acimaMedia = 0;
        for(int i = 0; i < n; i++){
            if(alturas[i] > media){
                acimaMedia++;
            }
        }
        escreva("Existem " + acimaMedia + " jogadores acima da média");
        
    }
}
