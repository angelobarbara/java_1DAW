package exception;

import utiles.Menu;

public class TestScannerConMenu {
	public static void main(String[] args) {
		Menu menu = new Menu("Scanner",
				new String[] { "Leer entero", "Leer decimal", "Leer caracter", "Leer cadena", "Salir" });
		
		int opcion; 
		
		do {
			opcion = menu.gestionar();
			gestionar(opcion);
		}while(opcion != menu.getSalir());
	}

	private static void gestionar(int opcion) {
		TecladoScanner teclado = new TecladoScanner();
		
		switch (opcion) {
		case 1:
			teclado.leerEntero("Introduzca un número entero");
			break;
		case 2:
			teclado.leerDecimal("ntroduzca un número decimal");
			break;
		case 3:
			teclado.leerCaracter("ntroduzca un caracter");
			break;
		case 4:
			teclado.leerCadena("Introduzca una cadena");
			break;
		default:
			System.out.println("Adiós.");
		}
		
	}
}
