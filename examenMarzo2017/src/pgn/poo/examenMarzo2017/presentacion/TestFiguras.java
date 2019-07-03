package pgn.poo.examenMarzo2017.presentacion;

import pgn.poo.examenMarzo2017.estructuras.FiguraNoExisteException;
import pgn.poo.examenMarzo2017.estructuras.Figuritas;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.Circunferencia;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.Cuadrado;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.DimensionNoValidaException;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.Rectangulo;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.TrianguloRectangulo;
import pgn.poo.utiles.Menu;
import pgn.poo.utiles.Teclado;

public class TestFiguras {

	static Menu menu = new Menu("FIGURITAS", new String[] { "Altas", "Bajas", "Listar" });
	static Menu menuAltas = new Menu("Altas", new String[] { "Alta masiva", "Alta Selectiva" });
	static Menu menuBajas = new Menu("Bajas", new String[] { "Baja por identificador", "Baja por indice" });
	static Menu menuAltasSelectiva = new Menu("Elige una figura",
			new String[] { "Rectangulo", "Cuadrado", "Circulo", "Triangulo Rectangulo" });
	static Menu menuListado = new Menu("Listar",
			new String[] { "Listar todo", "Listar Triangulos", "Listar del reves" });
	private static Figuritas figuras = new Figuritas();

	public static void main(String[] args) throws DimensionNoValidaException {

		int opcion = 0;

		do {
			opcion = menu.gestionar();
			gestionar(opcion);
		} while (opcion != menu.getSalir());
	}

	private static void gestionar(int opcion) throws DimensionNoValidaException {
		if(opcion != 1 && opcion != 4 && figuras.isEmpty()) {
			System.err.println("La lista está vacía. Introduzca al menos una figura");
			return;
		}
		
		try {
			switch (opcion) {
			case 1:
				altas();
				break;
			case 2:
				bajas();
				break;
			case 3:
				listar();
				break;
			default:
				break;
			}
		} catch (FiguraNoExisteException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void listar() {
		int opcion = menuListado.gestionar();
		switch (opcion) {
		case 1:
			mostrar();
			break;
		case 2:
			listarTriangulos();
			break;
		case 3:
			listarDelReves();
			break;
		default:
			break;

		}

	}

	/**
	 * 
	 */
	private static void listarDelReves() {
		System.out.println(figuras.listarDelReves());
	}

	private static void listarTriangulos() {
		System.out.println(figuras.listarTriangulos() + "\nTriangulos totales: " + figuras.sizeTriangulos());

	}

	private static void bajas() throws FiguraNoExisteException {
		int opcion = menuBajas.gestionar();
		switch (opcion) {
		case 1:
			bajaPorIdentificador();
			break;
		case 2:
			bajaPorIndice();
			break;
		default:
			break;

		}
	}

	private static void bajaPorIndice() throws FiguraNoExisteException {
		mostrar();
		System.out.println(figuras.bajaPorIndice(Teclado.leerEntero("Introduzca un índice")-1));

	}

	private static void mostrar() {
		System.out.println(figuras);
	}

	private static void bajaPorIdentificador() throws FiguraNoExisteException {
		mostrar();
		System.out.println(figuras.bajaPorIdentificador(Teclado.leerEntero("Introduzca el identificador")));

	}

	private static int pedirIdentificador() {
		return Teclado.leerEntero("Introduzca un identificador");
	}

	private static void altas() throws DimensionNoValidaException {
		int opcion = menuAltas.gestionar();
		switch (opcion) {
		case 1:
			altaMasiva();
			break;
		case 2:
			altasSelectiva();
			break;
		default:
			break;
		}

	}

	/**
	 * 
	 */
//	private static void altaMasiva() {
//		System.out.println(figuras.altaMasiva());
//	}
	
	public static void altaMasiva() {
		for (int i = 0; i < 3; i++) {
			addRectangulo();
			addCuadrado();
			addTriangulo();
			addCircunferencia();
		}
		System.out.println(figuras.toString());
	}

	/**
	 * 
	 */
	private static void addCircunferencia() {
		try {
			figuras.altaCircunferencia(DimensionAleatoria());
		} catch (DimensionNoValidaException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void addTriangulo() {
		try {
			figuras.altaTriangulo(DimensionAleatoria(), DimensionAleatoria());
		} catch (DimensionNoValidaException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void addCuadrado() {
		try {
			figuras.altaCuadrado(DimensionAleatoria());
		} catch (DimensionNoValidaException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void addRectangulo() {
		try {
			figuras.altaRectangulo(DimensionAleatoria(), DimensionAleatoria());
		} catch (DimensionNoValidaException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
	
	private static float DimensionAleatoria() {
		return (float) Math.random();
	}

	private static void altasSelectiva() throws DimensionNoValidaException {
		int opcion;
		do {
			opcion = menuAltasSelectiva.gestionar();

			switch (opcion) {
			case 1:
				figuras.altaRectangulo(pedirDimension("base del Rectangulo"), pedirDimension("altura del Rectangulo"));
				break;
			case 2:
				figuras.altaCuadrado(pedirDimension("lado del Cuadrado"));
				break;
			case 3:
				figuras.altaCircunferencia(pedirDimension("radio del Circulo"));
				break;
			case 4:
				figuras.altaTriangulo(pedirDimension("base del Triangulo"), pedirDimension("altura del Triangulo"));
				break;
			default:
				break;
			}
		} while (opcion != menuAltasSelectiva.getSalir());
	}

	private static float pedirDimension(String string) {
		return (float) Teclado.leerDecimal("Introduzca la " + string);
	}

}
