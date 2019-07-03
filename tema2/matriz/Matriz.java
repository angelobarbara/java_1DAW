package tema2.matriz;
import tema2.utiles.*;

/**
Supongamos que queremos modelar una clase denominada Matriz. Queremos poder realizar  las distintas operaciones típicas de una matriz:

Sumar matrices

Restar matrices

Multiplicar matrices

Trasponer una matriz.

En todos estos procesos está implicada al menos una matriz (estructura de filas y columnas).

@author Angelo Barbara
@version 1.0
*/
public class Matriz{
	
	/**
	*Array bidimensional de la clase matriz
	*/
	private int[][]matriz;
	
	/**
	*Crea una matriz con todos sus valores a 0
	*@param filas, número de filas del array
	*@param columnas, número de columnas del array
	*/
	Matriz(int filas, int columnas){
		matriz = new int[filas][columnas];
	}
	
	/**
	*Crea una matriz con valores aleatorios
	*@param filas, número de filas del array
	*@param columnas, número de columnas del array
	*@param maximo, valor maximo que puede coger la matriz
	*@param minimo, valor minimo que pueden coger la matriz
	*/
	Matriz(int filas, int columnas, int maximo, int minimo){
		
		matriz = new int[filas][columnas];
		for(int i=0; i<filas; i++)
			for(int j=0; j<columnas;j++)
				matriz[i][j]=(int)Math.round(Math.random()*(maximo-minimo+1)+minimo);
	}
	
	/**
	*Traspone la matriz creada
	*/
	public void trasponer(){
		int filas=getFilas();
		int columnas=getColumnas();
		
		int[][] resultado = new int[columnas][filas];
		for(int i=0;i<filas;i++)
			for(int j=0;j<columnas;j++)
				resultado[j][i]=matriz[i][j];
			matriz=resultado;
	}
	
	/**
	*Devuelve las filas de la matriz
	*@return matriz.length, filas de la matriz
	*/
	public int getFilas(){
		return matriz.length;
	}
	
	/**
	*Devuelve las columnas de la matriz
	*@return matriz[0].length, columnas de la matriz
	*/
	public int getColumnas(){
		return matriz[0].length;
	}
	
	/**
	*Suma dos matrices y devulve una tercera matriz cuyos valores son la suma de los valores de los dos sumando
	*@param matriz2, segundo sumando
	*@return null, si los dos sumando no tienen la misma dimension
	*@return suma, suma de las dos matrices
	*/
	public Matriz sumar(Matriz matriz2){
		if(!mismasDimensiones(matriz2)){
			System.out.println("\nNo puedo sumar las matrices porque no son de las mismas dimensiones");
			return null;
		}
		int filas=getFilas();
		int columnas=getColumnas();
		
		Matriz suma = new Matriz(filas,columnas);
		
		for(int i=0;i<filas;i++)
			for(int j=0;j<columnas;j++)
				suma.matriz[i][j]=matriz[i][j] + matriz2.matriz[i][j];
			return suma;
	}
	
	/**
	*Comprueba si las matrices tienen la misma dimension
	*@param matriz2, segunda matriz
	*@return true si las dos matrices tienen la misma dimension, false si no tienen la misma dimension
	*/
	private boolean mismasDimensiones(Matriz matriz2){
		return (matriz.length == matriz2.matriz.length && matriz[0].length == matriz2.matriz[0].length);
	}
	
	/**
	*Mulltiplica las dos matrices y devulve una matrices resultante cuyo valor es la suma de los productos de cada uno de los valores de las columnas de la primera matriz por todos los valores de la columna de la segunda.
	*@param p2, segunda matriz
	*@return producto, producto de las dos matrices
	*/
	public Matriz multiplicar(Matriz p2){

		int filas=getFilas();
		int columnas=getColumnas();
		
		Matriz producto = new Matriz(filas,columnas);
		
		for(int i=0;i<filas;i++)
			for(int j=0;j<producto.matriz[0].length;j++)
				for(int k=0;k<columnas;k++)
					producto.matriz[i][j]+=matriz[i][k]*p2.matriz[k][j];
			return producto;
	}
	
	/**
	*Resta la dos primeras matrices
	*@param sutraendo, segunda matriz que le paso para la resta
	*@return resta, resultado de la resta de la dos matrices
	*/
	public Matriz restar(Matriz sutraendo){
		
		int filas=getFilas();
		int columnas=getColumnas();
		
		Matriz resta = new Matriz(filas,columnas);
		
		for(int i=0;i<filas;i++)
			for(int j=0;j<columnas;j++)
					resta.matriz[i][j]=matriz[i][j]-sutraendo.matriz[i][j];
			return resta;
	}
	/**
	*Muestra la matriz
	*@return cadena
	*/
	@Override
	public String toString(){
		String cadena="";
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++)
				cadena+=matriz[i][j]+"\t";
			cadena+="\n";
		}
		return cadena;
	}
}