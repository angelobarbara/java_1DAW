package listado3;
import javax.swing.SingleSelectionModel;


import utiles.*;

public class TestPila {

	
	private static Personas persona;
	static Pila<Personas> pila = new Pila<Personas>();
	
	public static void main(String[] args) {
		
		pila.push(new Personas(("a"),("b")));
		pila.push(new Personas(("c"),("d")));
		pila.push(new Personas(("f"),("g")));
		pila.push(new Personas(("h"),("i")));
		pila.push(new Personas(("j"),("k")));
	
		Menu menu = new Menu("Pila",
				new String[] {"Añadir elemento", "Mostrar último elemento","Eliminar último elemento","Vaciar pila de elementos"});
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
				pila.push(new Personas(Teclado.leerCadena("Introduzca un nombre: "), Teclado.leerCadena("Introduzca un apellido")));
				break;
			case 2:
				top();	
				break;
			case 3:
				System.out.println("Elemento eliminado " + pila.pop());
				break;
			case 4:
				while(!pila.isEmpty())
					System.out.println("Desapilo este elemento: " + pila.pop());
				break;
			default:
				return;		
		}
		System.out.println(pila.pilas);
	}

	private static void top() {
		try {
			System.out.println("Elemento mostrado " + pila.top());
		} catch (PilaEstaVaciaExeption e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	


}
