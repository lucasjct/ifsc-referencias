/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 * Uma classe abstrata que representa um sensor "manual", onde suas leituras na verdade são digitadas pelo usuário.
 * @author alexandre
 */
public abstract class SensorManual implements Sensor, SensorSimuladoPeloUsuario {
    private final static Scanner sc = new Scanner(System.in);
    
    private int leitura;
    
    @Override
    public void sensoriar() {
        System.out.println(obterMensagemUsuario());
        leitura = sc.nextInt();
    }

    @Override
    public int obterLeitura() {
        return leitura;
    }
    
}
