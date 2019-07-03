/**
Define  la  clase  LeeCinco  que  lea  cinco  valores  numéricos  y  calcule  su  producto.
Se  le preguntará  al  usuario  si  quiere  repetir el  programa.
Utiliza  métodos  (deseaContinuar, leerCincoNumeros, System.out.println(El producto es:  + calcularResultado()...)

@author Angelo Barbara
@version 1.0
*/
class LeeCinco{
	public static void main (String[] args){
		boolean continuar=true;
		do{
			System.out.println("\nEl producto es: "+calcularResultado());
			continuar=deseaContinuar();
		}while(continuar);
	} 
	static int calcularResultado(){
		return leerCincoNumeros();
	}
	/**
	Lee cinco numeros introducidos por el usuario
	@return c numeros introducidos por el usuario
	*/
	static int leerCincoNumeros(){
		int i=0,c=1;
		for(int b=0;b<5;b++){
			i=Teclado.leerEntero("\nIntroduzca un numero entero");
			c*=i;
		}
		return c;
	}
	/**
	Pregunta al usuario si desea continuar
	@return true si la respuesta es s o S y false en cualquier otro caso
	*/
	static boolean deseaContinuar(){
		char deseaContinuar=Teclado.leerCaracter("\nDesea continuar? (s/n) : ");
		return (deseaContinuar=='s' || deseaContinuar=='S');
	}
}