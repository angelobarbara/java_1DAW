/**
Crea una clase MediaDelVector que cree un vector con enteros aleatorios y muestre la 
media del vector. Para ello, implementa los métodos pedirDimension(),
inicializarVectorAleatoriamente(int[], min, max) y hallarMedia(int[]).

@author Angelo Barbara
@version 1.0
*/
class MediaDelVector{
	public static void main (String[] args){
		int i = pedirDimension();
		int[] vector = new int[i];
		int min = Teclado.leerEntero("\nIntroduzca el valor minimo del vector");
		int max = Teclado.leerEntero("\nIntroduzca el valor maximo del vector");
		inicializarVectorAleatoriamente(vector, max, min);
		for(int k=0; k<vector.length; k++)
			System.out.println("\n"+vector[k]);
		System.out.println("\nLa media es: "+hallarMedia(vector));
	}
	static int hallarMedia(int[] vector){
		int media=0;
		for(int k=0; k<vector.length; k++)
			media+=vector[k];
		media/=vector.length;
		return media;
	}
	static void inicializarVectorAleatoriamente(int[] vector, int max, int min){
		for(int k=0; k<vector.length; k++)
			vector[k]=(int)Math.round(Math.random()*(max-min));
	}
	static int pedirDimension(){
		int i;
		do{
			i = Teclado.leerEntero("\nIntroduzca la dimension del vector");
		}while(i<1);
		return i;
	}
}