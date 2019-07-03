
package listado3;

import java.util.*;

import utiles.Menu;
import utiles.Teclado;

/**
 * Entrega la clase Lista que:
 * <ul>
 * <li>a. A\u00f1ada al final de la lista</li>
 * <li>b. Inserte un elemento en una determinada posici\u00f3n</li>
 * <li>c. Modifique un elemento reemplaz\u00e1ndolo por otro</li>
 * <li>d. Conozca el tama\u00f1o de la lista</li>
 * <li>e. Elimine elementos de la lista</li>
 * <li>f. Busque elementos en la lista</li>
 * <li>g. Copie la lista</li>
 * </ul>
 * Util\u00edzala en un ejemplo TestLista (por ejemplo, la alineaci\u00f3n de un equipo de
 * f\u00fatbol, con titulares y reservas) y entr\u00e9galo correctamente identificado y
 * documentado, incluyendo JavaDoc. Deber\u00e1s implementar un men\u00fa con las opciones
 * posibles para que el usuario lo utilice f\u00e1cilmente
 *
 * @author Angelo Barbara
 * @version 1.0
 */
public class TestLista {

	private static Lista<String> lista;
	private static Menu menuLista;

	public static void main(String[] args) {
		System.out.println("\n\tBienvenido, introduce la opci\u00f3n que desees:\n");
		Menu menu = new Menu("Elementos",
				new String[] { "Insertar elementos al final de la lista", "Insertar elemento por \u00edndice",
						"Remplazar elemento", "Tama\u00f1o de la lista", "Eliminar elemento", "Buscar elemento",
						"Copiar elemento", "Mostrar elemento" });
		ArrayList<String> cadena = new ArrayList<String>();
		cadena.add("\tElemento 1");
		cadena.add("\tElemento 2");
		cadena.add("\tElemento 3");
		cadena.add("\tElemento 4");
		cadena.add("\tElemento 5");
		cadena.add("\tElemento 6");
		lista = new Lista<String>(cadena);
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionarMenu(opcion);
		} while (opcion != menu.getSalir());
	}

	/**
	 * Gestiona un men\u00fa para manejar la lista.
	 * 
	 * @param opcion,opci\u00f3 indicada por el usuario.
	 * @throws IndiceOutOfBoundsExeption 
	 */
	private static void gestionarMenu(int opcion) {
			switch (opcion) {
			case 1:
				add();
				break;
			case 2:
				addIdx();
				break;
			case 3:
				reemplazar();
				break;
			case 4:
				size();
				break;
			case 5:
				borrar();
				break;
			case 6:
				copiar();
				break;
			case 7:
				mostrar();
				break;
			case 8:
				salir();
				break;
			}
	}

	/**
	 * Sale del men\u00fa
	 */
	private static void salir() {
		System.out.println("\tHasta Luego.");
	}

	/**
	 * Muestra la lista
	 */
	private static void mostrar() {
		System.out.println(lista.toString());
	}

	/**
	 * Copia la lista
	 */
	private static void copiar() {
		lista.copiaLista();
	}

	/**
	 * Borra un elemento de la lista.
	 */
	private static void borrar() {
		lista.borrarElemento(lista.getArraylist().get(menuLista.gestionar() - 1));
	}

	/**
	 * Muestra el tama\u00f1o de la lista de elementos.
	 */
	private static void size() {
		System.out.println("\nTama\u00f1o de la lista: " + lista.size());
	}

	/**
	 * Permite reemplazar un elemento de la lista.
	 * @throws IndiceOutOfBoundsExeption 
	 */
	private static void reemplazar() {

		try {
			lista.reemplazar(pedirIndex(), "\t" + Teclado.leerCadena("\tNuevo elemento:"));
		} catch (IndiceOutOfBoundsExeption e) {
			System.out.println(e.getMessage());
		}
	
	}

	private static int pedirIndex() {
		int index = Teclado.leerEntero("Introduzca la posicion del elemento a insertar");
		return index;
	}

	/**
	 * a\u00f1ade elemento al final de la lista.
	 */
	private static void add() {
		
		lista.add("\t" + Teclado.leerCadena("\tNuevo elemento:"));
	}

	/**
	 * a\u00f1ade elemento en una posici\u00f3n determinada de la lista.
	 * @throws IndiceOutOfBoundsExeption 
	 */ 
	private static void addIdx()  {
		
		
		try {
			lista.add("\t" + Teclado.leerCadena("\tNuevo elemento:"), Teclado.leerEntero("Posicion"));
		} catch (IndiceOutOfBoundsExeption e) {
			System.out.println(e.getMessage());
		}
		
		
//			System.out.println("\tError.No se ha podido a\u00f1adir el elemento en la posici\u00f3n indicada.");
	}
}