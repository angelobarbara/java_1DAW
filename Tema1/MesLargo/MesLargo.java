/**
Mediante la sentecia if escribe un programa que muestre los siguientes mensajes en función del contenido de la variable mes:
Si es un mes largo, de 31 días, que muestre:
        El mes de diciembre tiene 31 días
Si es un mes corto, de 30 días, que muestre
        El mes tiene 30 días.
Si es febrero, que muestre
        Estamos en febrero. Depende de si es bisiesto o no.
En cualquier otro caso, que muestre:
        Mes 0. El mes ha de estar entre 1 y 12... Corrige tu error...
		
@author Angelo Barbara
@version 1.0
*/


public class MesLargo {
		public static void main(String[] args){
			
			byte mes = -1;
			String nombreMes;
			
			if(mes<1 || mes>12)
				System.out.println("Mes "+mes+". El mes ha de estar entre 1 y 12... Corrige tu error...");
			
			else if(mes == 2)
				System.out.println("Estamos en febrero. Depende de si es bisiesto o no.");
			
			else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
				
				if(mes == 1)
					nombreMes = "enero";
				else if(mes == 3)
					nombreMes = "marzo";
				else if(mes == 5)
					nombreMes = "mayo";
				else if(mes == 7)
					nombreMes = "julio";
				else if(mes == 8)
					nombreMes = "agosto";
				else if(mes == 10)
					nombreMes = "octubre";
				else
					nombreMes = "diciembre";
				
				
				System.out.println("El mes de "+ nombreMes +" tiene 31 d\u00edas.");
		}
			else //if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
				
				System.out.println("El mes tiene 30 d\u00edas");
			
}
}