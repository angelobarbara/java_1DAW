/**
Define la clase MatrizDecimales que cree una matriz de decimales.
Pide las dimensiones (filas y columnas). Se inicializa con valores aleatorios entre 1 y 100 y visualiza el array.

@author Angelo Barbara
@version 1.0
*/
class MatrizDecimales{
	public static void main (String[] args){
		int min=1, max=100;
		double[][] matriz = new double[pedirDimension("filas")][pedirDimension("columnas")];
		inicializarMatriz(matriz, min, max);
	}
	static void inicializarMatriz(double[][] matriz, int min, int max){
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j]=(Math.random()*(max-min+1))+min;
				System.out.println("["+(i)+"]["+(j)+"]"+matriz[i][j]+"\t");
			}
	}
	static int pedirDimension(String dimensiones){
		int i;
		do{
			i=Teclado.leerEntero("\nIntroduzca el valor de la "+dimensiones);
			if(i==0)
				System.out.println("\nIntroduzca un valor mayor que cero");
		}while(i<1);
		return i;
	}
}