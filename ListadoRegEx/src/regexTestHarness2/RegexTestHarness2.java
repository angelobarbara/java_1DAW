/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexTestHarness2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author osterman
 */
public class RegexTestHarness2 {

	public static void main(String[] args){
//    	Console console = System.console();
//    	if (console == null) {
//        	System.err.println("No console.");
//        	System.exit(1);
//    	}
    	while (true) {

        	Pattern pattern =
        	Pattern.compile(Teclado.leerCadena("Enter your regex: "));

        	Matcher matcher =
        	pattern.matcher(Teclado.leerCadena("Enter input string to search: "));

        	boolean found = false;
        	while (matcher.find()) {
            	System.out.println("I found the text " +matcher.group()+
           			 " starting at index " +matcher.start()+
           			 " and ending at index " +matcher.end());
            	found = true;
        	}
        	if(!found){
            	System.out.println("No match found.");
        	}
    	}
	}
}
