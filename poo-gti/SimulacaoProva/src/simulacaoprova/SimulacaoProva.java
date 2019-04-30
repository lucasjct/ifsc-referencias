/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaoprova;

import modelo.AlternativaMultiplaEscolha;
import modelo.AlternativaVouF;
import modelo.Prova;
import modelo.Questao;
import modelo.Resposta;
import modelo.TipoQuestao;

/**
 *
 * @author aluno
 */
public class SimulacaoProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prova prova = new Prova();
        
        Questao q1 = new Questao("Apenas a primeira opção está certa.", TipoQuestao.MULTIPLA_ESCOLHA);
        q1.adicionar(new AlternativaMultiplaEscolha("Esta é correta", true));
        q1.adicionar(new AlternativaMultiplaEscolha("Esta é incorreta 1", false));
        q1.adicionar(new AlternativaMultiplaEscolha("Esta é incorreta 2", false));
        q1.adicionar(new AlternativaMultiplaEscolha("Esta é incorreta 3", false));
        
        Questao q2 = new Questao("Todas menos a última serão verdadeiras.", TipoQuestao.VERDADEIRO_OU_FALSO);
        q2.adicionar(new AlternativaVouF("Marque como verdadeira.", true));
        q2.adicionar(new AlternativaVouF("Marque como verdadeira 2", true));
        q2.adicionar(new AlternativaVouF("Marque como verdadeira 3", true));
        q2.adicionar(new AlternativaVouF("Marque como falsa", false));

        // A prova é composta pelas questões q1 e q2
        prova.adicionar(q1);
        prova.adicionar(q2);
        // A prova está pronta
        prova.pronta();
        
        System.out.println(prova);
        
        // A resolução das questões é feita através das questões.
        Questao primeira = prova.questao(0);
        Questao segunda = prova.questao(1);
        
        primeira.responder(0); // Marcando a primeira alternativa apenas da primeira questao
        System.out.println("\nMarcada a primeira alternativa da primeira questão.");
        
        segunda.responder(0, true); // Marcando todas as alternativas verdadeiras com true e todas as falsas com false.
        segunda.responder(1, true);
        segunda.responder(2, true);
        segunda.responder(3, false);
        System.out.println("\nAssinalada como verdadeira a primeira, segunda e terceira alternativa da segunda questão.");
        System.out.println("Assinalada como falsa a última alternativa da segunda questão.");
        
        System.out.println("\nPrimeira questão correta? " + primeira.acertou());
        System.out.println("Segunda questão correta? " + segunda.acertou());
        
    }
    
}
