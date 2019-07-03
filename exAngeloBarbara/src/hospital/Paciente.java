/**
 * 
 */
package hospital;

import java.util.regex.Pattern;

/**
 * @author d17barba
 *
 */
public class Paciente {
	private Sexo sexo;
	private Cama cama;
	private static int contador = 1;
	private int identificador;
	private int numHabitacion;
	private String nombre;
	private static final String NOMBRE_VALIDO = "(?i)^DESCONOCIDO|([a-z·ÈÌÛ˙Ò¡…Õ”⁄—]{3,}\\s?)+$";
	private static final Pattern patternNombre = Pattern.compile(NOMBRE_VALIDO);
	
	

	

	@Override
	public String toString() {
		return "Paciente [sexo=" + sexo + ", cama=" + cama + ", numHabitacion=" + numHabitacion + ", nombre=" + nombre
				+ "]";
	}

	Paciente(String nombre, Sexo sexo, int numHabitacion, Cama cama) throws NombreNoValidoException, CamaNoExisteException, SexoNoValidoException{
		setNombre(nombre);
		setSexo(sexo);
		setHabitacion(numHabitacion);
		setCama(cama);
		identificador = contador++;
	}
	
//	public void setIdentificador(int identificador) {
//		this.identificador = identificador;
//	}
	
	public int getId() {
		return identificador;
	}
	
	public Cama getCama() {
		return cama;
	}
	
	public int getHabitacion() {
		return numHabitacion;
	}
	
//	public int getIdentificador() {
//		return identificador;
//	}
	
	public Paciente(int numHabitacion, Cama cama) throws CamaNoExisteException {
		setHabitacion(numHabitacion);
		setCama(cama);
	}

	void setHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
		
	}

	void setCama(Cama cama) throws CamaNoExisteException {
		if(cama == null)
			throw new CamaNoExisteException("Introduzca una cama v·lida");
		this.cama = cama;
		
	}

	private void setSexo(Sexo sexo) throws SexoNoValidoException {
		if(sexo == null)
			throw new SexoNoValidoException("Introduzca un sexo v·lido");
		this.sexo = sexo;
		
	}

	public void setNombre(String nombre) throws NombreNoValidoException {
		if(!esNombreValido(nombre))
			throw new NombreNoValidoException("Introduzca un nombre v·lido");
		this.nombre = nombre;
		
	}
	
	private boolean esNombreValido(String nombre) {
		return patternNombre.matcher(nombre).matches();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cama == null) ? 0 : cama.hashCode());
		result = prime * result + numHabitacion;
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
		Paciente other = (Paciente) obj;
		if (cama != other.cama)
			return false;
		if (numHabitacion != other.numHabitacion)
			return false;
		return true;
	}

	
	
}
