package listadoBasico5Arrays;
/**
Define la clase MultiplicaMatrices que multiplique dos matrices de enteros. El usuario 
introducirá por teclado las dimensiones de las matrices (m x n, n x o). Las matrices se inicializarán
de  forma  aleatoria  con  enteros  entre  1  y  10.  Se  visualizarán  factores  y resultado.

@author Angelo Barbara
@version 1.0
*/
class MultiplicaMatrices{
	public static void main (String[] args){
		int filas=pedirDimension("Introduzca el numero de filas: ");
		int columnas=pedirDimension("Introduzca el numero de columnas: ");
		int columnas2=pedirDimension("Introduzca el numero de columnas de la segunda matriz: ");
		int[][] matriz1=new int[filas][columnas];
		int[][] matriz2=new int[columnas][columnas2];
		inicializarMatriz(matriz1);
		inicializarMatriz(matriz2);
		int[][]matrizP=multiplicar(matriz1,matriz2);
		mostrar(matriz1, "MATRIZ 1: ");
		mostrar(matriz2, "MATRIZ 2: ");
		mostrar(matrizP, "MATRIZ PRODUCTO: ");
	}
	static void mostrar(int[][] matriz, String mensaje){
		System.out.println(mensaje);
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j]+"\t");
			System.out.println("");
		}
	}
	static int[][] multiplicar(int[][] matriz1, int[][] matriz2){
		int[][] matrizP = new int[matriz1.length][matriz2[0].length];
		for(int i=0;i<matrizP.length;i++)
			for(int j=0;j<matrizP[i].length;j++)
				for(int k=0;k<matriz2.length;k++)
					matrizP[i][j]+=matriz1[i][k]*matriz2[k][j];
		return matrizP;
	}
	static void inicializarMatriz(int[][] matriz){
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)Math.round(Math.random()*2);
	}
	static int pedirDimension(String mensaje){
		int i;
		do{
			i=Teclado.leerEntero(mensaje);
		}while(i<1);
		return i;
	}
}