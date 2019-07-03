package TestMatriz;

public class TestMatriz {
	public static void main (String[] args) {
		int[][] matriz = new int[5][5];
		rellenarMatriz(matriz);
		mostrarMatriz(matriz);
	}

	private static void mostrarMatriz(int[][] matriz) {
		for(int[] a : matriz) {
			for(int b : a)
				System.out.print(b +"\t");
			System.out.println("");
		}
		
	}

	private static void rellenarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) 
			for(int j = 0; j < matriz[i].length; j++)
				matriz[i][j] = i+j;
		
	}
}
