/**
Define la clase MortadeloYFilemon  que  muestre 5 veces  el  mensaje Mortadelo y Filemon. 
Realízalo usando el decremento y los tres bucles for, while y do..while.

@author Angelo Barbara
@version 1.0
*/

public class MortadeloYFilemon{
	public static void main(String[] args) {
		int i = 0;
		
		System.out.println("\nCon for");
		for (i=0; i<5; i++)
			System.out.println ("Mortadelo Y Filemon");
		
		i = 0;
		System.out.println ("\nCon do..while");
		
		do{
			i++;
			System.out.println ("Mortadelo Y Filemon");
		} while (i<5);
		
		i = 0;
		System.out.println ("\nCon while");
		
		while (i<5){
			i++;
			System.out.println ("Mortadelo Y Filemon");
		}
	}
}	