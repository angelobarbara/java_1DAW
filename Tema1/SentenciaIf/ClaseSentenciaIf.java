/**
Mediante la sentecia if escribe un programa que muestre los siguientes mensajes en función del contenido de la variable diaSemana:

    Si almacena valores del 1 al 5, que muestre por ejemplo:
        Día 1 Laborable. A trabajar!!
    Si almacena lo valores del 6 ó 7 que muestre por ejemplo:
        Día 7. Fin de semana. A descansar!!
    En cualquier otro caso, que muestre:
        Día 0. El día de la semana ha de estar entre 1 y 7... Corrige tu error...
		
@author Angelo Barbara
@version 1.0
*/


public class ClaseSentenciaIf {
		public static void main(String[] args){
			
			byte dia = 1;
	
			if (dia<1 || dia>7) //{
				System.out.println ("El dia de la semana ha de estar entre 1 y 7... Corrige tu error...");
			//}
			else if (dia >=1 && dia <=5)//{
				System.out.println ("Dia "+dia+" Laborable. A trabajar!!");
	//	}
			else// if (dia == 6 || dia == 7){
				System.out.println ("Dia "+dia+". Fin de semana. A descansar!!");
			//}
}
}