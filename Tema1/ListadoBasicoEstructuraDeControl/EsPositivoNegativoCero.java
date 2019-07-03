/**
Define  la  clase  EsPositivoNegativoCero  que  pide  un  entero  por  teclado  e  indica  si  es positivo, negativo o cero.

@author Angelo Barbara
@version 1.0
*/
public class EsPositivoNegativoCero{
	public static void main (String[] args){
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int entero;
		
		System.out.println("Introduce un numero: ");
		entero = scanner.nextInt();
		if (entero>0)
			System.out.println("El numero es positivo");
		else if (entero<0)
			System.out.println("El numero es negativo");
		else
			System.out.println("El numero es cero");
		
	}
}