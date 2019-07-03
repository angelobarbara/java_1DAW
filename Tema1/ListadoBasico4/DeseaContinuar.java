/**
Define la clase DeseaContinuar que realice la siguiente pregunta: ¿Desea  continuar? (s/n).
En caso de que el usuario indique una s (minúscula o mayúscula) el programa 
seguirá preguntando. En otro caso, que se salga del programa. Para ello implementa el 
método  continuar  que  devuelva  true  en  caso  de  introducir  una  s,  y  false  en  caso 
contrario. Documéntalo correctamente (@return)

@author Angelo Barbara
@version 1.0
*/
class DeseaContinuar{
	public static void main (String[] args){
		boolean continuar = true;
		do{
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	 Pregunta al usuario si desea continuar pidiendole un caracter (s/n)
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