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
public class MatriculaNoValidaException extends Exception {

    public MatriculaNoValidaException(String la_matricula_no_es_valida) {
        super(la_matricula_no_es_valida);
    }
    
}
