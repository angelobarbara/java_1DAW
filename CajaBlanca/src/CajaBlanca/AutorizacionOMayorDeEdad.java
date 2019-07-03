package CajaBlanca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutorizacionOMayorDeEdad {
	public static void main (String[] args) throws NumberFormatException, IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		char autorizacion ='s';
		
		System.out.println("Introduzca su edad");
		edad = Integer.parseInt(entrada.readLine());
		
		
		if (edad<18) {
			System.out.println("Tiene autorizacion paterna: (s/n)");
			autorizacion = entrada.readLine().charAt(0);
		}
		
		if (edad>17 || autorizacion == 'S' || autorizacion == 's')
			System.out.println("Bienvenido");
		else
			System.out.println("Acceso Denegado");
		
		
	}
}
