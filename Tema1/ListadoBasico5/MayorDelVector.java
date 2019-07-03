/**
Crea una clase MayorDelVector que cree un vector con enteros aleatorios y muestre el 
valor máximo. Para ello, implementa los métodos pedirDimension(),
inicializarVectorAleatoriamente(int[], i, max) y hallarMaximo(int[]).

@author Angelo Barbara
@version 1.0
*/
class MayorDelVector{
	public static void main(String[] args){
		int[] vector = null;
		int i = pedirDimension();
		int max= Teclado.leerEntero("\nIntroduzca el maximo");
		vector = inicializarVectorAleatoriamente(vector, i, max);
		for(int z=0;z<vector.length;z++)
			System.out.println("\nLos numero generados son: "+vector[z]);
		System.out.println("\nEl maximo es "+hallarMaximo(vector));
		
	}
	static int hallarMaximo(int[] vector){
		int maximo = 0;
		for(int b=0; b<vector.length; b++){
			if(vector[b]>maximo)
				maximo=vector[b];
		}
		return maximo;
	}
	static int[] inicializarVectorAleatoriamente(int[] vector, int i, int max){
		vector = new int[i];
		for(int b=0; b<vector.length; b++){
			vector[b]=(int)Math.round(Math.random()*max);
		}
		return vector;
	}
	static int pedirDimension(){
		int i;
		do{
			i=Teclado.leerEntero("\nIntroduzca la dimension");
		}while(i<1);
		return i;
	}
}
