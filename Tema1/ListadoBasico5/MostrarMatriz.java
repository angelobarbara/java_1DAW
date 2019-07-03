/**
Crea una clase MostrarMatriz que solicite al usuario el tamaño de una nueva matriz y 
que  le  pida  los  enteros  necesarios  para  inicializarla.  Utiliza  los  método
s  pedirFila(), 
pedirColumna(), pedirDatos(int[]) y
mostrarMatriz();

@author Angelo Barbara
@version 1.0
*/
class MostrarMatriz{
	public static void main(String[] args){
	int[][] matriz = new int[pedirDimension("Introduzca el numero de filas: ")][pedirDimension("Introduzca el numero de columnas: ")];
		pedirDatos(matriz);
		mostrar(matriz);
	}
	static void mostrar(int[][] matriz){
		System.out.println("MATRIZ: ");
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j]+"\t");
			System.out.println("");
		}
	}
	static void pedirDatos(int[][] matriz){
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=Teclado.leerEntero("Introduzca el valor ["+i+"]["+j+"]");
	}
	static int pedirDimension(String mensaje){
		int i=Teclado.leerEntero(mensaje);
		return i;
	}
}