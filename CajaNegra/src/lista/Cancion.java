package lista;
import utiles.Teclado;

public class Cancion {
	private String titulo;
	private String autor;
	private String annoGrabacion;

	/**
	 * @param cancion
	 * @param autor
	 * @param annoGrabacion
	 */
	Cancion(String cancion, String autor, String annoGrabacion) {
		this.titulo = cancion;
		this.autor = autor;
		this.annoGrabacion = annoGrabacion;
	}

	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCancion ["
				+ (titulo != null ? "cancion=" + titulo + ", " : "")
				+ (autor != null ? "autor=" + autor + ", " : "")
				+ (annoGrabacion != null ? "annoGrabacion=" + annoGrabacion
						: "") + "]";
	}

	/**
	 * Solicita al usuario los datos de una nueva canción
	 * 
	 * @return la nueva canción con los datos solicitados del usuario
	 */
	static Cancion pedirDatosCancion() {
		Cancion cancion = new Cancion();
		System.out.print("Título: ");
		cancion.titulo = Teclado.leerCadena();
		System.out.print("Año de grabación: ");
		cancion.annoGrabacion = Teclado.leerCadena();
		System.out.print("Autor: ");
		cancion.autor = Teclado.leerCadena();
		return cancion;
	}

}
