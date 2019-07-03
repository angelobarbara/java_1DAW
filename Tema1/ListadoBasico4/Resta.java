/**
Define la clase Resta que realice de forma repetitiva restas y las muestre, siempre y 
cuando el usuario responda afirmativamente a la pregunta: ¿Desea continuar? (s/n).
Para ello utiliza un método continuar (ejercicio anterior) e implementa también el método restar con los dos argumentos que sean los operandos.
Ha de devolver su diferencia. Documéntalo correctamente (@param y @return)

@author Angelo Barbara
@version 1.0
*/
class Resta{
	public static void main (String[] args){
		boolean continuar=true;
		int i=8, c=5;
		do{
			restar(i,c);
			System.out.println("\nLa resta de los dos numeros es "+restar(i,c));
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	Calcula la resta de los dos numeros
	@param i primer numero
	@param c segundo numero
	@return i-c resta de los dos numero
	*/
	static int restar(int i, int c){
		return i - c;
	}
	/**
	Pregunta al usuario si desea continuar pidiendo un caracter s o n
	@return true si la respuesta es s o S, false en cualquier otro caso
	*/
	static boolean deseaContinuar(){
		char continuar=Teclado.leerCaracter("\nDesea continuar? (s/n)");
		if(continuar=='s' || continuar=='S')
			return true;
		else
			return false;
	}
}