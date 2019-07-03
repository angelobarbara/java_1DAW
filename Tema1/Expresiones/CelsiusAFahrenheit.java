/**
En los EEUU sigue utilizándose los grados Fahrenheit para la medición de la temperatura. 
Calcula cuántos grados Fahrenheit son los puntos de ebullición (100 grados Celsius) y de congelación (0 grados Celsius)
@author Angelo Barbara
@version 1.0
*/
public class CelsiusAFahrenheit{
		public static void main(String... args) {
			int ebullicion = 100;
			int congelacion = 0;
			
			double ebullicionFahrenheit = 1.8 * ebullicion + 32;
			double congelacionFahrenheit = 1.8 * congelacion + 32;
			
			System.out.println ("El punto de ebullici\u00f3n del agua en grados Fahrenheit es "+ebullicionFahrenheit+";"
				+"\nEl punto de congelaci\u00f3n del agua en" 
				+" grados Fahrenheit es "+congelacionFahrenheit+".");
			}
}