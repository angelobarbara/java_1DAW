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
public class SentenciaSwitch {
    public static void main(String[] args) {
		
		byte dia = 7;
		String nameDia;
		switch (dia) {
			case 1:case 2: case 3: case 4: case 5:{
				if (dia == 1)
				nameDia = "Lunes";
				else if (dia == 2)
				nameDia = "Martes";
				else if (dia == 3)
				nameDia = "Miercoles";
				else if (dia == 4)
				nameDia = "Jueves";
				else
				nameDia = "Viernes";}
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A trabajar...");
				break;
		}
			case 6: case 7: {
				if (dia == 6)
				nameDia = "Sabado";
				else 
				nameDia = "Domingo";
				System.out.println ("D\u00eda "+dia+", "+nameDia+". A descansar...");
				break;
			}
			default:
				System.out.println ("D\u00eda "+dia+". ERROR. Este día no existe...");
				break;
		
		}
	}	
	