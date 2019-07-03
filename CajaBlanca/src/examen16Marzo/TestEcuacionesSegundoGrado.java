package examen16Marzo;

/**
 * Define la clase TestEcuacionesSegundoGrado que muestre las soluciones de una
 * ecuaci�n de segundo grado ax2 + bx + c = 0. Se le preguntar� al usuario si
 * quiere repetir el programa.
 */
public class TestEcuacionesSegundoGrado {
	public static void main(String[] args) {
		int[] coeficientes = new int[3];
		char respuesta;
		double x1, x2, discriminante;
		int curso, nota;
		
		do {
			do {
				System.out.println("Introduce tu curso: " + "\n1. Primero de la ESO" + "\n2. Segundo de la ESO");
				curso = Teclado.LeeEntero();
			} while (curso != 1 && curso != 2);
			do {
				System.out.println("Introduce tu nota en matem�ticas: ");
				nota = Teclado.LeeEntero();
			} while (nota < 0 || nota > 10);

			if (curso == 2 && nota >= 5) {

				// Muestra por pantalla las instrucciones del programa
				System.out.println(
						"Una ecuaci�n de segundo grado tiene la siguiente forma: ax2 + bx + c = 0\nIntroduzca los valores de a, b y c para calcular el valor de x");

				// Pide al usuario por teclado los tres coeficientes de la
				// ecuaci�n
				// de segundo grado
				System.out.println("Introduzca el valor de a: ");
				coeficientes[0] = Teclado.LeeEntero();
				System.out.println("Introduzca el valor de b: ");
				coeficientes[1] = Teclado.LeeEntero();
				System.out.println("Introduzca el valor de c: ");
				coeficientes[2] = Teclado.LeeEntero();

				// Calcula el discriminante y realiza los c�lculos necesarios
				discriminante = (Math.pow(coeficientes[1], 2)) - (4 * coeficientes[0] * coeficientes[2]);
				if (coeficientes[0] == 0) {
					System.out.println("La ecuaci�n introducida no es una ecuaci�n de segundo grado.");
				} else if (discriminante > 0) {
					x1 = (-coeficientes[1] + Math.sqrt(discriminante)) / (2 * coeficientes[0]);
					x2 = (-coeficientes[1] - Math.sqrt(discriminante)) / (coeficientes[0] * coeficientes[0]);
					System.out.println("Resultados de la ecuaci�n:\nx1 = " + x1 + "x2 = " + x2);
				} else if (discriminante == 0) {
					x1 = -coeficientes[1] / (2 * coeficientes[0]);
					System.out.println("La solucion es doble. x = " + x1);
				} else
					System.out.println("El discriminante es " + discriminante
							+ " (menor que 0), por lo que la ecuaci�n no tiene soluci�n real.");
			} else {
				System.out.println("Debes de practicar antes de realizar la ecuaci�n de segundo grado.");
			}
			// Pregunta al usuario si desea continuar pidiendo un caracter (s/n)
			System.out.println("�Desea continuar? (s/n): ");
			respuesta = Teclado.LeeCaracter();

		} while ((respuesta == 's'));
	}
}
