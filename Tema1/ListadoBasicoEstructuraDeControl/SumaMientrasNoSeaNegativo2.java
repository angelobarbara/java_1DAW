/**
Define la clase SumaMientrasNoSeaNegativo que sume todos aquellos números leídos mientras no sean negativos.

@author Angelo Barbara
@version 1.0
*/
public class SumaMientrasNoSeaNegativo{
	public static void main(String[] args){
		int numero;
		int suma=0;

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		

		//while (numero>-1){
			//suma+=numero;
			//System.out.print("\nLa suma vale: "+suma);
			
			//System.out.print("\nIntroducir un numero entero: ");
			//numero = scanner.nextInt();
		//}
		do{
			System.out.print("\nIntroducir un numero entero: ");
			numero = scanner.nextInt();
			if (numero>-1)
				suma+=numero;
		}while(numero>-1);
		System.out.print("\nLa suma vale: "+suma);

	}
}
		


	
