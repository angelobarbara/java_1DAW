/**
* Define la clase AlumnosEnArray que 
* obtenga aleatoriamente las notas de 30 alumnos y las almacene en un vector.
* La nota será un número decimal comprendido entre 0 y 10, ambos inclusive.
Utiliza métodos. 
Al finalizar el programa deberá mostrar todas las notas de los alumnos, indicando cuál de ellas es la mayor y cuál es la menor.
Total de notas
Número de aprobados
Número de suspensos
Nota máxima
Nota mínima
Media
* @author Angelo Barbara
* @version 1.0 
*/
public class AlumnosEnArray {

	public static void main(String[] args) {
		int numAlumnos = 30;
		double[] notas = new double[numAlumnos];
		inicializarAleatoriamente(notas);
		double[] mayorMenor = calcularMayorMenor(notas);
		int[] resultados = aprobadosSuspensos(notas);
		double totalNotas = calcularTotal(notas);
		double mediaNotas = totalNotas/numAlumnos;
		mostrarResultados(notas, resultados, mayorMenor, totalNotas, mediaNotas);
	}
	static void mostrarResultados(double[] notas, int[] resultados, double[] mayorMenor, double totalNotas, double mediaNotas){
		mostrar(notas, mayorMenor);
		System.out.println("Total de notas: " + totalNotas);
		System.out.println("Media de notas: " + mediaNotas);
		System.out.println("Numero abrobados: " + resultados[0]
		+"\nNumero Suspensos: "+ resultados[1]);
	}
	static int[] aprobadosSuspensos(double[] notas){
		int aprobados=0;
		int suspensos=0;
		for(int i=0; i<notas.length; i++){
			if(notas[i]>=5)
				aprobados++;
			else
				suspensos++;
		}
		return new int[]{aprobados, suspensos};
	}
	/**
	* Devuelve la suma de todas las notas
	@param notas Vector a recorrer
	*/
	static double calcularTotal(double[] notas){
		double total = 0;
		for(int i = 0; i<notas.length; i++){
			total += notas[i];
		}
		return total;
	}
	static double[] calcularMayorMenor(double[] notas){
		double mayor=-1;
		double menor=11;
		for(int i = 0; i<notas.length; i++){
			if (notas[i]>mayor)
				mayor = notas[i];
			if (notas[i]<menor)
				menor = notas[i];
		}
		return new double[]{mayor, menor};
	}
	/**
	Muestra el array de notas por consola
	@param notas Vector a mostrar
	*/
	static void mostrar(double[] notas, double[] mayorMenor){
		for(int i=0; i<notas.length; i++){
			if(notas[i] == mayorMenor[0])
				System.out.println(notas[i] + " mayor");
			else if(notas[i] == mayorMenor[1])
				System.out.println(notas[i]+ " menor");
			else 
				System.out.println(notas[i]);
		}
	}
	/**
	Inicializa el vector con número decimal comprendido entre 0 y 10
	@param notas Vector donde almacenar las notas de los alumnos
	*/
	static void inicializarAleatoriamente(double[] notas ){
		for(int i=0; i<notas.length; i++)
			notas[i] = generarNota();
	}
	/**
	Devuelve un número decimal comprendido entre 0 y 10
	@return número decimal comprendido entre 0 y 10
	*/
	static double generarNota(){
		return Math.random()*10;
	}
}