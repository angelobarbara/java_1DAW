package tema2.gato;
import tema2.utiles.*;

public class TestGato {
	private static final Gato gato = new Gato(Teclado.leerCadena("Que nombre quieres darle al gato?"),Teclado.leerCadena("Dime la raza del gato"),Teclado.leerEntero("Dime el peso del gato"));
	public static void main(String[] args) {
		// Gato gato = new Gato(Teclado.leerCadena("Que nombre quieres darle al gato?"),Teclado.leerCadena("Dime la raza del gato"),5);
		// mostrarInstucciones();
		Menu menuGato = new Menu("Gato", new String[]{"Dar de Comer","Jugar con el gato","Dormir el gato","Despertar el gato"});
		System.out.println(gato.toString());
		while(!gato.getEstado()) {
			switch (menuGato.gestionarMenu()) {
				case 1:
					System.out.println(gato.darDeComer());
					break;
				case 2:
					System.out.println(gato.jugarConGato());
					break;
				case 3:
					System.out.println(gato.dormir());
					break;
				case 4:
					System.out.println(gato.despertar());
					break;
				default:
					return;
			}
		}
	}
	// static void mostrarInstucciones(){
		// System.out.println("GATOS");
		// System.out.println("Tu gato morirá cuando llegue al peso máximo "+Gato.MAX_PESO+" o al peso mínimo "+ gato.MIN_PESO); 
		
		
	// }
}