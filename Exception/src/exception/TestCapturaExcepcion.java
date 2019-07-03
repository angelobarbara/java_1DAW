package exception;

public class TestCapturaExcepcion {

	public static void main(String[] args) {
		int dividendo = 7;
		int divisor = 0;
		
		try {
			int cociente = dividendo/divisor;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Aaaaaaadios");

	}

}
