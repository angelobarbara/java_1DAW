/**
Define la clase 
CerosYUnos que lea una secuencia de ceros y unos. Mostrará el número 
de ceros de la secuencia. Dejará de leer cuando el usuario introduzca el número 2.

@author Angelo Barbara
@version 1.0
*/
class CerosYUnos{
	public static void main(String[] args){
		int numero,contador=0;

		do{
			numero=Teclado.leerEntero("\nIntroduzca numeros 0 o 1 (2 para salir): ");
			if(numero<0 || numero>2){
				System.out.println("\nNumero incorrecto");
			}

			else{				
				contador=cuentaCeros(numero,contador);
			}
		}while(numero!=2);
		System.out.println("\nHas introducido "+contador+" ceros\n");
	}
	/**
	Cuento el numero de ceros introducidos por el usuario
	@return contador suma de los ceros introducidos
	*/
	static int cuentaCeros(int numero,int contador){
	if(numero==0){
		contador++;
	}
	return contador;
	}
}