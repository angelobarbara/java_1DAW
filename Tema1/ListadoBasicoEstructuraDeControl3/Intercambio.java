/**
Define la clase Intercambio que pide dos enteros por teclado e intercambia el valor de ambas variables.
Muestra el valor antes y después del intercambio.

@author Angelo Barbara
@version 1.0
*/
class Intercambio{
	public static void main (String [] args){
		int i;
		int c;
		int b;
		
		i = Teclado.leerEntero("Introduzca el primer numero: ");
		c = Teclado.leerEntero("Introduzca el segundo numero: ");
		
		b=i;
		i=c;
		c=b;
		
		System.out.println("El numero "+i+" ahora vale "+c);
		System.out.println("El numero "+c+" ahora vale "+i);
	}
}