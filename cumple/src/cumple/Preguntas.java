/**
 * 
 */
package cumple;

/**
 * @author d17barba
 *
 */
public class Preguntas {

	/**
	 * @param argso
	 */
	public static void main(String[] args) {
		int dos = preguntaUno();
		System.out.println("adios");

	}

	private static int preguntaUno() {
		int uno = 0;
		do {
			uno = Teclado.leerEntero("uno: ");
		}while(uno!=3);
		return uno;
	}

}
