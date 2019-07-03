/**
Entrega la implementacion de factorial de forma recursiva. Utiliza el metodo deseaContinuar para hacerlo tantas veces como quiera el usuario

@author Angelo Barbara
@version 1.0
*/
class FactorialRecursivo{
	public static void main (String[] args){
		do{
			int numero=Teclado.leerEntero("Introduzca un numero positivo");
			System.out.println("\nEl factorial de "+numero+" es "+factorial(numero));
		}while(deseaContinuar());
	}
	static double factorial(int numero){
		if(numero<=-1)
			return -1;
		if(numero<=1)
			return 1;
		return numero*factorial(numero -1);
	}
	static boolean deseaContinuar(){
		char deseaContinuar=Teclado.leerCaracter("\nDesea continuar? (s/n)");
		return(deseaContinuar=='s' || deseaContinuar=='S');
	}
}