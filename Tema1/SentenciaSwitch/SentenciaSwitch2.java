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
public class SentenciaSwitch2 {
    public static void main(String[] args) {
		
		byte dia = 3;
		String nameDia;
		switch (dia) {
			case 1:
				nameDia = "Lunes";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A trabajar...");
				break;
				
			case 2:
				nameDia = "Martes";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A trabajar...");
				break;
				
			case 3:
				nameDia = "Miercoles";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A trabajar...");
				break;
							
			case 4:
				nameDia = "Jueves";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A trabajar...");
				break;
				
			case 5:
				nameDia = "Viernes";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A trabajar...");
				break;
	
			case 6:
				nameDia = "Sabado";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A trabajar...");
				break;
				
			case 7:
				nameDia = "Domingo";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A descansar...");
				break;
				
			default:
				System.out.println ("D\u00eda "+dia+". ERROR. Este día no existe...");
				break;
		
		}
	}	
}	