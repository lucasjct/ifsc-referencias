/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;

import exerciciovetores.RespostaExercicio;

/**
 * @details Deseja-se publicar o número de acertos de cada aluno em uma prova. A prova consta de 30 
    questões, cada uma com cinco alternativas identificadas por A, B, C, D e E. Para isso são dados 
    (lidos): 
    - o cartão gabarito; 
    - o número de alunos da turma; 
    - o cartão de respostas para cada aluno, contendo o seu número e suas respostas
 * @author alexandre
 */
public class Exercicio6 extends RespostaExercicio {
    
    public Exercicio6() {
        final int questoes = 30;
        final int alternativas = 5;
        
        final int[] gabarito = new int[questoes];
        final int[] respostas = new int[questoes];
        
        escreva("Digite quantos alunos farão a prova: ");
        final int alunos = leiaInt();
        final int[] acertos = new int[alunos];
        
        // Ler do usuário o gabarito.
        for(int i = 0; i < questoes; i++){
            escreva("Digite o gabarito da questao " + (i+1) + " (alternativa 0 até " + (alternativas-1) + "): ");
            gabarito[i] = leiaInt();
        }
        
        // Cada aluno irá fazer a prova.
        for(int a = 0; a < alunos; a++) {
            escreva("Digite as respostas para o " + (a+1) + "-ésimo aluno.");
            
            // Aluno está preenchendo o cartao de resposta
            for(int q = 0; q  < questoes; q++) {
                escreva("Questao " + (q+1) + ": ");
                respostas[q] = leiaInt();
            }
            // Professor está corrigindo o cartão de respostas
            for(int q = 0; q  < questoes; q++) {
                if(respostas[q] == gabarito[q]) {
                    acertos[a]++;
                }
            }
        }
        
        for(int a = 0; a < alunos; a++) {
            escreva("O aluno " + (a+1) + " acertou " + acertos[a] + " questoes");
        }
    }
}
