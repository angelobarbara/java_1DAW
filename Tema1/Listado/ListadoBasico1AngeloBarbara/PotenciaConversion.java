/**
Crea la siguiente clase y justifica por qué el sufijo float (f ó F) es necesario:
@author Angelo Barbara
@version 1.0
*/
public class PotenciaConversion {
	public static void main (String args[]){
		float f = 1e-39f;
		double d = 1e-39;
		
		System.out.println ("float: " + f);
		System.out.println ("double: " +d);
	}
}