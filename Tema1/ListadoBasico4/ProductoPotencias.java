/**
Define  la clase  ProductoPotencias que  calcule  y visualice  el producto de  las potencias 
de 2 entre 0 y 10.

@author Angelo Barbara
@version 1.0
*/
public class ProductoPotencias{
	public static void main (String[] args){
		int i;
		long resultado, producto=1;
		
		for(i=0;i<=10;i++){
			resultado=calcularProducto(i);
			producto*=resultado;
		}
		System.out.println("\nEl producto de las potencia de 2 entre 0 y 10 es "+producto);
	}
	/**
	Calcula el producto de las potencia de 2 entre 0 y 10
	@return ((long) (Math.pow(2,i))); 2 elevado a i
	*/
	static long calcularProducto(int i){
			return ((long) (Math.pow(2,i)));
		}
}