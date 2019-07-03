/**
Define la clase 
SonIguales que lea dos valores numéricos, y determine si son iguales y, 
en caso de no serlo, indique cuál d
e ellos es el mayor.

@author Angelo Barbara
@version 1.0
*/
public class SonIguales{
	public static void main(String[] args){
		int i;
		int c;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("\nIntroducir un numero entero: ");
		i = scanner.nextInt();
		System.out.print("\nIntroducir otro numero entero: ");
		c = scanner.nextInt();

		if(i==c)
			System.out.print("\nLos numeros introducidos son iguales\n");
		
		else if(i>c)
			System.out.print("\n"+i+" es mayor que "+c+"\n");
		
		else //if(i<c){
			System.out.print("\n"+i+" es menor que "+c+"\n");
		
	}
}