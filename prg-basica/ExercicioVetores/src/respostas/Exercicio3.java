/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;

import exerciciovetores.RespostaExercicio;

/**
 * @details Dados dois vetores x e y, ambos com n elementos, determinar o produto desses vetores e gera-
    los simultaneamente. 
 * @author alexandre
 */
public class Exercicio3 extends RespostaExercicio {
    
    public Exercicio3() {
        final int n = leiaInt();
        
        final int[] x = new int[n];
        final int[] y = new int[n];
        final int[] produto = new int[n];
        
        for(int i = 0; i < n; i++) {
            escreva("Digite o " + i + "-ésimo valor no vetor x: ");
            x[i] = leiaInt();
            escreva("Digite o " + i + "-ésimo valor no vetor y: ");
            y[i] = leiaInt();
            
            produto[i] = x[i] * y[i];
            escreva("Valor do produto do" + i + "-ésimo valor no vetor produto: " + produto[i]);
        }
    }
}
