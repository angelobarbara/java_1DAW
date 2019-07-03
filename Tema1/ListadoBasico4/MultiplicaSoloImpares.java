/**
Define  la  clase  MultiplicaSoloImpares 
que  multiplique  20  números  impares  leídos 
desde  teclado  y  muestre  el  resultado  en  pantalla.  Define  al  menos  los  métodos 
mostrarInstrucciones y leerImpar.

@author Angelo Barbara
@version 1.0
*/
class MultiplicaSoloImpares{
	public static void main (String[] args){
		double i;
		double c=1;
		mostrarInstrucciones();
		for(int b=0;b<20;b++){
			i=leerImpar();
			while(i%2==0){
				System.out.println("\nNumero par. Introduzca un numero impar");
				i=leerImpar();
			}
			c*=i;
		}
		System.out.println("\nEl producto de los 20 numeros impares es "+c);
	}
	/**
	Muestra por pantalla las instrucciones del programa
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca 20 numeros impares y calculare el producto");
	}
	/**
	Pide al usuario que introduzca numeros impares
	*/
	static double leerImpar(){
		return Teclado.leerEntero("\nIntroduzca un numero impar");
	}
}