/**
Define  la  clase  TraspuestaMatriz  que  invierta una  matriz  de  enteros.  Se  piden  las dimensiones y toma valores aleatorios entre 1 y 10.

@author Angelo Barbara
@version 1.0
*/
class TraspuestaMatriz{
	public static void main (String[] args){
		int[][] matriz=inicializarMatriz();
		mostrar(matriz);
		int[][] matriz2=inicializarmatrizTraspuesta(matriz);
		mostrar(matriz2);
	}
	static void mostrar(int[][]matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j]+"\t");
			System.out.println("");
		}
		System.out.println("");
	}
	static int[][] inicializarmatrizTraspuesta(int[][] matriz){
		int[][] matriz2=new int[matriz[0].length][matriz.length];
		for(int i=0; i<matriz2.length;i++)
			for(int j=0;j<matriz2[i].length;j++)
				matriz2[i][j]=matriz[j][i];
		return matriz2;
	}
	static int[][] inicializarMatriz(){
		int[][] matriz=new int[pedirDimension("Introduzca el numero de filas: ")][pedirDimension("Introduzca el numero de columnas: ")];
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)(Math.random()*(10-1+1)+1);
		return matriz;
	}
	static int pedirDimension(String dimension){
		int i=Teclado.leerEntero(dimension);
		return i;
	}
}