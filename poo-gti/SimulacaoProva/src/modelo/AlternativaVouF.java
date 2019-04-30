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
public class AlternativaVouF extends Alternativa {

    public AlternativaVouF(String e, boolean correta) {
        super(e, (correta)? EstadoAlternativa.MARCADO_V : EstadoAlternativa.MARCADO_F, TipoQuestao.VERDADEIRO_OU_FALSO);
    }

    @Override
    public boolean podeMarcar() {
        return true;
    }

    @Override
    public boolean podeSelecionar() {
        return false; // Questoes de V ou F só podem ser marcadas e não podem ser selecionada.
    }
    
}
