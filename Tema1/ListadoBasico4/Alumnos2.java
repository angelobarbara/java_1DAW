/**
* Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos. 
* La nota será un número decimal comprendido entre 0 y 10, ambos inclusive. Utiliza métodos. 
* Al finalizar el programa deberá mostrar:
*<ol>
* <li>Total de notas
* <li>Número de aprobados
* <li>Número de suspensos
* <li>Nota máxima
* <li>Nota mínima
* <li>Media
*</ol>
* 
* @version 1.0
* @author Angelo Barbara
*/
class Alumnos2{
	public static void main(String[] args){
		int numAlumnos = 30, numAprobados=0;
		double total = 0, mayor = -1, menor = 11;
		
		double[] notas = new double[numAlumnos];
		
		for(int i= 0; i<numAlumnos;i++){
			notas[i] = obtenerNota();
			

			total += notas[i];
			if(esAprobado(notas[i]))
				numAprobados++;

			mayor = calcularMayor(notas[i], mayor);
			
		}
		for(int i=0; i<numAlumnos; i++){
			if(notas[i]==mayor)
				System.out.println(notas[i]+" es el mayor");
			else if(notas[i]==menor)
				System.out.println(notas[i]+" es el menor");
			else
				System.out.println(notas[i]);
		}

		System.out.println("Total: " + total);
		System.out.println("Numero de alumnos: " + numAlumnos);
		System.out.println("Numero de aprobados: " + numAprobados);
		System.out.println("Numero de suspensos: " + (numAlumnos-numAprobados));
		System.out.println("Numero mayor: " + mayor);
		System.out.println("Numero menor: " + menor);
		System.out.println("Media: " + (total/numAlumnos));

	}

	/**
	* Devuelve una nota válida, comprendida entre 0 y 10.
	*
	* @return Entero positivo
	*/
	static double obtenerNota(){
		return Math.random()*10;
	}
	/**
	* Indica si la nota es aprobado
	*
	* @param nota Nota a comparar
	* @return true si está aprobada. false en otro caso
	*/
	static boolean esAprobado(double nota){
		//return (nota>=5)?true:false;
		return nota>=5;
	}

	static double calcularMayor(double nota, double mayor){
		if(nota>mayor)
			mayor = nota;
		return mayor;
	}

	static double calcularMenor(double nota, double menor){
		if(nota<menor)
			menor = nota;
		return menor;
	}
}	
