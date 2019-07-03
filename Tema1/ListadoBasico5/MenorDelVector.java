/**
Crea una clase MenorDelVector que cree un vector con enteros aleatorios y muestre el valor mínimo. Para ello, implementa los métodos 
pedirDimension(),inicializarVectorAleatoriamente(int[], min, max) y hallarMinimo(int[]).

@author Angelo Barbara
@version 1.0
*/
class MenorDelVector{
	public static void main (String[] args){
		int[] vector = new int[pedirDimension()];
		int min = Teclado.leerEntero("\nIntroduzca un minimo");
		int max = Teclado.leerEntero("\nIntroduzca un maximo");
		inicializarVectorAleatoriamente(vector, min, max);
		for(int i=0; i<vector.length; i++)
			System.out.println("\n"+vector[i]);
		System.out.println("\nEl valor minimo es "+hallarMinimo(vector,max));
		
	}
	static int hallarMinimo(int[] vector, int max){
		int minimo=max;
		for(int i=0; i<vector.length; i++)
			if(vector[i]<minimo)
				minimo=vector[i];
		return minimo;
	}
	static void inicializarVectorAleatoriamente(int[] vector, int min, int max){
		for(int i=0; i<vector.length; i++)
			vector[i]=(int)Math.round(Math.random()*(max-min));
	}
	static int pedirDimension(){
		int i;
		do{
			i=Teclado.leerEntero("\nIntroduzca la dimension");
		}while(i<1);
		return i;
	}
}