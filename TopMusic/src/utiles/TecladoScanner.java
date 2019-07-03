package utiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TecladoScanner {
	private static Scanner scanner = new Scanner(System.in);
	private static String message = "Introduzca un valor válido.";
	
	
	public static int leerEntero(){
		do {
			try {
				return scanner.nextInt();
				
			} catch (Exception e) {
				error();
			} 
		} while (true);
	}
	
	

	public static int leerEntero(String mensaje) {
		System.out.println(mensaje);
		return leerEntero();
	}
	
	

	public static double leerDecimal(){
		do {
			try {
				return scanner.nextDouble();
				
			} catch (Exception e) {
				error();
			} 
		} while (true);	
	}
	

	
	public static double leerDecimal(String mensaje) {
		System.out.println(mensaje);
		return leerDecimal();
	}
	
	

	public static char leerCaracter(){
		do {
			try {
				return scanner.nextLine().charAt(0);
				
			} catch (Exception e) {
				error();
			} 
		} while (true);
	}
	
	
	public static char leerCaracter(String mensaje) {
		System.out.println(mensaje);
		return leerCaracter();
	}

	
	public static String leerCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); // Lee una l�nea de texto (hasta intro)
		} catch (Exception e) {
			cadena = "";
		}
		return cadena;
	}
	
	
	public static String leerCadena(String mensaje) {
		System.out.println(mensaje);
		return leerCadena();
	}  
        
        public static void error(){
            System.err.println(message);
            scanner.nextLine();
        }
}
