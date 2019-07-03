/**
Mediante la sentecia switch escribe un programa que muestre los siguientes mensajes en función del contenido de la variable diaSemana:

     Si almacena valores del 1 al 5, que muestre por ejemplo: 
         Día 1, Lunes. A trabajar...
     Si almacena lo valores del 6 ó 7 que muestre por ejemplo: 
         Día 7, Domingo. A descansar...
     En cualquier otro caso, que muestre:
         Día 0.  ERROR. Este día no existe...
		
@author Angelo Barbara
@version 1.0
*/
public class SentenciaSwitch3{

	public static void main(String[] args) {

		byte numDiaSemana = 7;

		String mensaje = "";

		String diaSemana ;

		//Este switch controla el nombre de los dias de la semana

		switch(numDiaSemana){

			case 1: diaSemana = "lunes";

				break;

			case 2: diaSemana = "martes";

				break;

			case 3: diaSemana = "miercoles";

				break;

			case 4: diaSemana = "jueves";

				break;

			case 5: diaSemana = "viernes";

				break;

			case 6: diaSemana = "sabado";

				break;

			default: diaSemana = "domingo";//case 7:

				break;

			}//FinSwitch control de días de la semana

		//Este switch controla el mensaje completo

		switch(numDiaSemana){

			case 1:

			case 2:

			case 3:

			case 4:

			case 5:

				mensaje += "Dia "+numDiaSemana+", "+diaSemana+". A trabajar...";

				break;

			case 6:

			case 7:

				mensaje += "Dia "+numDiaSemana+", "+diaSemana+". A descansar...";

				break;

			default:

				mensaje += "Dia "+numDiaSemana+", ERROR. Este dia no existe";

		

		}//FinSwitch control de mensaje

		System.out.println(mensaje);

	}//main

}//class