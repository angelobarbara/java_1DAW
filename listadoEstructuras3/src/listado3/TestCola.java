package listado3;
import javax.swing.SingleSelectionModel;


import utiles.*;

public class TestCola {

	
	private static Personas persona;
	static Cola<Personas> cola = new Cola<Personas>();
	
	public static void main(String[] args) {
		
		cola.annadir(new Personas(("jose"),("perez")));
		cola.annadir(new Personas(("antonio"),("diaz")));
		cola.annadir(new Personas(("pepe"),("mollano")));
		cola.annadir(new Personas(("paco"),("padillo")));
		cola.annadir(new Personas(("luis"),("bonilla")));
	
		Menu menu = new Menu("Cola",
				new String[] {"Añadir elemento", "Mostrar primer elemento","Eliminar primer elemento","Vaciar cola de elementos"});
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionar(opcion);
		} while (opcion != menu.getSalir());
	}	

	private static void gestionar(int opcion) {

		switch(opcion) {
		
			case 1:
				System.out.println("Elemento añadido ");
				cola.annadir(new Personas(Teclado.leerCadena("Introduzca un nombre: "), Teclado.leerCadena("Introduzca un apellido")));
				break;
			case 2:
				System.out.println("Elemento mostrado " + cola.front());	
				break;
			case 3:
				System.out.println("Elemento eliminado " + cola.borrar());
				break;
			case 4:
				while(!cola.isEmpty())
					System.out.println("Desapilo este elemento: " + cola.borrar());
				break;
			default:
				return;		
		}
		System.out.println(cola.cola);
	}
	
	
	


}