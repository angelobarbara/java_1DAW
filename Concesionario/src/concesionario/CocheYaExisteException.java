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
public class CocheYaExisteException extends Exception {

    public CocheYaExisteException(String el_coche_ya_existe) {
        super(el_coche_ya_existe);
    }
    
}
