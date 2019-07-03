/**
Define la clase MayorMenorCero que permita saber si un número leído por teclado es mayor,
menor o igual a cero, mostrando en pantalla las diferentes salidas. Ha de mostrar 10 resultados.

@author Angelo Barbara
@version 1.0
*/

public class MayorMenorCero{
	public static void main (String[] args){
		int i;
		int contador;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		for (contador=0;contador<10;contador++){
		System.out.println("Intrudicir un numero entero: ");
		i = scanner.nextInt();
		
		if (i<0)
			System.out.println("\nEl numero es menor de 0\n");
		else if(i>0)
			System.out.println("\nEl numero es mayor de 0\n");
		else
			System.out.println("\nEl numero es 0\n");
			
		}
	}
}