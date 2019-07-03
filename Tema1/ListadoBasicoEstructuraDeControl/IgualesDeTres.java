/**
Define la clase IgualesDeTres que lea tres números de teclado y determine si la suma
de cualquier pareja de ellos es igual al tercer número. Si se cumple esta condición,
escribir Iguales y en caso contrario escribir Distintos.

@author Angelo Barbara
@version 1.0
 */
public class IgualesDeTres{
	public static void main(String[] args){
		int i;
		int b;
		int c;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("\nIntroducir el primer numero entero: ");
		i = scanner.nextInt();
		System.out.println("\nIntroducir el segundo numero entero: ");
		b = scanner.nextInt();
		System.out.println("\nIntroducir el tercer numero entero: ");
		c = scanner.nextInt();

		if(i+b==c || i+c==b || b+c==i)
			System.out.print("\nIguales\n");
		
		else
			System.out.print("\nDistintos\n");
		
	}
}