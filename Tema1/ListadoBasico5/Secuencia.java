/*
 * Busca la secuencia en orden creciente más larga dentro de un vector de
 * enteros inicializado aleatoriamente (Math.random()). Se mostrará tanto la
 * posición de la primera componente de la secuencia como el tamaÃ±o de la misma.
 * 
 * @author mlmc
 */
public class Secuencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int tamanno = 20;// modificador final, porque no va a a cambiar
								// durante todo el programa
		int[] vector = new int[tamanno];

		int posicion = 0, longitud = 0;// para revisar todas las secuencias
										// crecientes
		int posMasLarga = 0, longitudMasLarga = 0;// almacena la secuencia más
													// larga
		int valorAnterior = 0;

		// inicialización y visualización
		inicializaAleatoriamente(vector);
		mostrar(vector);

		System.out.println();
		for (int i = 0; i < vector.length; i++) {

			if (vector[i] >= valorAnterior) {// sigue creciendo
				longitud++;
				System.out.print(">=\t");
			} else {// inicia nueva secuencia
				System.out.print("s\t");
				if (longitud > longitudMasLarga) {// la secuencia era la más
													// larga hasta ahora
					longitudMasLarga = longitud;
					posMasLarga = posicion;
				}
				longitud = 1;// ?La longitud mínima de una secuencia es 1.
								// ANTES
								// ESTABA A 0 Y FALLABA
				posicion = i;

			}
			valorAnterior = vector[i];
		} // for

		// reviso la última secuencia.
		if (longitud > longitudMasLarga) {
			longitudMasLarga = longitud;
			posMasLarga = posicion;
		}

		// visualizo gráficamente la mayor secuencia
		mostrarResultados(vector, posMasLarga, longitudMasLarga);
	}// main

	/**
	 * @param vector
	 * @param posMasLarga
	 * @param longitudMasLarga
	 */
	private static void mostrarResultados(int[] vector, int posMasLarga, int longitudMasLarga) {
		System.out.println();
		for (int i = 0; i < vector.length; i++) {
			if ((posMasLarga + longitudMasLarga - 1) == i)
				System.out.print("*");// acaba la secuencia
			System.out.print(i);
			if (posMasLarga == i)
				System.out.print("s");// comienza la secuencia

			System.out.print("\t");

		} // for
		System.out.println(
				"\nLa secuencia más larga comienza en " + posMasLarga + " y mide " + longitudMasLarga + " valores.");
	}

	private static void mostrar(int[] vector) {
		for (int i = 0; i < vector.length; i++)
			System.out.print(vector[i] + "\t");
	}

	/**
	 * @param vector
	 */
	private static void inicializaAleatoriamente(int[] vector) {
		for (int i = 0; i < vector.length; i++)
			vector[i] = (int) (Math.random() * 10);
	}
}// class
