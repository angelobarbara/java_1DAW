/**
Define la clase Sumar2 que realice una suma y la muestre.
Para ello implementa el método sumar con los dos argumentos que sean los sumandos. Ha de devolver su suma.
Documéntalo correctamente (@param y @return)

@author Angelo Barbara
@version 1.0
*/
class Sumar2{
	public static void main (String[] args){
		double i, c;
		i=Teclado.leerDecimal("\nIntroduzca el primer numero");
		c=Teclado.leerDecimal("\nIntroduzca el segundo numero");
		System.out.println("\nLa suma del numero "+i+" con el numero "+c+" es "+sumar(i,c));
	}
	/**
	 Calcula la suma de los dos números pasados como parámetro
	 @param i primer sumando
	 @param c segundo sumando
	 @return i+c suma de los dos números
	 */
	static double sumar(double i, double c){
		return (i+c);
	}
}