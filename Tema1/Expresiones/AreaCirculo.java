/**
La fórmula del área un círculo es pi*r2, siendo r el radio del círculo. Calcula y muestra el área de un círculo cuyo r=7
@author Angelo Barbara
@version 1.0
*/
public class AreaCirculo{
		public static void main(String... args) {
			byte r = 7;
			double a = Math.PI*Math.pow(r,2);

			System.out.println ("El \u00e1rea de un c\u00edrculo cuyo r="+ r +" es "+ a +".");
			}
}