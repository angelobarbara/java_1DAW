package tema2.circulo;
/**
 Implementa las siguientes Clases:

    Punto:
        Campos: Las coordenadas enteras x e y
        Contructor: Con dos parámetros x e y
        Método: toString() 
    Circulo:
        Campos: El centro del circulo y su radio
        Contructor: Con dos parámetros: Punto y radio
        Método: getArea()
        Método: getCircunferencia()
        Método: toString() 
    TestCirculo:
        Método: main que cree tantos círculos como indique el usuario.
		Los datos serán introducidos también por el usuario. Una vez creados todos, se mostrará el estado de cada uno de ellos. 
		
 * @author Angelo Barbara
 * @version 1.0
 */
public class Punto {
	
	private int x;
	private int y;
	
	Punto(int x,int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString(){
		String cadena=""; 
		cadena+="("+x+","+y+")";
	return cadena;
	}
}