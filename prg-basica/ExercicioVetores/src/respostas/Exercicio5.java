/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;

import exerciciovetores.RespostaExercicio;

/**
 * @details Desenvolva um programa que calcule a interseção (valores em comum) entre os valores 
 * contidos em dois vetores V1 e V2 e armazene e mostre estes valores no vetor V3.
 * @author alexandre
 */
public class Exercicio5 extends RespostaExercicio {
    
    public Exercicio5() {
        final int n = leiaInt();
        
        final int[] v1 = new int[n];
        final int[] v2 = new int[n];
        final int[] v3 = new int[n]; // vetor para intersecções.
        int tamanhoV3 = 0;
        
        // Para cada elemento, ver se o que existe em V1 também existe em V2.
        for(int i = 0; i< n; i++) {
            boolean emV2tambem = false;
            boolean inserir = true;
            
            // Para um dado valor em v1 na posicao 'i', verificar se este valor está em alguma posição 'j' em v2.
            for(int j = 0; j < n; j++) {
                if(v1[i] == v2[j]){
                    emV2tambem = true;
                }
            }
            
            // Se o valor em v1 foi achado em v2, verificar se o valor já não foi colocado em v3 antes.
            if(emV2tambem) {
                for(int j = 0; j < tamanhoV3; j++){
                    if(v1[i] == v3[j]){
                        inserir = false; // Se ele já está em v3, o valor não deve ser re-inserido.
                    }
                }
                
                // Se for para inserir, colocar o valor na posição 'i' de v1 em v3 e registrar que existe mais um valor em comum.
                if(inserir){
                    v3[tamanhoV3] = v1[i];
                    tamanhoV3++;
                }
            }
        }
        
        escreva("Existem " + tamanhoV3 + " valor distinto em comum em v1 e v2. Eles são: ");
        for(int j = 0; j < tamanhoV3; j++){
            escreva(v3[j]);
        }
    }
}
