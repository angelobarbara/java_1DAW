/**
Define la clase CuentaNegativos. Lee 10 enteros y visualiza cuántos son negativos.

@author Angelo Barbara
@version 1.0
*/
public class CuentaNegativos{
	public static void main(String[] args){
		int numero;
		int contador;
		int negativos=0;

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for(contador=0;contador<10;contador++){
			System.out.print("\nIntroducir un numero entero: ");

			numero = scanner.nextInt();

			if(numero<0)
				negativos++;
		}

		System.out.print("\nSe han introducido "+negativos+" numeros negativos");
	}
}