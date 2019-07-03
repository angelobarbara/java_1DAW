/**
Define  la  clase  SumaImpares.  Visualiza  l
a  suma  de  los  números  impares  del  1  al  75, 
ambos inclusive.

@author Angelo Barbara
@version 1.0
*/
public class SumaImpares{
	public static void main(String[] args){
		int i;
		int suma=0;

		for(i=0;i<76;i++){
		
			suma=suma+(++i);
		}

		System.out.println("\nLa suma de los numeros impares del 1 al 75 es: "+suma);
	}
}