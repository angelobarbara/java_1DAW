/**
Entrega la clase "ValoresLimite" donde se almacenen y muestren los valores máximos y mínimos de cada tipo de variable.
Utilizad los envoltorios de los datos primitivos (Byte.MIN_VALUE, Short.MAX_VALUE, Integer, Long...)
Después de mostrarlos aumenta los máximos y decrementa los mínimos. Utiliza los operadores de asignación autoincremento/autodecremento.
Vuelve a mostrarlos. ¿Qué ocurre?
@author Angelo Barbara
@version 1.0
*/

public class ValoresLimite {
		public static void main(String[] args){
			
			byte maxByte = Byte.MAX_VALUE;
			byte minByte = Byte.MIN_VALUE;
			
			short maxShort = Short.MAX_VALUE;
			short minShort = Short.MIN_VALUE;
			
			int maxInt = Integer.MAX_VALUE;
			int minInt = Integer.MIN_VALUE;
			
			long maxLong = Long.MAX_VALUE;
			long minLong = Long.MIN_VALUE;
			
			float maxFloat = Float.MAX_VALUE;
			float minFloat = Float.MIN_VALUE;
			
			double maxDouble = Double.MAX_VALUE;
			double minDouble = Double.MIN_VALUE;
			
			System.out.println ("M\u00e1ximos y m\u00ednimos de las variables:");
			System.out.println (maxByte);
			System.out.println (minByte);
			System.out.println (maxShort);
			System.out.println (minShort);
			System.out.println (maxInt);
			System.out.println (minInt);
			System.out.println (maxLong);
			System.out.println (minLong);
			System.out.println (maxFloat);
			System.out.println (minFloat);
			System.out.println (maxDouble);
			System.out.println (minDouble +"\n");
			
			System.out.println ("Aumento de los m\u00e1ximos y decremento de los m\u00ednimos:");
			System.out.println (++maxByte);
			System.out.println (--minByte);
			System.out.println (++maxShort);
			System.out.println (--minShort);
			System.out.println (++maxInt);
			System.out.println (--minInt);
			System.out.println (++maxLong);
			System.out.println (--minLong);
			System.out.println (++maxFloat);
			System.out.println (--minFloat);
			System.out.println (++maxDouble);
			System.out.println (--minDouble);
		
			/*Aumentando los máximos de 1 muestra los valores mínimos de las relativas variables.
			Decrementanto de 1 los valore mínimos muestra los máximos de las relativas variables*/
			


		}
}