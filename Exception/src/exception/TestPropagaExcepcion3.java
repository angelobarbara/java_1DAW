package exception;

public class TestPropagaExcepcion3 {
	public static void main(String[] args) {
		metodo1();
	}
	
	private static void metodo1() {
		metodo2();
	}
	
	private static void metodo2() {
		try {
			metodo3();
		} catch (Exception e) {
			System.out.println("División por zero");
		}					
	}
	
	private static void metodo3() {
		int a = 7 / 0; 				
	}
}
	
