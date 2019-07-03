package delTecladoAlFichero;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DelTecladoAlFichero {

	private static Scanner scanner = new Scanner(System.in);
	private static String cadena;

	public static void main(String[] args) {
		System.out.println("El programa almacenará todo lo que introduzca por teclado"
				+ "y podrá salir escribiendo SALIR en mayuscula y " 
				+ "en una nueva linea");
		try (PrintWriter write = new PrintWriter("scanner.txt")){
			do{
				cadena = scanner.nextLine();
				write.println(cadena);
			}while(!cadena.equals("SALIR"));
		}catch(FileNotFoundException e) {
			System.out.println("ERROR!");
		}
	}
}
