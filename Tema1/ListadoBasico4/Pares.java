/**
Define  la  clase  Pares  que  de  forma  repetitiva  indique  si  un  número  es  par  o  impar. 
Define el método esPar(int)

@author Angelo Barbara
@version 1.0
*/
class Pares{
	public static void main (String[] args){
		int i;
		boolean continuar=true;
		
		do{
			i=Teclado.leerEntero("\nIntroduzca un numero entero");
			String mensaje="El numero "+i+" es ";
			// if(esPar(i))
				// mensaje += "par.";
			// else
				// mensaje += "impar.";
			
			
			//operador ternario
			mensaje += (esPar(i))?"par." : "impar.";
			System.out.println(mensaje);
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	Comprueba si el número introducido es par o impar
	@param i es el numero introducido por el usuario
	@return true si es par, false si es impar
	*/
	static boolean esPar(int i){
		return(i%2==0);
	}
	/**
	Pregunta al usuario si desea continuar
	@return true si la respuesta es s o S, false en cualquier otro caso
	*/
	static boolean deseaContinuar(){
		char continuar;
		continuar=Teclado.leerCaracter("\nDesea continuar? (s/n)");
		if (continuar=='s' || continuar=='S')
			return true;
		else
			return false;
	}
}