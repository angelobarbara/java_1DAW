package tema2.vector;
import tema2.utiles.*;

class Vector{
	private int[] array;
	Vector(int tamanno, int max, int min){
		array=new int[tamanno];
		for(int i=0;i<array.length;i++)
			array[i]=Matematica.getAleatorio(max,min);
	}
	int calcularMax(){
		int maximo = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++)
			if(array[i]>maximo)
				maximo=array[i];
		return maximo;
	}
	int calcularMin(){
		int minimo=Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++)
			if(array[i]<minimo)
				minimo=array[i];
		return minimo;
	}
	int sumar(){
		int suma=0;
		for(int i=0;i<array.length;i++)
			suma+=array[i];
		return suma;
	}
	@Override
	public String toString(){
		String cadena=""; 
		for(int i=0;i<array.length;i++)
			cadena += "\t" + array[i];
	return cadena;
	}
}