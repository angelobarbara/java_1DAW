package listado3;

import java.util.ArrayList;



/**
 *
 * @param <Musica>
 */

public class TopMusic<Musica> {
	ArrayList<Musica> music = null;
	
	
	public TopMusic() {
		music = new ArrayList<Musica>();
		
	}
	
	
	void add(Musica elemento) {
		music.add(elemento);
	}
	
	void annadir(int index, Musica elemento) {
		music.add(index, elemento);
	}
	
	Musica borrar(int index){
		if(music.size() == 0)
			return null;
		return music.remove(index);
	}
	
	Musica vaciar() {
		return music.remove(music.size()-1);
	}
	Musica mostrar(int index) {
		if(music.size() == 0)
			return null;
		return music.get(index);
	}
	
	Musica topCancion() {
		if(music.size() == 0)
			return null;
		return music.get(0);
	}

	boolean isEmpty() {
		return music.isEmpty();
	}
	
	 public void subir(int index) {
		 Musica tmp = music.get(index-1);
			music.set(index-1, music.get(index));
			music.set(index, tmp);
	 }
	 
	 public void bajar(int index) {
		 Musica tmp = music.get(index+1);
			music.set(index+1, music.get(index));
			music.set(index, tmp);
	 }
	
	Musica mostrarTop() {
		if(music.size() == 0)
			return null;
		return music.get(0);
	}
	
	int size() {
		return music.size();
	}


	@Override
	public String toString() {
		return "TopMusic [music=" + music + "]";
	}
	
	
	
}