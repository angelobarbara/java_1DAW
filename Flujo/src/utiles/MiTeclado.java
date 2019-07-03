package utiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiTeclado {
	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	public static int pedirEntero() {

		do {
			try {
				return Integer.parseInt(teclado.readLine());
			} catch (Exception e) {
				System.out.println("Introduzca un número entero. ");
			}
		} while (true);
	}

	public static int pedirEntero(String string) {
		System.out.println(string);
		return pedirEntero();
	}

	/**
	 * Pregunta al usuario si desea jugar de nuevo
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean deseaContinuar() throws IOException {
		
		char cadena;

		System.out.println("¿Deseas jugar otra vez?(s/n)");
		do {
			cadena = teclado.readLine().charAt(0);
		} while (cadena != 'S' && cadena != 's' && cadena != 'N' && cadena != 'n');
		return cadena == 's' || cadena == 'S';
	}
}
