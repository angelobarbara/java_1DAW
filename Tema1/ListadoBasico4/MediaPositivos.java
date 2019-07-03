/**
Define la clase MediaPositivos que calcule la media de una serie de números positivos, introducidos  por  teclado.
Dejará  de  leer  cuando  el  usuario  introduzca  el  0.  Utiliza métodos.

@author Angelo Barbara
@version 1.0
*/
class MediaPositivos{
	public static void main (String[] args){
		mostrarInstrucciones();
		System.out.println("\nLa media de los numeros introducidos es "+MediaPositivos());
	}
	/**
	Muestra por pantalla las instrucciones del programa
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca numeros positivos y se calculara la media o pulse 0 para terminar");
	}
	/**
	Pide al usuario que introduzca numeros para calcular la media
	@return media de los numeros introducidos
	*/
	static double MediaPositivos(){
		int c=0;
		int contador=1;
		double media=0;
		do{
			c=Teclado.leerEntero("\nIntroduzca un numero");
			while(c<0){
				System.out.println("\nIntroduzca numeros positivos");
				c=Teclado.leerEntero("\nIntroduzca un numero");
			}
			contador++;
			media+=c;
		}while(c!=0);
		return media/(contador-1);
	}
}