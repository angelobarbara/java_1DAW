package exception;

public class TestLanzaExcepcion {

	public static void main(String[] args) {
		metodo1();
		System.out.println("main: Acabado...");

	}

	private static void metodo1() {
		try {
			metodo2();
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		}
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
