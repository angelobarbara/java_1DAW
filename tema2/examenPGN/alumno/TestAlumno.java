/**
 * 
 */
package examenDiciembreAngeloBarbaraJuanAntonioBujalanceGarcia.alumno;

import examenDiciembreAngeloBarbaraJuanAntonioBujalanceGarcia.utiles.*;

/**
 * @author d17barba
 *
 */
public class TestAlumno {
	static Alumno alumno = null;
	final static String mensaje = "El alumno no se ha creado todavía";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Menu menuAlumno = new Menu("Examen Angelo Barbara Juan Antonio Bujalance",
				new String[] { "Crear alumno", "Asignar nota", "Positivo", "Negativo", "Comprobar si promociona" });

		int opcion;
		do {
			opcion = menuAlumno.gestionar();
			gestionar(opcion);
		} while (opcion != menuAlumno.getSalir());
	}

	private static void gestionar(int opcion) {
		if (alumno == null && opcion != 1) {
			System.err.print(mensaje);
			return;
		}
		switch (opcion) {
		case 1:
			alumno = new Alumno(Teclado.leerCadena("Introduzca el nombre del alumno: "));
			break;
		case 2:
			setNota();
			break;
		case 3:
			alumno.positivo(pedirNumeroAsignatura());
			break;

		case 4:
			alumno.negativo(pedirNumeroAsignatura());
			break;
		case 5:
			break;
		default:// salir
			System.out.print("Aaaaaaaaaaaaadios");
			return;

		}
		System.out.print(alumno);

	}

	/**
	 * 
	 */
	private static void setNota() {
		alumno.setNotas(pedirNumeroAsignatura(), pedirNotaAsignatura());
	}

	/**
	 * @return
	 */
	private static int pedirNumeroAsignatura() {
		int numAsignatura;
		do {
			numAsignatura = Teclado
					.leerEntero("Dame el número de la asignatura: del 1 al " + Alumno.NUM_ASIGNATURAS + ":") - 1;
		} while (!Alumno.esAsignaturaValida(numAsignatura));
		return numAsignatura;
	}

	/**
	 * @return
	 */
	private static float pedirNotaAsignatura() {
		float nota;
		do {
			nota = (float) Teclado.leerDecimal("Dame una nota entre 0 y 10");
		} while (!Alumno.esNotaValida(nota));
		return nota;
	}
}
