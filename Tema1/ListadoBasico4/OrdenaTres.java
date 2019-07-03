/**
Define la clase OrdenaTres que ordene tres números enteros introducidos por teclado 
y los muestre por pantalla de forma decreciente. Se le preguntará al usuario si quiere repetir el programa.
Utiliza métodos (deseaContinuar, leer TresEnteros, mostrarResultados...)

@authro Angelo Barbara
@version 1.0
*/
class OrdenaTres{
	public static void main (String[] args){
		boolean continuar=true;
		do{
			mostrarInstrucciones();
			leerTresEnteros();
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	Muestra por pantalla las instrucciones del programa
	*/
	static void mostrarInstrucciones(){
		System.out.println("\nIntroduzca tres numeros enteros y se mostraran en orden decreciente");
	}
	/**
	Pide al usuario que introduzca tres enteros
	@param a primer numero introducido
	@param b segundo numero introducido
	@param c tercer numero introducido
	*/
	static void leerTresEnteros(){
		int a,b,c;
		a=Teclado.leerEntero("\nIntroduzca el primer numero entero");
		b=Teclado.leerEntero("\nIntroduzca el segundo numero entero");
		c=Teclado.leerEntero("\nIntroduzca el tercer numero entero");
		mostrarResultados(a,b,c);
	}
	/**
	Muestra los tre numeros introducidos por el usuario en orden cresciente
	*/
	static void mostrarResultados(int a, int b, int c){
		String mensaje= "\nLos numeros introducidos en orden decreciente son: ";
		if(a<b && b<c)
			System.out.println("\n"+mensaje+" "+c+" "+b+" "+a);
		else if(a<b && c<b && a<c)
			System.out.println("\n"+mensaje+" "+b+" "+c+" "+a);
		else if(b<a && a<c)
			System.out.println("\n"+mensaje+" "+c+" "+a+" "+b);
		else if(b<a && b<c && c<a)
			System.out.println("\n"+mensaje+" "+a+" "+c+" "+b);
		else if(c<a && a<b)
			System.out.println("\n"+mensaje+" "+b+" "+a+" "+c);
		else
			System.out.println("\n"+mensaje+" "+a+" "+b+" "+c);
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