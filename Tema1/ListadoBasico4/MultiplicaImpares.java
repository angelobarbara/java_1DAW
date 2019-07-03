/**
Define  la clase  MultiplicaImpares que multiplique  los 20 primeros números impares y 
muestre el resultado en pantalla.

@author Angelo Barbara
@version 1.0
*/
class MultiplicaImpares{
	public static void main (String[] args){
		System.out.println("\nEl resultado de la multiplicacion de los 20 primeros numero impares es "+multiplicaImpares());
	}
	/**
	Multiplica los 20 primeros numeros impares
	@return i el producto de los 20 primeros numeros impares
	*/
	static double multiplicaImpares(){
		double i=1;
		int c;
		for(c=0;c<40;c++){
			++c;
			i*=c;
		}
		return i;
		}
}