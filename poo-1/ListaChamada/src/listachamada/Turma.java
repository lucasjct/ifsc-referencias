/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listachamada;

/**
 *
 * @author aluno
 */
public class Turma {
    public final String professor, disciplina;
    private final String[] alunos;
    private int quantidade;
    private boolean aberta;
    
    public Turma(String p, String d, int i) {
        professor = p;
        disciplina = d;
        alunos = new String[i];
        aberta = true;
    }
    
    public int quantosAlunos() {
        return quantidade;
    }
    
    public boolean estadoTurma() {
        return aberta;
    }
    
    public String[] nomesAlunos() {
        return alunos;
    }
    
    public void registrar(String a) {
        if(aberta && quantidade < alunos.length) {
            alunos[quantidade] = a;
            quantidade++;
        }
    }
    
    public void fechar() {
        aberta = false;
    }
    
    public ListaChamada gerarLista() {
        ListaChamada lista = new ListaChamada(quantidade);
        
        for(int i = 0; i < quantidade; ++i)
            lista.receber(alunos[i]);
        
        return lista;
    }
}
