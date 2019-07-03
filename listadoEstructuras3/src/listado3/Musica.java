package listado3;

public class Musica {
	private String nombre;
	private String autor;
	private String anno;
	
	
	
	
	Musica(String nombre, String autor, String anno) {
		this.nombre = nombre;
		this.autor = autor;
		this.anno = anno;
	}

	String nombre() {
		return nombre;
	}
	
	String apellido() {
		return autor;
		}
	
	String fecha() {
		return anno;
	}
	
	@Override
	public String toString() {
		return "\n" + nombre + " de " + autor + " del " + anno;
	
	}
	


}