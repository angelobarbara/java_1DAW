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
public class CuentaCorriente {

    private static final String CUENTA_REGEX = "^([a-zA-Z]){2}\\d{20}$";
    private static final Pattern pattern = Pattern.compile(CUENTA_REGEX);
    private static Matcher matcher;
    private static boolean found = false;
    public static void main(String[] args) {
        
        do{
            
            matcher = pattern.matcher(TecladoScanner.leerCadena("Introduzca su cuenta corriente"));
            
            if(matcher.find()){
                System.out.println("Ya tenemos su cuenta corriente!!!");
                found = true;
            }
            else
                System.out.println("El número de cuente NO es válido.");
        }while(!found);
        
    }
}
