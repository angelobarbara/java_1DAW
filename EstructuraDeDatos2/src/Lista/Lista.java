package Lista;

import java.util.ArrayList;
import java.util.Iterator;

import Lista.Jugador.Posicion;

public class Lista {
	ArrayList<Jugador> equipo = new ArrayList<Jugador>();
	
	/**
	 * Añade al final de la lista un jugador
	 * @param nombre del jugador
	 */
	
	public boolean annadirJugador(String nombre,Posicion posicionJugador){
		if(equipo.contains(nombre))
			return false;
		return equipo.add(new Jugador(nombre,posicionJugador));
	}
	
	/**
	 * Añade jugador en la posición indicada
	 * @param nombre del jugador
	 * @param posiscion en la que se debe insertar el jugador
	 */
	public boolean annadirJugador(String nombre,Posicion posicionJugador,int posicion){
		if(equipo.contains(nombre))
			return false;
		equipo.add(posicion,new Jugador(nombre,posicionJugador));
		return true;
	}
	
	/**
	 * Modifica un elemento reeplazándolo por otro
	 * @param nombre del jugador
	 * @param posicion del elemento
	 */
	public boolean modificarJugador(String nombre,Posicion posicionJugador,int posicion){
		if(rangeSetAdd(posicion))
			return false;
		equipo.set(posicion,new Jugador(nombre,posicionJugador));
		return true;
	}
	
	private boolean rangeSetAdd(int posicion) {
		return (posicion < 0 || posicion > size());
		}

	
	public int  size(){
		return equipo.size();
	}
	/**
	 * Elinima al jugador de la posición indicada
	 * @param posicion
	 */
	public boolean eliminarJugador(int posicion){
		if(rangeRemoveGet(posicion))
			return false;
		equipo.remove(posicion);
		return true;
	}
	
	
	private boolean rangeRemoveGet(int posicion) {
		return (posicion < 0 || posicion >= size());
	}

	public Jugador buscaJugador(String nombre,Posicion posicionJugador) {
		int index = equipo.indexOf(new Jugador(nombre,posicionJugador));
		if(index==-1)
			return null;
		return equipo.get(index);
//		for(Jugador jugador : equipo)
//			if(jugador.getNombre().equals(nombre))
//				return jugador;
//		return null;
	}
	
//	public boolean buscaJugador(String nombre) {
//		equipo.contains(nombre);
//	}
	/**
	 * Devuelve el tamaño actual de la lista
	 * @return
	 */
	
	public ArrayList<Jugador> copiaEquipo(){
		return (ArrayList<Jugador>) equipo.clone();
	}

	
//	public Jugador copiaEquipo1() {
//		return (Jugador) equipo.clone();
//	}
}
