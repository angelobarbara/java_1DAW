/**
Define la clase DiaDelMes que pide dos enteros, que representarán un mes y un año. 
Se visualizará el número de días del mes, teniendo en cuenta que:

a.31 días tienen Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
b.30 días tienen Febrero, Abril, Junio, Septiembre, Noviembre
c.Febrero tiene 29 días si el año es bisiesto. En cualquier otro caso, tiene 28
d.Un año es bisiesto si es divisible entre 4, a menos que sea divisible entre 100.
Sin embargo, si un año es divisible entre 100 y además es divisible entre 400, también resulta bisiesto.

@author Angelo Barbara
@version 1.0
*/
class DiaDelMes{
	public static void main (String[] args){
		int i;
		int c;
		String nombreMes;
		
		do{
			i=Teclado.leerEntero("\nIntroduza un numero entre 1 y 12: ");
		}while(i<0 || i>12);
		
		c=Teclado.leerEntero("\nIntroduzca el a\u00f1o: ");
		switch(i){
			case 1:
				nombreMes="Enero";
				break;
			case 2:
				nombreMes="Febrero";
				break;
			case 3:
				nombreMes="Marzo";
				break;
			case 4:
				nombreMes="April";
				break;
			case 5:
				nombreMes="Mayo";
				break;
			case 6:
				nombreMes="Junio";
				break;
			case 7:
				nombreMes="Julio";
				break;
			case 8:
				nombreMes="Agosto";
				break;
			case 9:
				nombreMes="Septiembre";
				break;
			case 10:
				nombreMes="Octubre";
				break;
			case 11:
				nombreMes="Noviembre";
				break;
			default:
				nombreMes="Diciembre";
				break;
		}
		switch(i){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("\nEl mes de "+nombreMes+" tiene 31 d\u00edas");
				break;				
			case 2:
				if((c%4==0) && (c%100!=0) || (c%100==0) && (c%400==0))
					System.out.println("\nEl mes de "+nombreMes+" tiene 29 d\u00edas");
					else
					System.out.println("\nEl mes de "+nombreMes+" tiene 28 d\u00edas");
					break;
						
				default:
					System.out.println("\nEl mes de "+nombreMes+" tiene 30 d\u00edas");
		}
	}
}