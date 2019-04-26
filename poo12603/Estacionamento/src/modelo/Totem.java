/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author aluno
 */
public class Totem {
    private static final int horaInicial = 0;
    
    private int hora;
    public final String rua;
    
    private final HashMap<Carro, Integer> carros;
    private final ArrayList<Registro> registros;
    
    private void validar() {
        if(hora < 0)
            throw new IllegalArgumentException("Horario do totem não pode ser negativo");
        if(rua == null || rua.isEmpty())
            throw new IllegalArgumentException("Totem deve estar situado em uma rua com nome.");
    }
    
    public Totem(String r) {
        rua = r;
        hora = horaInicial;
        
        carros = new HashMap();
        registros = new ArrayList();
        
        validar();
    }
    
    public void registrarEntrada(Carro c) {
        if(c != null && !carros.containsKey(c))
            carros.put(c, hora);
    }
    
    public void registrarSaida(Carro c) {
        int entrada;
        int saida;
        
        if(c == null || !carros.containsKey(c))
            return;
        
        entrada = carros.get(c);
        saida = hora;
        
        registros.add(new Registro(entrada, saida, c.placa));
        carros.remove(c);
    }
    
    public void incrementaHora() {
        ++hora;
    }
    
    public ArrayList<Registro> registros() {
        //return (ArrayList<Registro>) registros.clone();
        return registros;
    }

    @Override
    public String toString() {
        return rua + ": " + hora;
    }
}
