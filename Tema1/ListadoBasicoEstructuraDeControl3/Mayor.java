/**
Define la clase Mayor que pide repetidas veces dos enteros por teclado e indica cuál es el mayor.
En caso de ser iguales se sale del programa diciendo adiós. Utiliza la sentencia break

@author Angelo Barbara
@version 1.0
*/
class Mayor{
	public static void main (String[] args){
		
		int i;
		int c;
		
		do{
			i = Teclado.leerEntero("Introduzca un numero entero: ");
			c = Teclado.leerEntero("Introdzca otro numero entero: ");
			
			if(i<c)
				System.out.println("El numero "+c+" es mayor que "+i);
			else if(c<i)
				System.out.println("El numero "+i+" es mayor que "+c);
			else{
				System.out.println("Adios");
				break;
			}
		}while(true);
	}
}