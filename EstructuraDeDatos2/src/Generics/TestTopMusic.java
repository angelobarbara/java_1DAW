package Generics;

import Persona.Persona;
import Utiles.Menu;
import Utiles.Teclado;

public class TestTopMusic {
	private static TopMusic musica = new TopMusic();
	static Menu menu = new Menu("\nTopMusic",new String[]{"A�adir cancion","Sacar una cancion","Subir puesto de una cancion","Bajar puesto de una cancion",
			"Mostrar lista", "Mostrar canci�n m�s escuchada"});

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
				annadirCancion();
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

	private static boolean annadirCancion() {
		int index = Teclado.leerEntero("En que posici�n quieres a�adir la canci�n?"), anno = Teclado.leerEntero("A�o cancion");
		String nombre = Teclado.leerCadena("Nombre canci�n"), artista = Teclado.leerCadena("Artista");
		if(!musica.rangeSetAdd(index) || index == 0)
			System.out.println("\nERROR. Se introducir� en la primera posicion libre"); 
		return musica.annadirCancion(musica.size()-1,nombre,artista,anno);
			
		
		
	}
}

