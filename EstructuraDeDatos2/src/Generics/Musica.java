package Generics;

public class Musica {
	
	private String nombre;
	private String artista;
	private int anno;

	Musica(String nombre, String artista, int anno){
		setNombre(nombre);
		setArtista(artista);
		setAnno(anno);
	}
	
	String getNombre() {
		return nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Musica [nombre=" + nombre + ", artista=" + artista + ", anno=" + anno + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
