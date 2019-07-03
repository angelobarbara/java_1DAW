package exception;

public class TestPropagaExcepcion4 {
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println("División por zero");		
		}
	}
	
	private static void metodo1() {
		metodo2();
	}
	
	private static void metodo2() {
		metodo3();			
	}
	
	private static void metodo3() {
		int a = 7 / 0;
	}
}

