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
public class CorreoElectronico {

    private static final String CORREO_REGEX = "\\w+@[a-z]+\\.[a-z]+";
    private static final Pattern pattern = Pattern.compile(CORREO_REGEX);
    private static Matcher matcher;
    private static boolean found = false;
    public static void main(String[] args) {
        
        do{
            
            matcher = pattern.matcher(TecladoScanner.leerCadena("Introduzca su correo"));
            
            if(matcher.find()){
                System.out.println("Ya tenemos su correo!!!");
                found = true;
            }
            else
                System.out.println("El correo electrónico NO es válido.");
        }while(!found);
        
    }
}
