/**
Define la clase EsPositivo que pide un entero por teclado e indica si es positivo.

@author Angelo Barbara
@version 1.0
*/
public class EsPositivo{
	public static void main (String[] args){
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int entero;
		
		System.out.println("Introduce un numero: ");
		entero = scanner.nextInt();
		if (entero>0)
			System.out.println("El numero es positivo");
		else
			System.out.println("El numero es negativo");
		
	}
}