/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroautonomosimplificado;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class SimplesPoucasFuncoes {

    /**
     * Imprime uma mensagem de dica para o usuario e, em seguida, retorna um valor numerico lido do usuario.
     * @param msg Uma mensagem de dica para o usuario.
     * @return Um valor lido do usuario
     */
    public static int leiaUsuario(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    /**
     * Verifica a diferenca entre a velocidade atual e a velocidade adequada
     * @details Se o valor de retorno for positivo, o carro esta acima da velocidade adequada, do contrario esta abaixo.
     *  Caso o retorno for 0, o carro esta na velocidade ideal.
     * @param atual A velocidade atual
     * @return A velocidade atual reduzida da velocidade adequada.
     */
    public static int diferencaVelocidadeAdequada(int atual) {
        int adequada = leiaUsuario("Digite a Velocidade adequada para este segmento [0..9].");
        return atual - adequada;
    }
    
    /**
     * Verifica se o sensor frontal identifica se o carro pode seguir ou nao.
     * @return Retorna true se o carro pode seguir e false caso nao possa.
     */
    public static boolean sensorFrontal() {
        int leitura = leiaUsuario("Digite 0 se o sensor de proximidade detectou alguma coisa e deve frenar o carro. Digite qualquer outro numero caso contrario");
        return leitura != 0;
    }
    

    /***
     * Faz a simulacao do carro autonomo simples porém com poucas funçoes auxiliares.
     */
    public static void simulacaoSimples() {
        // Dados sobre Segmentos
        int segmentos = 500;
        int atual = 0;
        
        // Dados sobre Velocidade
        int velocidade = leiaUsuario("Digite a velocidade inicial do carro [0..9]");
        int frenagemConsecutiva = 0;
        int aceleracaoConsecutiva = 0;
        
        System.out.println("Comecando a Simulacao...");
        do {
            boolean seguir = sensorFrontal();
            
            if(!seguir){ // se o carro deve frenar, diminua a velocidade.
                int nova;
                frenagemConsecutiva++;
                aceleracaoConsecutiva = 0;
                nova = velocidade - (1 * frenagemConsecutiva)%10;
                if(nova < 1)
                    velocidade = 1;
                else
                    velocidade = nova;
                System.out.println("\tO carro esta frenando.");
            } else { // Se o carro pode continuar, verificar se ele deve acelerar ou nao.
                int diferencaVelocidade = diferencaVelocidadeAdequada(velocidade); // Calcula a diferenca entre a velocidade atual e a adequada.
                frenagemConsecutiva = 0;
                
                if( diferencaVelocidade >= 0) {
                    System.out.println("\tO carro ajustou a velocidade para a adequada.");
                    velocidade -= diferencaVelocidade;
                    aceleracaoConsecutiva = 0;
                }
                else {
                    System.out.println("\tO carro esta acelerando.");
                    aceleracaoConsecutiva++;
                    velocidade += (1 * aceleracaoConsecutiva)%10;
                }
            }
            
            System.out.println("\tVelocidade Atual do carro: " + velocidade);
            atual += velocidade; // Atualizamos a velocidade do carro.
            System.out.println("\tSegmentos Percorridos: " + atual + "/" + segmentos + "\n");
        } while(atual < segmentos);
        System.out.println("Terminando a Simulacao...");
    }
}
