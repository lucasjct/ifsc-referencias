/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaocontrole;

import modelo.TotemCentral;

/**
 *
 * @author aluno
 */
public class Controle extends VisaoControle {
    
    Controle() {
        super(new TotemCentral());
        opcoes.add("Listar os Carros");
        opcoes.add("Listar Ruas");
        opcoes.add("Criar um Carro");
        opcoes.add("Estacionar um Carro");
        opcoes.add("Retirar um Carro do Estacionamento");
        opcoes.add("Retirar um Carro do Estacionamento");
        opcoes.add("Salvar");
    }

    @Override
    protected void escolheuOpcao(int op) {
        switch(op) {
            case 0:
                listarCarros();
                break;
            case 1:
                listarRuas();
                break;
            case 2:
                criarCarro();
                break;
            case 3:
                estacionarCarro();
                break;
            case 4:
                sairEstacionamento();
                break;
        }
    }

    private void listarCarros() {
        escrever("Carros no Sistema:");
        for(String p : fachada.placas())
            escrever("\t"+p);
        escolherOpcao();
    }

    private void criarCarro() {
        escrever("Digite a placa do novo carro:");
        fachada.novoCarro(lerString());
        escolherOpcao();
    }

    private void estacionarCarro() {
        escrever("Digite a placa do carro a ser estacionado:");
        final String placa = lerString();
        escrever("Digite o nome da rua onde o carro estacionará:");
        final String rua = lerString();
        
        fachada.estacionar(placa, rua);
        escolherOpcao();
    }

    private void sairEstacionamento() {
        escrever("Digite a placa do carro que sairá do estacionamento:");
        final String placa = lerString();
        
        fachada.sairEstacionamento(placa);
        escolherOpcao();
    }

    private void listarRuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
