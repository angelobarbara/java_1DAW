/**
Define la clase DosNumeros.
Lee dos enteros hasta que sean distintos. Si no lo son, se mostrará el mensaje  "Son iguales".
Una vez introducidos ambos de  forma correcta  se mostrará el menor de ellos. Utiliza el operador ?
int menor = (entero1<entero2)? entero1:entero2;

@author Angelo Barbara
@version 1.0
*/
class DosNumeros{
	public static void main (String[] args){
		int i;
		int b;
		int menor;
		
		do{
			i=Teclado.leerEntero("\nIntroduzca un numero entero: ");
			b=Teclado.leerEntero("\nIntroduzca otro numero entero: ");
			menor=(i<b)?i:b;
			
			if(i==b)
				System.out.println("\nSon iguales");
			
		}while(i==b);
		System.out.println("\nEl menor entre los dos numero es "+menor);
	}
}