package Lista;
import Utiles.*;

import java.util.ArrayList;

public class TestLista {
	private static Lista lista = new Lista();
	
	
	public static void main(String[] args) {
		lista.annadirJugador("No me gusta el futbol",Jugador.Posicion.PORTERO);
		lista.annadirJugador("En serio? Futbol?",Jugador.Posicion.DEFENSA);
		lista.annadirJugador("Got mola",Jugador.Posicion.DEFENSA);
		lista.annadirJugador("Jon Targaryen",Jugador.Posicion.MEDIOCAMPO);
		
		Menu menu = new Menu("ArrayList Equipo",
				new String[] {"Añadir elemento", "Insertar elemento","Modificar elemento","Obtener tamaño lista","Eliminar elemento","Buscar elemento","Copiar lista" });
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionar(opcion);
		} while (opcion != menu.getSalir());
	}	

	private static void gestionar(int opcion) {

		switch(opcion) {
		
			case 1:
				if(!lista.annadirJugador(pedirNombre(),pedirPosicion()))
					System.err.println("No se ha podido añadir");
				break;
			case 2:
				if(!lista.annadirJugador(pedirNombre(),pedirPosicion(), pedirPosicionLista()))
					System.err.println("No se ha podido insertar");
				break;
			case 3:
				if(!lista.modificarJugador(pedirNombre(),pedirPosicion(),pedirPosicionLista()))
					System.err.println("No se ha modido modificar");
				break;
			case 4:
				System.out.println("La lista tiene " +lista.size()+ " elementos");
				break;
			case 5:
				if(!lista.eliminarJugador(pedirPosicionLista()))
					System.err.println("No se ha podido borrar el elemento");
				break;
			case 6:
				String index = pedirNombre();
				if(lista.equipo.indexOf(index) == -1) {
					System.err.println("El jugador no pertenece a nuestro equipo");
					break;
				}
				System.out.println(lista.buscaJugador(index,pedirPosicion()));
				break;
			case 7:
				System.out.println(lista.copiaEquipo());
				break;
			default:
				return;		
		}
		System.out.println(lista.equipo);

	}
	
	public static String pedirNombre(){
		//String nombre=Teclado.leerCadena("Introduce el nombre del jugador");
		return Teclado.leerCadena("Introduce el nombre del jugador");
		
	}
	
	public static Jugador.Posicion pedirPosicion(){
		Jugador.Posicion posicion = null;
		char p;
		
		do{
			p=Teclado.leerCaracter("Introduce una posicion, p(Portero)/d(Defensa)/M(Mediocampo)/a(atacante)");
			if(p=='p' || p=='P')
				posicion=Jugador.Posicion.PORTERO;
	
			else if(p=='d' || p=='D')
				posicion=Jugador.Posicion.DEFENSA;
			
			else if(p=='m' || p=='M')
				posicion=Jugador.Posicion.MEDIOCAMPO;
			
			else if(p=='a' || p=='A')
				posicion=Jugador.Posicion.ATACANTE;
			
		}while(!((p=='p' || p=='P') || (p=='d' || p=='D')|| (p=='m' || p=='M')|| (p=='a' || p=='A')));		
		return posicion;
	}
	
	public static int pedirPosicionLista(){
		int posicion=0;
		do{
			posicion=Teclado.leerEntero("Introduce una posicion entro 0 y " + (lista.size()-1));
		}while(posicion<0 || posicion>lista.size()-1);
		return posicion;
	}
	
}
