/**
Define la clase Aleatorios que de forma repetitiva muestre un número aleatorio entre 
un mínimo y un máximo. Define el método 
generarAleatorio(min, max)

@author Angelo Barbara
@version 1.0
*/
public class Aleatorios{
	public static void main(String[] args){
		int i,c;
		boolean continuar=true;

		do{
			i=Teclado.leerEntero("\nIntroduzca el minimo: ");
			c=Teclado.leerEntero("\nIntroduzca el maximo: ");
			System.out.println("\nEl numero generado es: "+ generarAleatorio(i,c));
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	Genera numeros aleatorios entre un minimo y un maximo
	@param i minimo introducido por el usuario
	@param c maximo introducido por el usuario
	@return (int)Math.floor(Math.random()*(i-(c+1))+(c+1));
	*/
	static int generarAleatorio(int i,int c){
	return(int)Math.floor(Math.random()*(i-(c+1))+(c+1));
	}
	/**
	Pide al usuario si quiere continuar el programa
	@return true se introduce los caracteres s o S, false en cualquier otro caso
	*/
	static boolean deseaContinuar(){
	char continuar;
	continuar=Teclado.leerCaracter("\nDesea continuar? (s/n) : ");

	if(continuar=='s' || continuar=='S')
		return true;
	else
		return false;
	}
}