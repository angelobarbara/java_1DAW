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
public class Contrasena {
    private static Matcher matcher;
    private static final String PWD_REGEX = "^(?=.*[a-z])"           //Caracteres en minúsculas (a–z)
            + "(?=.*[A-Z])"                 //Caracteres en minúsculas (a–z)
            + "(?=.*\\d)"                   //Base de 10 dígitos (0–9)
            + "(?=.*\\p{Punct})|"           //Caracteres no alfanuméricos (por ejemplo: !, $, #, o %)
            + "^(?=.*[a-z])"
            + "(?=.*[A-Z])"
            + "(?=.*\\d)|"
            + "^(?=.*[a-z])"
            + "(?=.*[A-Z])"
            + "(?=.*\\p{Punct})|"
            + "^(?=.*[a-z])"
            + "(?=.*\\d)"
            + "(?=.*\\p{Punct})|"
            + "^(?=.*[A-Z])"
            + "(?=.*\\d)"
            + "(?=.*\\p{Punct}).{6,}$";
    private static final Pattern pattern = Pattern.compile(PWD_REGEX);
    private static boolean found = false;
    public static void main(String[] args) {
        
        do{
            //(?=.*\\p{Punct})
            matcher = pattern.matcher(TecladoScanner.leerCadena("Introduzca su contraseña."
                    + "La contraseña debe contener al menos:\n" +
                        "i. Caracteres en mayúsculas (A–Z)\n" +
                        "ii. Caracteres en minúsculas (a–z)\n" +
                        "iii. Base de 10 dígitos (0–9)\n"
                    + "iv. Caracteres no alfanuméricos (por ejemplo: !, $, #, o %)"));
            
            if(matcher.find()){
                System.out.println("Ya tenemos su contraseña!!!");
                found = true;
            }
            else
                System.out.println("La contraseña introducida NO es válida.");
        }while(!found);
        
    }
}
