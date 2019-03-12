package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre
 */
interface Instalavel {
    /**
     * Deve instalar o objeto se ele nao foi ainda instalada.
     */
    public void instalar();
    
    /**
     * @return True se o objeto já foi instalado.
     */
    public boolean instalado();
    
    /**
     * @return True se o objeto está pronto para ser instalado.
     */
    public boolean prontoInstalar();
}
