/**
Crea una clase MínimoMatriz que  solicite al usuario el tamaño de una nueva matriz y 
que la inicialice con valores aleatorios (solicita al usuario el mínimo y el máximo de los 
valores).  Hallará  el  valor  mínimo  de  una  matriz,  dando  exactamente  su  posición  fila-columna.
Utiliza los métodos pedirFila(), pedirColumna(), pedirMínimo(), pedirMaximo, mostrarMatriz(), mostrarMínimo() ;

@author Angelo Barbara
@version 1.0
*/
class MinimoMatriz{
	public static void main (String[] args){
		int[][] matriz = new int[pedirDimension("Introduzca el numero de filas: ")][pedirDimension("Introduzca el numero de columnas")];
		int max=pedirMaximo();
		int min=pedirMinimo();
		inicializarMatriz(matriz,min,max);
		mostrarMatriz(matriz);
		hallarMinimo(matriz, max);
	}
	static void hallarMinimo(int[][] matriz, int max){
		System.out.println("MINIMO: ");
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				if(matriz[i][j]<max)
					max=matriz[i][j];
		System.out.println(max);
	}
	static void mostrarMatriz(int[][] matriz){
		System.out.println("MATRIZ: ");
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j]+"\t");
			System.out.println("");
		}
	}
	static void inicializarMatriz(int[][] matriz, int min, int max){
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)Math.round(Math.random()*(max-min+1)+min);
	}
	static int pedirMinimo(){
		int min=Teclado.leerEntero("Introduzca el valor minimo");
		return min;
	}
	static int pedirMaximo(){
		int max=Teclado.leerEntero("Introduzca el valor maximo");
		return max;
	}
	static int pedirDimension(String mensaje){
		int i=Teclado.leerEntero(mensaje);
		return i;
	}
}