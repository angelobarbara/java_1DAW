package adivinalo;

import utiles.MiTeclado;

public class TestAdivinalo {
	private static boolean nuevoRecord;
	private static int record;
	private static int intentos;

	public static void main(String[] args) {
		System.out.println("Pensaré en un número entre 0 y 100 y tendrás"
				+ "que adivinarlo. Solo diré si el número en el que pensé " + "es mayor o minor al suyo.");

		try {
			juego();
			if (nuevoRecord)
				Adivinalo.writeFile(intentos);
		} catch (Exception e) {
			System.err.println("ERROR!");
		}
	}

	private static void juego() throws Exception {
		System.out.println("Introduzca un número entre 0 y 100");
		do {
			record = Adivinalo.readFile();
			if (record != 0)
				System.out.format("El record actual es de %d intentos.%n", record);
			intentos = Adivinalo.game();
			nuevoRecord = record(record, intentos);
		} while (MiTeclado.deseaContinuar());

	}

	private static boolean record(int record, int intentos) {
		if (intentos < record) {
			System.out.format("Enhorabuena tenemos un nuevo record!!! Intentos : %d.%n", intentos);
			return true;
		}
		return false;
	}
}
