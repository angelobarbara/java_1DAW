package exception;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		metodo();
		
	}

	private static int metodo() {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduce un entero: ");
				return scanner.nextInt();
			} catch (Exception e) {
				System.err.println("Introduzca un valor válido");
				scanner.nextLine();
			} 
		} while (true);
	}
}
