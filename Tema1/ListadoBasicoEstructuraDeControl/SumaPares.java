/**
Define la clase  SumaPares que sume los números pares comprendidos entre 7 y 101.

@author Angelo Barbara
@version 1.0
*/
public class SumaPares{
	public static void main(String[] args){
		int i;
		int suma=0;

		for(i=7;i<101;i++){
		
			suma=suma+(++i);
		}

		System.out.println("\nLa suma de los numeros pares del 7 al 101 es: "+suma);
	}
}