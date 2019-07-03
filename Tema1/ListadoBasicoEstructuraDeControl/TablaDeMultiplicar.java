/**
Define la clase TablaDeMultiplicar. Muestra la tabla de multiplicar. Para ello, solicita el factor al usuario.
Sólo  se  admiten  la  tabla  de  multiplicar  de  los  número  1,  2...  12 (solicitud repetitiva)

@author Angelo Barbara
@version 1.0
*/
public class TablaDeMultiplicar{
	public static void main(String[] args){
		int i;
		int numero;
		boolean continuar = true;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		do {
			System.out.print("\nIntroducir un numero del 1 al 12: ");
			numero = scanner.nextInt();
			if (numero >0 && numero <13){
				for (i=0; i<10; i++)	
				System.out.println(numero+" x "+i+"= "+(numero*i));
			}
			else 
				continuar = false;
		} while (continuar);
			
	}			
}
