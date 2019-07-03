/**
Define la  clase Notas que almacene en un array 
15 notas.  Las notas se inicializarán de 
forma aleatoria con enteros entre 0 y 10. Se visualizarán las notas resultantes.

@author Angelo Barbara
@versin 1.0
*/
class Notas{
	public static void main (String[] args){
		int[] notas = new int[15];
		inicializarNotas(notas);
		mostraNotas(notas);
	}
	static void mostraNotas(int[] notas){
		for(int i=0; i<notas.length; i++){
			System.out.println("\n"+notas[i]);
		}
	}
	static void inicializarNotas(int[] notas){
		for(int i=0; i<notas.length; i++)
			notas[i]=(int)Math.round(Math.random()*10);
	}
}
