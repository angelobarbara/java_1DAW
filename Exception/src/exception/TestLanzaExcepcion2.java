package exception;

public class TestLanzaExcepcion2 {

	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main: Acabado...");

	}

	private static void metodo1() throws MiExcepcion {
		
		metodo2();
		System.out.println("Metodo1: Acabado...");
	}

	private static void metodo2() throws MiExcepcion {
		try {
			String nula = null;
			nula.toString();
			System.out.println("Metodo2: Acabado...");
		} catch (Exception e) {
			throw new MiExcepcion("Mi primera excepcion");
		}
		
	}

}
		
