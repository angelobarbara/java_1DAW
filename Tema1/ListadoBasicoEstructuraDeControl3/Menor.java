/**
Define la clase Menor que pide repetidas veces dos enteros por teclado e indica cuál es el menor. 
En caso de ser iguales se sale del programa diciendo adiós. Utiliza la sentencia break

@author Angelo Barbara
@version 1.0
*/
class Menor{
	public static void main (String[] args){
		
		int i;
		int c;
		
		do{
			i = Teclado.leerEntero("Introduzca un numero entero: ");
			c = Teclado.leerEntero("Introduzca otro numero entero: ");
			
			if (i<c)
				System.out.println("El numero "+i+" es menor que "+c);
			
			else if (i>c)
				System.out.println("El numero "+c+" es menor que "+i);
			
			else{
				System.out.println("Adios");
				break;
			}
		}while(true);
	}
}
