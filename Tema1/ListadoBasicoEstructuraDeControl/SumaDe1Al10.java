/**
Define la clase SumaDel1Al10 que calcule la suma de los enteros entre 1 y 10, es decir 1+2+3+4+5,...

@author Angelo Barbara
@version 1.0
*/
public class SumaDe1Al10{
	public static void main (String[] args){
		int i;
		int suma=0;
		
		for (i=0;i<11;i++){
			suma = suma+i;
		}
		System.out.println("\nLa suma de los numeros del 1 al 10 es: "+suma);
	}
}	