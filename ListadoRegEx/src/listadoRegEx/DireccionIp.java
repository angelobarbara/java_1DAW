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
public class DireccionIp {
    private static Matcher matcher;
    private static final String IP_REGEX = "^((2[0-4]\\d|"          //de 200 a 249
            + "25[0-5]|"                    //de 250 a 255
            + "1\\d\\d|"                    //de 100 a 199
            + "[1-9]?\\d)\\.){3}"           //de 0 a 99
            + "(2[0-4]\\d|"
            + "25[0-5]|"
            + "1\\d\\d|"
            + "[1-9]?\\d)$";
    private static final Pattern pattern = Pattern.compile(IP_REGEX);
    private static boolean found = false;
    public static void main(String[] args) {
        
        do{
            matcher = pattern.matcher(TecladoScanner.leerCadena("Introduzca una dirección ip"));
            
            if(matcher.find()){
                System.out.println("Ya tenemos tu dirección ip!!!");
                found = true;
            }
            else
                System.out.println("La dirección NO es correcta.");
        }while(!found);
        
    }
}
