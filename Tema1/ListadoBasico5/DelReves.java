/**
Crea  una  clase  DelReves  que  implemente  el  método  mostrarDelReves(int  []).  Se  le pasará  como  argumento
un  vector  de  enteros inicializado  mediante  llaves. Mostrar á dicho vector del revés.

@author Angelo Barbara
@version 1.0
*/
class DelReves{
	public static void main (String[] args){
		int[]vector = {0,1,2,3,4};
		mostrarDelReves(vector);
	}
	static void mostrarDelReves(int[]vector){
		for(int i=vector.length-1;i>-1;i--)
			System.out.println(vector[i]);
	}
}