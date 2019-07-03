package listadoEstructuras.listado;

public class TestReferencia {

	static char[] vector1;// W (W a W W)
	static char[] vector2;// W (W a W W)

	public static void main(String[] args) {

		if (vector1 == null)
			System.out.println("vector vale null: " + vector1 + ". Todavia no apunta a la memoria dinánica");

		vector1 = new char[5];// 
		vector2 = vector1; // 
		
		if (vector1 == vector2)// 
			System.out.println("Ambas apuntan am mismo trozo de memoria.");

		vector2 = new char[5];// 
		if (vector1 != vector2)

			System.out.println("NO apuntan al nisno trozo de memoria.");
		
		for(char caracter:vector1)
			System.out.print(caracter + "-");
		
		for(char caracter:vector2)
			System.out.print(caracter +"-");


	}
}
