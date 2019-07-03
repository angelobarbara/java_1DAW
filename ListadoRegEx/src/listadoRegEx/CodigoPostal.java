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
public class CodigoPostal {

    private static final String CP_REGEX = "^\\d{5}$";
    private static final Pattern pattern = Pattern.compile(CP_REGEX);
    private static Matcher matcher;
    private static boolean found = false;
    public static void main(String[] args) {
        
        do{
            
            matcher = pattern.matcher(TecladoScanner.leerCadena("Introduzca su código postal"));
            
            if(matcher.find()){
                System.out.println("Ya tenemos su código postal!!!");
                found = true;
            }
            else
                System.out.println("El código introducido NO es válido.");
        }while(!found);
        
    }
}
