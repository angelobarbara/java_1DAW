/**
Define  la  clase  LeeEnteros.  Lee  10  enteros  e  indica  al  final  si  se  ha  introducido  algún cero.

@author Angelo Barbara
@version 1.0
*/
public class LeeEnteros{
	public static void main(String[] args){
		int numero;
		int contador;
		int ceros=0;

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for(contador=0;contador<10;contador++){
			System.out.print("\nIntroduzca un numero entero: ");

			numero = scanner.nextInt();

			if(numero==0)
				ceros++;
		}

		System.out.print("\nSe han introducido "+ceros+" ceros");
	}
}