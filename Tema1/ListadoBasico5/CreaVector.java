/**
Crea una clase CreaVector que solicite al usuario el tamaño de un nuevo vector y que 
le pida los enteros necesarios para inicializarlo. Utiliza los métodos pedirDimension() y 
pedirDatos(int[])

@author Angelo Barbara
@version 1.0
*/
class CreaVector{
	public static void main (String[] arg){
		int[]vector= new int[pedirDimension()];
		pedirDatos(vector);
		for(int i=0; i<vector.length; i++)
			System.out.println("\nLos valores qua has introducido son: "+vector[i]);
	}
	static int pedirDimension(){
		int a=Teclado.leerEntero("\nIntroduzca el tamano del vector: ");
		return a;
	}
	static void pedirDatos(int[] vector){
		for(int i=0; i<vector.length; i++){
			int b=Teclado.leerEntero("\nIntrduzca los valores del vector: ");
			vector[i]=b;
		}
		
		
	}
}