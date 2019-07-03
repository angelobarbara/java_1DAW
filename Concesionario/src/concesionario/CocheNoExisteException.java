/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author osterman
 */
public class CocheNoExisteException extends Exception {

    public CocheNoExisteException(String el_coche_no_existe) {
        super(el_coche_no_existe);
    }
    
}
