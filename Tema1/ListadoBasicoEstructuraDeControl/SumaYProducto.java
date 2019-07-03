/**
Define la clase SumaYProducto que obtenga la suma y el producto de los números del 1 al 100.

@author Angelo Barbara
@version 1.0
*/
public class SumaYProducto{
	public static void main (String[] args){
		int suma=0;
		double producto=1;
		
		for (int i=1;i<101;i++){
			suma = suma+i;
			producto = producto*i;
		}
		System.out.println("\nLa suma de los numeros del 1 al 100 es: "+suma+"."
		+"\nEl producto del los numero del 1 al 100 es: "+producto+".");
	}
}	