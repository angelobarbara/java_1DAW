/**
Define la clase EligeOpcion que permita visualizar los siguientes mensajes,
dependiendo del número que pulsamos. Ha de mostrar 10 resultados.
a. (1) Procesador de textos
b. (2) Hoja de cálculo
c. (3) Base de datos
d. otro número, la tecla pulsada es errónea.

@author Angelo Barbara
@version 1.0
*/

public class EligeOpcion{
	public static void main(String[] args){
		int opcion;

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for(int i=0;i<10;i++){
			System.out.print("\nIntroducir una de las opciones (1,2 o 3): ");
			opcion = scanner.nextInt();

			if(opcion<1 || opcion>3)
				System.out.println("\nLa letra pulsada es erronea");
			
			else if(opcion==1)
				System.out.println("\nProcesador de textos");
			
			else if(opcion==2)
				System.out.println("\nHoja de calculo");
			
			else
				System.out.println("\nBase de datos");
			
		}
	}
}