package exception;

public class HolaMundoException {

	public static void main(String[] args) {
		String[] mensaje = new String[2];
		mensaje[0] = "Hola ";
		mensaje[1] = "mundo!";
		
		// este bucle acceder� a un �ndice fuera de rango
		// y lanzar� una excepci�n
		try {
			for(int i = 0; i < 3; i++)
				System.out.println(mensaje[i]);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Después del lanzamiento de la excepción");

	}

}
