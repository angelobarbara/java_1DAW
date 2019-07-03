package listado3;

public class Personas {
	private String nombre;
	private String apellidos;
	
	
	
	
	Personas(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	String nombre() {
		return nombre;
	}
	
	String apellido() {
		return apellidos;
		}
	
	@Override
	public String toString() {
		return nombre + " " + apellidos;
	
	}
	


}

