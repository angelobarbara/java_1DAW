/**
Define la clase SumaMatrices que sume dos matrices de enteros. El usuario introducirá por  teclado  las  dimensiones  de  las  matrices
(m  x  n).  Las  matrices  se  inicializarán  de forma aleatoria con enteros entre 0 y 10. Se visualizarán sumandos y suma.
Completa este esqueleto:

@author Angelo Barbara
@version 1.0
*/
public class SumaMatrices {
	public static void main(String[] args){
	int filas = pedirDimension("Dame las filas: ");
	int columnas = pedirDimension("Dame las columnas: ");
	int[][] sumando1= crearMatriz(filas, columnas);
	mostrar(sumando1, "MATRIZ 1: ");
	int [][] sumando2 = crearMatriz(filas, columnas);
	mostrar(sumando2, "MATRIZ 2: ");
	int [][] suma = sumar (sumando1, sumando2);
	mostrar(suma, "MATRIZ SUMA: ");
	}
	static int[][] sumar(int[][] sumando1, int[][] sumando2){
		int[][] suma=new int[sumando1.length][sumando1[0].length];
		for(int i=0;i<sumando1.length;i++)
			for(int j=0;j<sumando1[i].length;j++)
				suma[i][j]=sumando1[i][j]+sumando2[i][j];
		return suma;
	}
	static void mostrar(int[][]matriz, String mensaje){
		System.out.println(mensaje);
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j]+"\t");
			System.out.println("");
		}
	}
	static int[][] crearMatriz(int filas, int columnas){
		int[][]matriz=new int[filas][columnas];
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)Math.round(Math.random()*10);
		return matriz;
	}
	static int pedirDimension(String filaColumna){
		int fila=Teclado.leerEntero(filaColumna);
		return fila;
	}
}