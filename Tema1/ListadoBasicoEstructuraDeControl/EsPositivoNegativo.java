/**
Define  la  clase  EsPositivoNegativo  que  pide  repeti das  veces  un  entero  por  teclado  e 
indica  si  es  positivo  o  negativo.  En  caso  de  ser  cero,  se  sale  del  programa  diciendo 
adiós. Crea tres  versiones con las tres estructuras repetitivas y utilizando la sentencia break.

@author Angelo Barbara
@version 1.0
*/
public class EsPositivoNegativo{
	public static void main (String[] args){
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int entero = 1;
				
		System.out.println("\nCon do..while");
		do{
			System.out.println("\nIntroduce un numero: ");
			entero = scanner.nextInt();
			if (entero<0)
				System.out.println("El numero es negativo");
			else if (entero>0)
				System.out.println("El numero es positivo");
			else{
				System.out.println("Adios");
				break;
			}
		} while (true);
		
		System.out.println("\nCon while");
		while(true){
			System.out.println("\nIntroduce un numero: ");
			entero = scanner.nextInt();
			if (entero<0)
				System.out.println("El numero es negativo");
			else if (entero>0)
				System.out.println("El numero es positivo");
			else{
				System.out.println("Adios");
				break;
			}
		}
		
		System.out.println("\nCon for");
		for (;;){
			System.out.println("\nIntroduce un numero: ");
			entero = scanner.nextInt();
			if (entero<0)
				System.out.println("El numero es negativo");
			else if (entero>0)
				System.out.println("El numero es positivo");
			else{
				System.out.println("Adios");
				break;
			}
		}
	}
}
		