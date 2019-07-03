package Generics;

import java.util.ArrayList;
import Generics.Musica;

public class TopMusic {
	
	ArrayList<Musica> canciones = new ArrayList<Musica>();
	
	boolean annadirCancion(int index, String nombre, String artista, int anno) {
		if(!rangeSetAdd(index))
			return false;
		canciones.add(index, new Musica(nombre, artista, anno));
		return true;
	}
	
	Musica getMusica(int index) {
		return canciones.remove(index);
	}
	
	void subirPuesto(int index) {
		if(!rangeSetPuestoSubir(index))
			return;
		Musica tmp = canciones.get(index-1);
		canciones.set(index-1, canciones.get(index));
		canciones.set(index,tmp);
	}
	
	private boolean rangeSetPuestoSubir(int posicion) {
		return (posicion <= 0 || posicion > size());
	}

	void bajarPuesto(int index) {
		if(!rangeSetPuestoBajar(index))
			return;
		Musica tmp = canciones.get(index+1);
		canciones.set(index+1, canciones.get(index));
		canciones.set(index, tmp);
	}
	
	@Override
	public String toString() {
		return "TopMusic [canciones=" + canciones + "]";
	}

	private boolean rangeSetPuestoBajar(int posicion) {
		return (posicion < 0 || posicion >= size()-1);
	}

	boolean rangeSetAdd(int posicion) {
		return (posicion < 0 || posicion > size());
	}

	int size() {
		return canciones.size();
	}
	
	Musica top() {
		return canciones.get(0);
	}
	
	
}
