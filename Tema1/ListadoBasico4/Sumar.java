/**
Define la clase Sumar que realice una suma y la muestre.
Para ello implementa el método sumar que devuelva la suma de dos números,
solicitados por teclado (sin argumentos). Documéntalo correctamente (@return)

@author Angelo Barbara
@version 1.0
*/
class Sumar{
	public static void main (String[] args){
		System.out.println("\nLa suma de los dos numero es: "+sumar());
	}
	/**
	 Calcula la suma de los dos números introducidos por teclado
	 @return numero1+numero2 suma de los dos números
	 */
	static double sumar(){
		double i, c;
		i=Teclado.leerDecimal("\nIntroduzca el primer numero: ");
		c=Teclado.leerDecimal("\nIntroduzca el segundo numero: ");
		return (i + c);
	}
}