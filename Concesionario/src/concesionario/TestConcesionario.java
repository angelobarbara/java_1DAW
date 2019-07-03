/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.io.File;
import java.io.IOException;

import utiles.*;

/**
 *
 * @author Angelo Barbara
 */

public class TestConcesionario {

	static Concesionario concesionario = new Concesionario();

	static Menu menu = new Menu("Concesionario de coches",
			new String[] { "A√±adir Coche", "Eliminar Coche", "Mostrar Coche", "Mostrar concesionario",
					"Coches del concesionario", "Mostrar coches de un color", "Menu ficheros" });

	private static Menu menuColores = new Menu("Colores de los coches", Color.menuColor());

	private static Menu menuModelos = new Menu("Modelos de los coches", Modelo.menuModelos());

	private static Menu menuFicheros = new Menu("Menu Ficheros",
			new String[] { "Nuevo", "Abrir", "Guardar", "Guardar Como" });

	private static File file;

	public static void main(String[] args) {

		int opcion = 0;

		do {
			opcion = menu.gestionar();
			gestionar(opcion);
		} while (opcion != menu.getSalir());

	}

	private static void gestionar(int opcion) {

		if (opcion != 1 && concesionario.isEmpty() && opcion != 8) {
			System.out.println("No hay ning√∫n coche en el concesionario!!!");
			return;
		}

		try {
			switch (opcion) {
			case 1:
				annadirCoche();
				break;
			case 2:
				eliminar();
				break;
			case 3:
				get();
				break;
			case 4:
				System.out.println(concesionario);
				break;
			case 5:
				mostrar();
				break;
			case 6:
				cochesColor();
				break;
			case 7:
				gestionFicheros();
				break;
			default:
				System.out.println("Adios");
				return;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void cochesColor() throws ArrayColoresEsVacia {
		// try {
		System.out.println(Gestionar.cochesColor(pedirColor()));
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
	}

	private static void mostrar() {
		System.out.println("N√∫mero de coches en el concesionario: " + Gestionar.size());
	}

	private static void get() throws MatriculaNoValidaException, CocheNoExisteException {
		// try {
		System.out.println(Gestionar.get(pedirMatricula()));
		// } catch (MatriculaNoValidaException | CocheNoExisteException e) {
		// System.out.println(e.getMessage());
		// }
	}

	private static String pedirMatricula() {
		return TecladoScanner.leerCadena("Introduzca una matr√≠cula v√°lida");
	}

	private static void eliminar() throws MatriculaNoValidaException {
		// try {
		if (Gestionar.remove(pedirMatricula())) {
			// setModificado(true);
			System.out.println("Coche eliminado");
		} else
			System.out.println("El coche no existe");
		// } catch (MatriculaNoValidaException e) {
		// System.out.println(e.getMessage());
		// }
	}

	private static void annadirCoche() throws Exception {

		// try {
		Gestionar.add(pedirMatricula(), pedirColor(), pedirModelo());
		// setModificado(true);
		System.out.println("Coche a√±adido!!!");
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

	}

	private static Modelo pedirModelo() {
		int opcion = menuModelos.gestionar();
		Modelo[] modelos = Modelo.values();
		return modelos[opcion - 1];
	}

	private static Color pedirColor() {
		int opcion = menuColores.gestionar();
		Color[] colores = Color.values();
		return colores[opcion - 1];
	}

	private static void gestionFicheros() {
		int opcion = menuFicheros.gestionar();
		gestionarMenuFicheros(opcion);
	}

	private static void gestionarMenuFicheros(int opcion) {
		switch (opcion) {
		case 1:
			nuevo();
			break;
		case 2:
			abrir();
			break;
		case 3:
			guardar();
			break;
		case 4:
			guardarComo();
			break;

		}
	}

	private static void nuevo() {
		comprobarCambios();
		Gestionar.nuevo();
		setFile(null);
	}

	private static void comprobarCambios() {
		if (guardarCambios()) {
			if (file == null)
				guardarComo();
			guardar();
		}
	}

	private static void abrir() {
		comprobarCambios();
		try {
			File file = new File(TecladoScanner.leerCadena("Introduzca el nombre del fichero: "));
			Gestionar.abrir(file);
			setFile(file);
		} catch (ClassNotFoundException e) {
			System.out.println("InformaciÛn no v·lida.");
		} catch (IOException e) {
			System.out.println("No puedo abrir el fichero.");
		}
	}

	private static void setFile(File file) {
		TestConcesionario.file = file;
	}

	private static void guardar() {
		try {
			Gestionar.guardar(file);
			System.out.println("Fichero guardado con Èxito.");
		} catch (IOException e) {
			System.out.println("No puedo guardar el fichero.");
		}
	}

	private static void guardarComo() {
		try {
			File file = new File(TecladoScanner.leerCadena("Introduzca el nombre del fichero: "));
			if (Gestionar.exist(file)) {
				char respuesta = TecladoScanner.leerCaracter("El fichero ya existe. øDesea sobreescribirlo? (s/n)");
				if (respuesta == 'n' || respuesta == 'N')
					return;
			}
			Gestionar.guardar(file);
			setFile(file);
		} catch (IOException e) {
			System.out.println("No puedo guardar el fichero.");
		}
	}

	private static boolean guardarCambios() {
		if (Gestionar.getModificado()) {
			char respuesta;
			do {
				respuesta = TecladoScanner.leerCaracter("Desea guardar los cambios?(s/n)");
			} while (respuesta != 's' && respuesta != 'n' && respuesta != 'S' && respuesta != 'N');
			if (respuesta == 'S' || respuesta == 's')
				return true;
		}
		return false;
	}

}
