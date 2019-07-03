package Lista;

public class Jugador {
	private String nombre;
	private Posicion posicion;
	
	Jugador(String nombre,Posicion posicion){
		this.nombre = nombre;
		this.posicion = posicion;
	}
	
	String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equalsIgnoreCase(other.nombre))
			return false;
		return true;
	}
	enum Posicion {
		PORTERO, DEFENSA, MEDIOCAMPO, ATACANTE
	}
	
	
	
}
