package angeloBarbaraAcumulaSuma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Angelo Barbara
 * @version 1.0
 */

public class TestAcumulaSuma {
	private static Scanner scanner = new Scanner(System.in);
	private static int suma;

	public static void main(String[] args) {
		readFile();
		sumar();
		writeFile();
	}

	private static void writeFile() {
		try (PrintWriter write = new PrintWriter("fichero.txt")) {
			write.println(suma);
		} catch (Exception e) {
			System.out.println("Error al guardar el fichero");
		}

	}

	private static void sumar() {
		int numero = 1;
		System.out.println(
				"Introduzca números consecutivamente y almacenaré la suma en un fichero.txt. Introduza 0 para salir");
		do {
			try {
				numero = Integer.parseInt(scanner.nextLine());
				suma += numero;
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir enteros");
			}
		} while (numero != 0);
	}

	private static int readFile() {
		File fichero = new File("fichero.txt");
		if (fichero.exists()) {
			try (BufferedReader entrada = new BufferedReader(new FileReader("fichero.txt"))) {
				suma = Integer.parseInt(entrada.readLine());
			} catch (Exception e) {
				System.out.println("ERROR!!!");
			}
		} else
			System.out.println("La suma se inicializará a 0");
		return suma;

	}
}
