/**
Define la clase EnteroPorDiez que pide un entero por teclado y lo multiplica por 10

@author Angelo Barbara
@version 1.0
*/
public class EnteroPorDiez{
	public static void main (String[] args){
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int entero;
		
		System.out.println("Introduce un numero: ");
		entero = scanner.nextInt();
		System.out.println("El numero multiplicado por diez es: "+entero*10);
		
		
	}
}