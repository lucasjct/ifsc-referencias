/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;

import exerciciovetores.RespostaExercicio;

/**
 * @details Tentando descobrir se um dado era viciado, um dono de cassino o lançou n vezes. Utilize um 
    vetor para armazenar o número de ocorrências de cada face. 
    Obs.: o lance gerado deve ser um valor entre 1 e 6.
 * @author alexandre
 */
public class Exercicio2 extends RespostaExercicio {
    
    public Exercicio2() {
        final int n = leiaInt();
        final int[] ocorrencias = new int[6];
        
        for(int i = 0; i < n; i++) {
            final int face = leiaInt(); // leia do usuário um valor de 1 até 6.
            ocorrencias[face-1]++; // A face 1 está no índice 0, assim como ela, todas as faces estão armazenadas no indice que é um a menos que o valor da face.
        }
        
        for(int i = 0; i < 6; i++) {
            escreva("A face " + i + " foi jogada " + ocorrencias[i] + " vezes");
        }
    }
}
