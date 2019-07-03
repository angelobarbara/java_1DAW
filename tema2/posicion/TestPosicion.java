package tema2.posicion;
import tema2.utiles.*;
/**
Diseña la clase Posicion que represente un punto (x,y) en el eje de coordenadas. Cada posición viene definida por dos valores enteros x e y. Constará de los siguietes métodos:

    Constructor por defecto. Se corresponde con la posición (0,0).
    Constructor al que se le pasa como argumento los valores inciales de las coordenadas x e y.
    Constructor de copia. Se le pasa como argumento un objeto de la misma clase. Se inicializan los campos del nuevo objeto con los mismos valores de los campos del objeto que se pasa como parámetro.
    Métodos para modificación y consulta (set/get) de los atributos de la clase.
    Métodos para incrementar y decrementar los valores de cada una de las coordenadas de la posición (incX, incY, decX, decY).
    Un método para establecer los valores de las coordenadas (setXY). 


Para su comprobación, crea la clase TestPosición y muestra los cambios de estado invocando a toString()

@author Angelo Barbara
@version 1.0
*/
public class TestPosicion {
	public static void main(String[] args) {
		mostrarConstructor("\nConstructor por defecto"); 
		Posicion posicion =new Posicion(); 
		mostrarPosicion(posicion.getX(),posicion.getY());
		
		mostrarConstructor("\nConstructor con argumentos");
		Posicion posicion2= new Posicion(getCoordenada('x'),getCoordenada('y'));
		mostrarPosicion(posicion2.getX(),posicion2.getY());
		
		mostrarConstructor("\nConstructor copia");
		Posicion posicion3= new Posicion(posicion2);
		mostrarPosicion(posicion3.getX(),posicion3.getY());
		
	}
	
	/**
	 * Muestra el tipo de constructor que se va a utlizar
	 * @param mensaje tipo de constructor
	 */
	static void mostrarConstructor(String mensaje){
		System.out.println(mensaje);
	}
	
	/**
	 * Muestra las coordenadas
	 * @param x valor de x
	 * @param y valor de y
	 */
	static void mostrarPosicion(int x,int y){
		System.out.println("\nx: "+x+", y: "+y);
	}
	
	/**
	 * Lee las coordenadas
	 * @param coordenada 'x' o 'y'
	 * @return valor dado por el usuario
	 */
	static int getCoordenada(char coordenada){
		return Teclado.leerEntero("Introduzca el valor de la coordenada "+coordenada+":");
	}
}