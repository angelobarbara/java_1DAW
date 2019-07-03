/**
Define la clase MatrizDecimales2 basada en la clase anterior.
Se ha de inicializar con valores aleatorios (solicita al usuario el mínimo y el máximo de los valores).
Ha de localizar los valores máximo, mínimo y media de la matriz. Que muestre tanto los valores como la posición que ocupan en la matriz.
Utiliza los métodos pedirFila(), pedirColumna(), pedirMínimo(), pedirMaximo(), crearMatriz(), mostrarMatriz(double[][]), hallarMedia(double[][]);

@author Angelo Barbara
@version 1.0
*/
class MatrizDecimales2{
	public static void main (String[] args){
		double[][]matriz=new double[pedirFila()][pedirColumna()];
		int min=pedirMínimo();
		int max=pedirMaximo();
		matriz=crearMatriz(matriz,min,max);
		mostrarMatriz(matriz);
		hallarMedia(matriz);
	}
	static void hallarMedia(double[][]matriz){
		int media=0;
		int contador=0;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++){
				media+=matriz[i][j];
				contador++;
			}
		media/=contador;
		System.out.println("La media es "+media);
	}
	static void mostrarMatriz(double[][]matriz){
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				System.out.println("["+(i)+"]["+(j)+"]"+matriz[i][j]+"\t");
	}	
	static double[][]crearMatriz(double[][]matriz, int min, int max){
		int i,j;
		for(i=0;i<matriz.length;i++)
			for(j=0;j<matriz[i].length;j++)
				matriz[i][j]=(Math.random()*(max-min+1))+min;
		return matriz;
	}
	static int pedirMaximo(){
		int max=Teclado.leerEntero("Introduzca el maximo");
		return max;
	}
	static int pedirMínimo(){
		int min=Teclado.leerEntero("Introduzca el minimo");
		return min;
	}
	static int pedirColumna(){
		int columna=Teclado.leerEntero("Introduzca columna");
		return columna;
	}
	static int pedirFila(){
		int fila=Teclado.leerEntero("Introduzca fila");
		return fila;
	}
}