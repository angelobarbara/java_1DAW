package Generics;

import Persona.Persona;
import Utiles.Menu;
import Utiles.Teclado;

public class TestCola {
	static Cola<Persona> cola = null;
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
		if(opcion != 1 && cola == null) {
			System.out.println("Crea la pila antes");
			return;
		}

		switch(opcion) {
		
			case 1:
				cola = new Cola<Persona>();
				break;
			case 2:
				cola.enqueue(new Persona(Teclado.leerCadena("nombre"), Teclado.leerCadena("apellidos")));
				break;
			case 3:
				cola.dequeue();
				break;
			case 4:
				cola.front();
			case 5:
				while(!cola.isEmpty())
					System.out.println("Desapilo de la pila: " + cola.dequeue());
			default:
				return;		
		}
	}
}
