/**
Define la clase EcuacionSegundoGrado que muestre las soluciones de una ecuación de 
segundo  grado  ax2+  bx  +  c  =  0. Se  le  preguntará  al  usuario si  quiere  repetir  el programa.
Utiliza métodos (deseaContinuar, leerCoeficientes, mostrarResultados...)

@author Angelo Barbara
@version1.0
*/
class EcuacionSegungoGrado{
	public static void main (String[] args){
		boolean continuar=true;
		do{
			mostrarInstrucciones();
			leerCoeficientes();
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	Muestra por pantalla las instrucciones del programa
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca los valores a, b, c y se mostrara la solucion de la ecuacion ax2 + bx + c = 0");
	}
	/**
	Pide al usuario que introduzca tres valores numericos
	@param a primer numero introducido por el usuario
	@param b segundo numero introducido por el usuario
	*/
	static void leerCoeficientes(){
		int a,b,c;
		a=Teclado.leerEntero("\nIntroduzca el valor a");
		b=Teclado.leerEntero("\nIntroduzca el valor b");
		c=Teclado.leerEntero("\nIntroduzca el valor c");
		mostrarResultados(a,b,c);
	}
	/**
	Muestra el resultado de la ecuación de segundo grado
	*/
	static void mostrarResultados(int a, int b, int c){
		double x1, x2, discriminante;
		discriminante=(Math.pow(b, 2)) - (4*a*c);
		if(discriminante<0){
			System.out.println("\nNo hay solucion real");
			return;
		}
		else if(discriminante==0){
			x1=x2= -b/(2*a);
			System.out.println("\nLa solucion es "+x1);
			return;
		}
		else{
			x1=(-b + Math.sqrt(discriminante))/(2*a);
			x2=(-b - Math.sqrt(discriminante))/(2*a);
			System.out.println("\nLa solucion es:"
			+"\nx1 = "+x1
			+"\nx2 = "+x2);
		}
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