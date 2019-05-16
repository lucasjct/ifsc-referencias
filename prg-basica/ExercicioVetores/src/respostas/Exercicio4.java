/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;

import exerciciovetores.RespostaExercicio;

/**
 * @details Receber do usuário uma lista de N nomes, sexo e idades de pessoas,
 * onde N é fornecido inicialmente pelo usuário. Mostrar o nome, o sexo e a
 * idade da pessoa mais idosa e da pessoa mais jovem. Mostrar a relação (nome e
 * idade) das mulheres e, após, dos homens.
 * @author alexandre
 */
public class Exercicio4 extends RespostaExercicio {
    
    public Exercicio4() {
        final int n = leiaInt();
        
        final String[] nomes = new String[n];
        final boolean[] sexos = new boolean[n];
        final int[] idades = new int[n];
        
        // Lendo todos os dados das pessoas no laço
        for(int i = 0; i < n; i++) {
            escreva("Digite o nome da " + i + "-ésima pessoa: ");
            nomes[i] = leiaString();
            escreva("Digite o sexo da " + i + "-ésima pessoa (0 para homem e 1 para mulher): ");
            sexos[i] = leiaBoolean();
            escreva("Digite a idade da " + i + "-ésima pessoa: ");
            idades[i] = leiaInt();
        }
        
        //Achando a mais jovem e a mais idosa no mesmo laço
        int velha = 0, nova = 0;
        for(int i = 1; i < n; i++) {
            if(idades[velha] < idades[i]) {
                velha = i;
            }
            if(idades[nova] > idades[i]) {
                nova = i;
            }
        }
        
        // Achar a quantidade de homens
        int nhomens = 0;
        for(int i = 0; i < n; i++) {
            if(sexos[i] == false) { // Se é homem
                nhomens++;
            }
        }
        
        // Achar quem são os homens e quem são as mulheres (quais são os índices que contém homens e quais os índices de mulheres).
        final int[] mulheres = new int[n-nhomens];
        final int[] homens = new int[nhomens];
        int iMulher = 0, iHomem = 0;
        for(int i = 0; i < n; i++) {
            if(sexos[i] == false) { // Se é homem
                homens[iHomem] = i;
                iHomem++;
            } else {
                mulheres[iMulher] = i;
                iMulher++;
            }
        }
        
        escreva("Relacao de homens: ");
        for(int i = 0; i < iHomem; i++) {
            escreva("Nome: " + nomes[homens[i]]);
            escreva("Idade: " + idades[homens[i]]);
        }
        
        escreva("Relacao de mulheres: ");
        for(int i = 0; i < iMulher; i++) {
            escreva("Nome: " + nomes[mulheres[i]]);
            escreva("Idade: " + idades[mulheres[i]]);
        }
    }
    
}
