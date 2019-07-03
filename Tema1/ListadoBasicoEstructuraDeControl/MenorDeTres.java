/**
Define la clase MenorDeTres que lea tres números y calcule cuál de ellos es el menor. 
Suponemos que los tres números son distintos.

@author Angelo Barbara
@version 1.0
*/

public class MenorDeTres{
	public static void main (String[] args){
		int i;
		int b;
		int c;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println ("Introducir el primer numero entero: ");
		i = scanner.nextInt();
		System.out.println ("\nIntroducir el segundo numero entero: ");
		b = scanner.nextInt();
		System.out.println ("\nIntroducir el tercer numero entero: ");
		c = scanner.nextInt();
		
		if(i<c && i<b)
			System.out.println ("\nEl numero "+i+" es el menor");
		else if (b<i && b<c)
			System.out.println ("\nEl numero "+b+" es el menor");
		else
			System.out.println ("\nEl numero "+c+" es el menor");
	}
}