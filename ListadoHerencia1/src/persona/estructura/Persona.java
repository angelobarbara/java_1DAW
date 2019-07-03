package persona.estructura;

import java.util.regex.Pattern;

public class Persona {

	private String nombre;
	private String apellido;
	private String nie;
	private static final String NOMBRE_VALIDO = "(?i)^[a-z·ÈÌÛ˙Ò¡…Õ”⁄—]{3,}$";
	private static final String APELLIDO_VALIDO ="(?i)^[a-z·ÈÌÛ˙Ò¡…Õ”⁄—]{3,}\\s[a-z·ÈÌÛ˙Ò¡…Õ”⁄—]{3,}$";
	private static final Pattern PATTER_NOMBRE = Pattern.compile(NOMBRE_VALIDO);
	private static final Pattern PATTER_APELLIDO = Pattern.compile(APELLIDO_VALIDO);

	public Persona(String nombre, String apellido, String nie) throws persona.estructura.NombreNoValidoException, ApellidoNoValidoException {
		setNombre(nombre);
		setApellido(apellido);
		setNie(nie);
	}
	
	private boolean esNombreValido(String nombre) {
		return PATTER_NOMBRE.matcher(nombre).matches();
	}
	
	private boolean esApellidoValido(String apellido) {
		return PATTER_APELLIDO.matcher(apellido).matches();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [nombre=" + getNombre() + ", apellido=" + getApellido() + ", nie="
				+ getNie() + "]";
	}

	protected String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) throws persona.estructura.NombreNoValidoException {
		if(!esNombreValido(nombre))
			throw new NombreNoValidoException("Introduzca un nombre de al menos 3 caracteres");
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) throws ApellidoNoValidoException {
		if(!esApellidoValido(apellido))
			throw new ApellidoNoValidoException("Introduzca dos apellidos de al menos 3 caracteres");
		this.apellido = apellido;
	}

	protected String getNie() {
		return nie;
	}

	private void setNie(String nie) {
		this.nie = nie;
	}
}
