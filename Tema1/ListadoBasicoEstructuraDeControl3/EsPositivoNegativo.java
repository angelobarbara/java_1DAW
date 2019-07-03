/**
Define la clase EsPositivoNegativo que pide repetidas veces un entero por teclado e indica si es positivo o negativo.
En caso de ser cero, se sale del programa diciendo adiós. Crea tres versiones con las tres estructuras repetitivas y utilizando la sentencia break.

@author Angelo Barbara
@version 1.0
*/
public class EsPositivoNegativo{
	public static void main (String[] args){
		
		int i = 1;
				
		System.out.println("\nCon do..while");
		do{
			i = Teclado.leerEntero("\nIntroduzca un numero: ");
			if (i<0)
				System.out.println("El numero es negativo");
			else if (i>0)
				System.out.println("El numero es positivo");
			else{
				System.out.println("Adios");
				break;
			}
		} while (true);
		
		System.out.println("\nCon while");
		while(true){
			i = Teclado.leerEntero("\nIntroduzca un numero: ");
			if (i<0)
				System.out.println("El numero es negativo");
			else if (i>0)
				System.out.println("El numero es positivo");
			else{
				System.out.println("Adios");
				break;
			}
		}
		
		System.out.println("\nCon for");
		for (;;){
			i = Teclado.leerEntero("\nIntroduzca un numero: ");
			if (i<0)
				System.out.println("El numero es negativo");
			else if (i>0)
				System.out.println("El numero es positivo");
			else{
				System.out.println("Adios");
				break;
			}
		}
	}
}