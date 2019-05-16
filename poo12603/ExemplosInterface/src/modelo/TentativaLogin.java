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
public class TentativaLogin {
    private final String usuario, senha;
    
    public TentativaLogin(String u, String s) {
        usuario = u;
        senha = s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TentativaLogin){
            TentativaLogin t = (TentativaLogin) obj;
            return usuario.equals(t.usuario) && senha.equals(t.senha); 
        }
        return false;
    }
}
