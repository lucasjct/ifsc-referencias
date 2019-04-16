/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listacompras;

/**
 *
 * @author aluno
 */
public class ListaCompras {
    private Produto[] produtos;
    private int quantidade;
    private boolean pronta;
    
    public ListaCompras() {
        produtos = new Produto[5];
        quantidade = 0;
        pronta = false;
    }
    
    public boolean estaPronta() {
        return pronta;
    }
    
    public int quantosProdutos() {
        return quantidade;
    }
    
    public void registrar(Produto p) {
        if(quantidade < 5 && pronta == false) {
            produtos[quantidade] = p;
            quantidade++;
        }
    }
    
    public void pronta() {
        pronta = true;
    }
    
    public Produto maisComprado() {
        Produto maiorQuantidade = produtos[0];
        
        for(int i = 1; i < quantidade; ++i)
            if(maiorQuantidade.quantidade < produtos[i].quantidade)
                maiorQuantidade = produtos[i];
        
        return maiorQuantidade;
    }
    
    public Produto maisCaro() {
        Produto maisCaro = produtos[0];
        
        for(int i = 1; i < quantidade; ++i)
            if(maisCaro.precoTotal() < produtos[i].precoTotal())
                maisCaro = produtos[i];
        
        return maisCaro;
    }
}
