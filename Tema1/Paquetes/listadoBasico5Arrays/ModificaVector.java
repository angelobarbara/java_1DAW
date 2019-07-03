package listadoBasico5Arrays;
import utiles.*;
/**
Define la  clase ModificaVector. Realizará las siguientes opciones:

a. Creará un vector con la dimensión indicada por el usuario. 
b. Inicializará con valores consecutivos (1, 2, 3...).
c. Después se solicitará al usuario un elemento del array(entre 1 y longitud) y su nuevo valor para modificarlo.
d. Este  proceso  de  modificación  de  un  elemento  se  repetirá  tantas  veces  como 
quiera el usuario (¿quiere modificar otro(s/n)?)
e.Al acabar, se visualizarán el array ya modificado.
Vamos a crear un array con valores consecutivos. Dame la  longitud del array (entero positivo):
3
YA LO HE CREADO. Ahora vamos a modificar el array.
Dame un elemento del array (entre 1 y 3):
3
Dame un valor para introducir en la posición 3 del array:
33
¿Quieres modificar otro (s/n)?
s
Dame un elemento del array (entre 1 y 3):
1
Dame un valor para introducir en la posición 1 del array:
11
¿Quieres modificar otro (s/n)?
a[0] = 11
a[1] = 2
a[2] = 33

@author Angelo Barbara
@version 1.0
*/
class ModificaVector{
	public static void main(String[] args){
		int[] vector = new int[pedirDimension()];
		System.out.println("\nYA LO HE CREADO. Ahora vamos a modificar el array.");
		inicializacionVector(vector);
		modificaValor(vector);
	}
	static void modificaValor(int[] vector){
		do{
			int i=Teclado.leerEntero("\nDame un elemento del array (entre 1 y "+vector.length+"): ");
			int k=Teclado.leerEntero("\nDame un valor para introducir en la posicion "+i+" del array:");
			vector[i]=k;
		}while(Teclado.deseaContinuar());
		for(int l=0; l<vector.length; l++)
			System.out.println("\n"+vector[l]);
	}
	static void inicializacionVector(int[] vector){
		for(int i=0; i<vector.length; i++)
			vector[i]=i+1;
	}
	static int pedirDimension(){
		int i=Teclado.leerEntero("\nVamos a crear un array con valores consecutivos. Dame la  longitud del array (entero positivo): ");
		return i;
	}
	// static boolean quiereModificar(){
		// char quiereModificar=Teclado.leerCaracter("\nQuiere modificar otro? (s/n)");
		// return(quiereModificar=='s' || quiereModificar=='S');
	// }
}