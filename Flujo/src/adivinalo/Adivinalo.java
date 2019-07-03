package adivinalo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import utiles.MiTeclado;

public class Adivinalo {

	public static void writeFile(int record) throws IOException {

		try (PrintWriter write = new PrintWriter("record.txt")) {
			write.println(record);
		}
	}

	public static int readFile() throws Exception {

		File fichero = new File("record.txt");

		if (fichero.exists()) {
			try (BufferedReader entrada = new BufferedReader(new FileReader("record.txt"))) {

				int numero = Integer.parseInt(entrada.readLine());
				return numero;
			}

		}
		return 0;

	}

	public static int game() {
		int numero = (int) (Math.random() * 101);
		int intentos = 0;

		do {
			int entero = MiTeclado.pedirEntero();
			intentos++;
			if (entero < numero)
				System.out.println("Pensé en un número más grande");
			else if (entero > numero)
				System.out.println("Pensé en un número más pequeño");
			else {
				System.out.format("Enhorabuena!!! Lo acertaste con %d intentos.%n", intentos);
				return intentos;
			}
		} while (true);

	}
}
