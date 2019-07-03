package listadoBasico5Arrays;
/**
Define  la  clase  Secuencia  que  busque  la  secuencia  en  orden  creciente (<=)
más  larga dentro  de  un  vector  de  enteros inicializado  aleatoriamente  (Math.random()). 
Se mostrará tanto la posición de la primera componente de la secuencia como el tamaño de la misma.

@author Angelo Barbara
@version 1.0
*/
class SieteYMedia{
	public static void main (String[] args){
		boolean continuar=false;
		double puntos=0;
		int palo=0, figura=0;
		float[][] baraja = crearBaraja();
		do{
			int[] carta = sacarCarta(baraja,puntos);
			mostrarCarta(carta);
			puntos += obtenerPuntuacion(carta[1]);
			continuar=comprobarPuntuacion(puntos);
		}while(continuar);
	}
	static boolean comprobarPuntuacion(double puntos){
		System.out.println("\nTienes = "+puntos+" puntos");
		
		if(puntos<7.5)
			return deseaContinuar();
		else if(puntos==7.5)
			System.out.println("\nHAS GANADO!");
		else // if(puntos>7.5)
			System.out.println("\nHAS PERDIDO");
		
		return false;
	}
	 static float obtenerPuntuacion(int figura){
		 switch(figura){
			 case 7:
			 case 8: 
			 case 9: 
				return 0.5f;
			 default: 
				return figura + 1;
		 }
	
	 }
	
	static int[] sacarCarta(float[][] baraja, double puntos){
		int palo,figura,CARTA_SACADA=-1;
		double carta=0;
		do{
			palo = getEnteroAleatorio(3);
			figura = getEnteroAleatorio(9);
			carta=baraja[palo][figura];
		}while(carta==CARTA_SACADA);
		baraja[palo][figura]=CARTA_SACADA;
		
		return new int[] {palo,figura};
	}
	
	static int getEnteroAleatorio(int numero){
		int carta=(int)Math.round(Math.random()*numero);
		return carta;
	}
	static void mostrarCarta(int palo, int figura){
		System.out.println(getFigura(figura)+ " de "+getPalo(palo));
	}
	
	static void mostrarCarta(int[] carta){
		mostrarCarta(carta[0], carta[1]);
	}
	
	static String getFigura(int figura){
		switch(figura){
			case 0: return "As";
			case 1: return "Dos";
			case 2: return "Tres";
			case 3: return "Cuatro";
			case 4: return "Cinco";
			case 5: return "Seis";
			case 6: return "Siete";
			case 7: return "Sota";
			case 8: return "Caballo";
			default: return "Rey";
		}
	}
	static String getPalo(int palo){
		switch(palo){
			case 0: return "Oros";
			case 1: return "Copas";
			case 2: return "Espadas";
			default: return "Bastos";
		}
	}
	static float[][] crearBaraja(){
			return new float[][]{
			{1,2,3,4,5,6,7,0.5f,0.5f,0.5f},//oros
			{1,2,3,4,5,6,7,0.5f,0.5f,0.5f},//copas
			{1,2,3,4,5,6,7,0.5f,0.5f,0.5f},//espada
			{1,2,3,4,5,6,7,0.5f,0.5f,0.5f}};//bastos
	}
	static boolean deseaContinuar(){
		char continuar=Teclado.leerCaracter("Quieres otra carta? (s/n)");
		return(continuar=='s'||continuar=='S');
	}
}