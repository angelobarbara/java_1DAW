/**
Define la clase Potencia que calcule y visualice la potencia de un número dada la base 
y  el  exponente.  Se le preguntará  al  usuario  si  quiere  repetir  el  programa.  Utiliza 
métodos (deseaContinuar, mostrarInstrucciones...)

@author Angelo Barbara
@version 1.0
*/
class Potencia{
	public static void main (String[] args){
		boolean continuar=true;
		int i,c;
		mostrarInstrucciones();
		i=Teclado.leerEntero("\nIntroduzca la base de la pontencia");
		c=Teclado.leerEntero("\nIntroduzca el exponente");
		System.out.println("\nEl resultado de "+i+" elevado a "+c+" es "+calcularPotencia(i,c));
		continuar=deseaContinuar();
	}
	/**
	Muestra por pantalla las instrucciones del programa
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca una base y un exponente para que pueda calcular la potencia");
	}
	/**
	Calcula la potencia con base y exponente introducidos por el usuario
	@return Math.pow(i,c);
	*/
	static double calcularPotencia(int i, int c){
		return Math.pow(i,c);
	}
	/**
	Pregunta al usuario si desea continuar
	@return true si la respuesta es s o S y false en cualquier otro caso
	*/
	static boolean deseaContinuar(){
		char continuar;
		continuar=Teclado.leerCaracter("\nDesea continuar? (s/n)");
		if(continuar=='s' || continuar=='S')
			return true;
		else
			return false;
	}
}