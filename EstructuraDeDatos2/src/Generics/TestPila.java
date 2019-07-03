/**
 * 
 */
package Generics;

import Persona.Persona;
import Utiles.Menu;
import Utiles.Teclado;

/**
 * @author d17barba
 *
 */
public class TestPila {
	
	static Pila<Persona> pila = null;
	static Menu menu = new Menu("\nPila",new String[]{"Crear pila","Añadir a la pila","Sacar elemento","Cima de la pila","Vaciar pila"});

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionar(opcion);
		} while (opcion != menu.getSalir());

	}

	private static void gestionar(int opcion) {
		if(opcion != 1 && pila == null) {
			System.out.println("Crea la pila antes");
			return;
		}

		switch(opcion) {
		
			case 1:
				pila = new Pila<Persona>();
				break;
			case 2:
				pila.push(new Persona(Teclado.leerCadena("nombre"), Teclado.leerCadena("apellidos")));
				break;
			case 3:
				pila.pop();
				break;
			case 4:
				pila.top();
			case 5:
				while(!pila.isEmpty())
					System.out.println("Desapilo de la pila: " + pila.pop());
			default:
				return;		
		}
	}

}
