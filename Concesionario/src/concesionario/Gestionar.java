package concesionario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Gestionar {
	
	private static Concesionario concesionario = new Concesionario();
	private static boolean modificado;

	public static Concesionario getConcesionario() {
		return concesionario;
	}

	public static void setConcesionario(Concesionario concesionario) {
		Gestionar.concesionario = concesionario;
	}

	public static boolean getModificado() {
		return modificado;
	}

	public static void setModificado(boolean modificado) {
		Gestionar.modificado = modificado;
	}
	
	public static Coche get(String matricula) throws MatriculaNoValidaException, CocheNoExisteException {
		return concesionario.get(matricula);
	}

	public static ArrayList<Coche> cochesColor(Color color) throws ArrayColoresEsVacia{
		return concesionario.cochesColor(color);
	}
	
	public static int size() {
		return concesionario.size();
	}
	
	public static void add(String matricula, Color color, Modelo modelo) throws Exception {
		concesionario.annadir(matricula, color, modelo);
		setModificado(true);
	}
	
	public static boolean remove(String matricula) throws MatriculaNoValidaException {
		if(concesionario.eliminar(matricula)) {
			setModificado(true);
			return true;
		}
		return false;
	}
	
	public static void nuevo() {
		concesionario = new Concesionario();
		setModificado(false);
	}
	
	public static void guardar(File file) throws IOException {
		Fichero.guardar(file, concesionario);
		setModificado(false);
	}
	
	public static void abrir(File file) throws ClassNotFoundException, IOException {
		concesionario = Fichero.abrir(file);
	}
	
	public static boolean exist(File file) {
		return Fichero.exist(file);
	}
}

