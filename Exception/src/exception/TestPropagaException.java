package exception;

public class TestPropagaException {
	public static void main(String[] args) {
		metodo1();
	}
	
	private static void metodo1() {
		metodo2();
	}
	
	private static void metodo2() {
		metodo3();					
	}
	
	private static void metodo3() {
		int a = 7 / 0; 				//Se lanza y se captura la excepción
	}								//java.lang.ArithmeticException, unchecked exception
}
