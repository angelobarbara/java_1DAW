/**
 * 
 */
package examenDiciembreAngeloBarbaraJuanAntonioBujalanceGarcia.alumno;

import java.util.Arrays;

/**
 * @author d17barba
 *
 */
public class Alumno {

	private String nombre;
	private float[] notas = new float[NUM_ASIGNATURAS];
	public static final int NUM_ASIGNATURAS = 5;
	private static final float NOTA_MAXIMA = 10;
	private static final float NOTA_MINIMA = 0;
	private static final float ERROR_ASIGNATURA_NO_VALIDA = -1;
	private static final float NEGATIVO = 1;
	private static final float POSITIVO = 1;

	/**
	 * @param nombre
	 */
	Alumno(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param asignatura
	 * @param nota
	 */
	void setNotas(int asignatura, float nota) {
		if (!esAsignaturaValida(asignatura))
			return;
		this.notas[asignatura] = captarNotaValida(nota);
	}

	@Override
	public String toString() {
		String mensaje = "Alumno [nombre=" + nombre + ", notas=" + Arrays.toString(notas) +"]";
		
		return comprobarPromocion() ? mensaje + "\nPromociona" : mensaje + "\nNo Promociona";
	}

	/**
	 * @param nota
	 * @return
	 */
	private static float captarNotaValida(float nota) {
		if (nota > NOTA_MAXIMA)
			return NOTA_MAXIMA;
		if (nota < NOTA_MINIMA)
			return NOTA_MINIMA;
		return nota;
		// if(!esNotaValida(nota))
		// return 0;
		// return nota;
	}

	/**
	 * @param asignatura
	 * @return
	 */
	float getNota(int asignatura) {
		return notas[asignatura];
	}

	/**
	 * @param asignatura
	 * @return
	 */
	public static boolean esAsignaturaValida(int asignatura) {
		return (asignatura > -1 && asignatura < Alumno.NUM_ASIGNATURAS);
	}

	/**
	 * @param nota
	 * @return
	 */
	public static boolean esNotaValida(float nota) {
		return (nota >= 0 && nota <= 10);
	}

	/**
	 * @param asignatura
	 */
	void positivo(int asignatura) {
		float nota = getNota(asignatura);
		if (nota != ERROR_ASIGNATURA_NO_VALIDA)
			setNotas(asignatura, nota + POSITIVO);
	}

	/**
	 * @param asignatura
	 */
	void negativo(int asignatura) {
		float nota = getNota(asignatura);
		if (nota != ERROR_ASIGNATURA_NO_VALIDA)
			setNotas(asignatura, nota - NEGATIVO);
	}

	/**
	 * @return
	 */
	boolean comprobarPromocion() {
		int contador = 0;
		for (float nota : notas)
			if (nota >= 5)
				contador++;
		return (contador >= 3);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	//public String toString1() {
		//String mensaje = "Alumno nombre= " + nombre + ", notas= ";
		//for (int i = 0; i < notas.length; i++)
			//mensaje += notas[i] + " ";

		//return comprobarPromocion() ? mensaje + "\nPromociona" : mensaje + "\nNo Promociona";
	//}
}
