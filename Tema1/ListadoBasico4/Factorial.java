/**
Define  la  clase  Factorial  que  muestre el  factorial  de  un  número  introducido  por teclado.
(Factorial  (4)  =  4*3*2*1;  Factorial  (0)  =  1). Realízalo  con los  tres  bucles
(factorialFor(), factorialDoWhile(), factorialWhile())

@authro Angelo Barbara
@version 1.0
*/
class Factorial{
	public static void main(String[] args){
		int i,c=1;

		mostrarInstrucciones();
		i=Teclado.leerEntero("\nIntroduzca un numero: ");
		System.out.println("\nEl factorial de " +i+ " con For es: "+factorialFor(i,c)
		+"\ncon Do-while es: "+factorialDoWhile(i,c)
		+"\ncon While es: "+factorialWhile(i,c));
	}
	/**
	Muestra por pantalla las instrucciones del programa
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca un numero y se calculara el factorial");
	}
	/**
	Calcula el factorial de un numero introducido por el usuario con el bucle for
	@return c factorial del numero introducido por el usuario
	*/
	static int factorialFor(int i, int c){
		for(;i>0;i--){
			c*=i;
		}
		return c;
	}
	/**
	Calcula el factorial de un numero introducido por el usuario con el bucle do while
	@return c factorial del numero introducido por el usuario
	*/
	static int factorialDoWhile(int i, int c){
		do{
			c*=i;
			i--;
		}while(i>0);
		return c;
	}
	/**
	Calcula el factorial de un numero introducido por el usuario con el bucle while
	@return c factorial del numero introducido por el usuario
	*/
	static int factorialWhile(int i, int c){
		while(i>0){
			c*=i;
			i--;
		}
		return c;
	}
}