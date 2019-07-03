package testMiPersona;

import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nombre;
	String apellidos;
	LocalDate localDate;
	
	Persona(String nombre, String apellidos, LocalDate localDate){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha nacimiento=" + localDate + "]";
	}
}
