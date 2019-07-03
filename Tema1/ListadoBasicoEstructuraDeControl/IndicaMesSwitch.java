/**
Define  la  clase  IndicaMesSwitch. Semejante  al  anterior,  pero  usando  la  estructura Switch

@author Angelo Barbara
@version 1.0
*/

public class IndicaMesSwitch{
	public static void main(String[] args){
		int mes;
		int contador=1;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		do{
			System.out.print("\nIntroducir el numero correspondiente a un mes: ");
			mes = scanner.nextInt();
			switch(mes){
				case 1:
					System.out.println("\nEl mes es Enero");
					break;
				case 2:
					System.out.println("\nEl mes es Febrero");
					break;
				case 3:
					System.out.println("\nEl mes es Marzo");
					break;
				case 4:
					System.out.println("\nEl mes es Abril");
					break;
				case 5:
					System.out.println("\nEl mes es Mayo");
					break;
				case 6:
					System.out.println("\nEl mes es Junio");
					break;
				case 7:
					System.out.println("\nEl mes es Julio");
					break;
				case 8:
					System.out.println("\nEl mes es Agosto");
					break;
				case 9:
					System.out.println("\nEl mes es Septiembre");
					break;
				case 10:
					System.out.println("\nEl mes es Octubre");
					break;
				case 11:
					System.out.println("\nEl mes es Noviembre");
					break;
				case 12:
					System.out.println("\nEl mes es Diciembre");
					break;
				default:
					System.out.println("\nEl numero introducido no corresponde a un mes");
			}
			if (mes>0 && mes<13)
				contador++;
		}while (contador<11);
	}	
}
