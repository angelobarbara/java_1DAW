/**
Mirando la tabla de cambios, veo que el euro está a 1,1256 dólares americanos. 
Mi abuela se dispone a hacer un viaje a LA, California (EEUU). ¿Cuántos dólares obtendrá al cambiar 300 Euros?
@author Angelo Barbara
@version 1.0
*/
public class EurosADolares{
		public static void main(String... args) {
			int dinero = 300;
			double cambio = 1.1256;
			double dolares = dinero*cambio;

			System.out.println ("Mi abuela al cambiar "+dinero+" euros obtendr\u00e1 "+dolares+" d\u00f3lares.");
			}
}