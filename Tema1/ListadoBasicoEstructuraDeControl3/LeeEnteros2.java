/**
Define  la  clase LeeEnteros. Lee  10  enteros  e  indica  al  final  si  se  ha  introducido  algún cero.

@author Angelo Barbara
@version 1.0
*/
class LeeEnteros2{
	public static void main (String[] args){
		int numero;
		int contador=0;
		
		for(int i=0;i<10;i++){
			numero=Teclado.leerEntero("Introduzca un numero entero: ");
			if(numero==0)
				contador++;
		}
		if(contador==0)
			System.out.println("\nNo se han introducido ceros");
		else
			System.out.println("\nSe han introducidos ceros");
	}
}