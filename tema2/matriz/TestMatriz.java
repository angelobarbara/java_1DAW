package tema2.matriz;
import tema2.utiles.*;

public class TestMatriz{
	public static void main (String[] args){
		
		Matriz matriz = new Matriz(4,4,1,3);
		Matriz matriz2 = new Matriz(4,4,1,3);
		System.out.println("MATRI1:\n"+matriz.toString());
		matriz.trasponer();
		System.out.println("MATRIZ TRASPUESTA:\n"+matriz.toString());
		System.out.println("MATRIZ 2:\n"+matriz2.toString());
		System.out.println("MATRIZ SUMA:\n"+matriz.sumar(matriz2));
		System.out.println("MATRIZ PRODUCTO:\n"+matriz.multiplicar(matriz2));
		System.out.println("MATRIZ RESTA:\n"+matriz.restar(matriz2));
		
	}
}