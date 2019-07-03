/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utiles.*;

/**
 *
 * @author osterman
 */
public class DireccionMac {
    private static final String MAC_REGEX = "^(?i)([0-9A-F]{2}:){5}([0-9A-F]{2})$";
    private static final Pattern pattern = Pattern.compile(MAC_REGEX);
    private static Matcher matcher;
    private static boolean found = false;
    
    public static void main(String[] args){
        
        do{
            matcher = pattern.matcher(TecladoScanner.leerCadena("Introduzca una "
                    + "dirección MAC (XX:XX:XX:XX:XX:XX)"));
        
            if(matcher.find()){
                System.out.println("Ya tenemos tu dirección MAC!!!");
                found = true;
            }
            else
                System.out.println("La dirección NO es correcta.");
        }while(!found);
    }
}
