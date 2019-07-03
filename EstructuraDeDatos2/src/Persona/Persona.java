package Persona;

public class Persona {
	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos){
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	String getNombre() {
		return nombre;
	}
	
	String getApellidos() {
		return apellidos;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
}
