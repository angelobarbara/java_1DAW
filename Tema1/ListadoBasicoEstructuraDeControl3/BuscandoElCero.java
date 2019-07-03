/**
Define la clase BuscandoElCero. Utilizando el método Math.random() que devuelve un 
número aleatorio entre 0 y 1 [0,1) comprueba mediante un bucle infinito si el 
resultado  en  algún  momento  da  el  valor  0. Utiliza la sentencia break para salir del bucle.

@author Angelo Barbara
@version 1.0
*/
class BuscandoElCero{
	public static void main (String[] args){
		
	
	double numero;
	int contador=0;
	
	while(true){
		numero=Math.random();
		System.out.println(numero);
		contador ++;
		
		if (contador==1000)
			break;
	}
	}
}