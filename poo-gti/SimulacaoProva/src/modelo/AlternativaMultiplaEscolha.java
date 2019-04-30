/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class AlternativaMultiplaEscolha extends Alternativa {

    public AlternativaMultiplaEscolha(String e, boolean correta) {
        super(e, (correta)? EstadoAlternativa.ASSINALADA : EstadoAlternativa.NAO_RESPONDIDA, TipoQuestao.MULTIPLA_ESCOLHA);
    }

    @Override
    public boolean podeMarcar() {
        return false; // Questoes de múltipla escolha só podem ser selecionadas e não podem ser marcadas.
    }

    @Override
    public boolean podeSelecionar() {
        return true; 
    }
    
}
