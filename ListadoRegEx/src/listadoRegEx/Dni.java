/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utiles.TecladoScanner;

/**
 *
 * @author osterman
 */
public class Dni {

    private static final String DNI_REGEX = "^\\d{8}[a-zA-Z&&[^IÑOU]]$";
    private static final Pattern pattern = Pattern.compile(DNI_REGEX);
    private static Matcher matcher;
    private static boolean found = false;
    public static void main(String[] args) {
        
        do{
            matcher = pattern.matcher(TecladoScanner.leerCadena("Introduzca su DNI"));
            
            if(matcher.find()){
                System.out.println("Ya tenemos su DNI!!!");
                found = true;
            }
            else
                System.out.println("El DNI NO es válido.");
        }while(!found);
        
    } 
}
