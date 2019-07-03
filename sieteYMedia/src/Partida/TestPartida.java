/**
 * 
 */
package Partida;
import java.util.*;

import Utiles.*;
import Jugador.*;

/**
 * @author Angelo Barbara
 *
 */
public class TestPartida {
	
	private static final float PUNTOS_MAXIMOS = (float) 7.5;
	private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private static Partida partida = null;

	
	public static void main(String[] args) {
		
		Menu menuJuego = new Menu("Siete y Media", new String[] {"Comenzar partido", "Añadir jugador", "Eliminar jugador", "Jugar", "Ranking", "Empezar nuevo partido"});
		
		int opcion;
		
		do {
			opcion = menuJuego.gestionar();
			gestionar(opcion);
		}while(opcion != menuJuego.getSalir());

	}

	private static void gestionar(int opcion) {
		
		if(partida == null && opcion != 1) {
			System.err.println("Comienze el partido");
			return;
		}
		
		switch(opcion) {
		
		case 1:
			comenzarPartido();
			break;
			
		case 2:
			annadirJugador();
			break;
			
		case 3:
			eliminarJugador();
			break;
			
		case 4:
			partida.juego();
			break;
			
		case 5:
			ranking();
			break;
			
		case 6:
			nuevoPartido();
			break;
			
		default:
			break;
		}
		
	}

	private static void comenzarPartido() {
		annadirJugadores();
		partida = new Partida(jugadores);
		
	}

	private static void nuevoPartido() {
		jugadores = new ArrayList<Jugador>();
//		partida = new Partida(jugadores);
//		annadirJugadores();
		comenzarPartido();
	}

	private static void annadirJugador() {
		
		jugadores.add(new Jugador(Teclado.leerCadena("\nIntroduzca el nombre del jugador?\n")));
		
	}

	private static void ranking() {
		
		Collections.sort(jugadores);

		for(Jugador jugador : jugadores) {
			System.out.println(jugador.toString()+ ", partidas jugadas: " +jugador.getPartidasJugadas()+", partidas ganadas: "+jugador.getPartidasGanadas());
			
		}
	}
	
	private static void eliminarJugador(){
		
		int index = 0;
		int i = 0;
		mostrarJugadores();
		do {
			index = Teclado.leerEntero("\nDame el numero del jugador que quieres eliminar?\n");
		}while(control(index));
		jugadores.remove(index);
	}

	private static void annadirJugadores() {
		
		int numJugadores = 0;
		
		do{
			numJugadores = Teclado.leerEntero("\nCuantos jugadores participarán?\n");
		
		if(numJugadores <= 1) 
			System.err.println("Hacen falta mínimo 2 jugadores");
		
		}while(numJugadores<=1);
		
		
		for(int i = 0; i < numJugadores; i++)
			jugadores.add(new Jugador(Teclado.leerCadena("\nIntroduzca el nombre del jugador?\n")));
	}
	
	private static void mostrarJugadores() {
		int numeroJugador = 0;
		for(Jugador jugador : jugadores)
			System.out.println(numeroJugador+++". "+jugador.getNombre());
		
	}

	private static boolean control(int index) {
		
		return (index < 0 || index > jugadores.size()-1);
	}
	
}
