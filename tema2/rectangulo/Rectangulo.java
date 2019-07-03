package tema2.rectangulo;
import tema2.utiles.*;

/**Crea la clase Rectangulo y su respectivo TestRectangulo que nos permita
manipular una instancia de rectángulo mediante un menú. 
a.
Un rectángulo no puede tener dimensiones negativas
b.
Comprueba que el rectángulo no desaparezca (siempre un ancho y un
alto mayor que cero). 

@author Angelo Barbara
@verion 1.0
*/

public class Rectangulo{
	
	private int base;
	private int altura;



	/**
	*Constructor del Circulo
	*
	*@param radio: Utiliza el radio del circulo como parametro
	*/
	Rectangulo(int base, int altura){
		setBase(base);
		setAltura(altura);

	}
	/**
	*Permite modificar el valor del radio, si su valor es menor que cero, tomara el valor de 1
	*/
	private String setBase(int base){
		String mensaje =""; 
		if (base<=0){ 
			mensaje = "La base "+base+" no es valido, se inicializara en 1 ";
			base = 1;
		}
		this.base=base;
		return mensaje;
	}

	private String setAltura(int altura){
		String mensaje ="";
		if (altura<=0){
			mensaje = "La base "+altura+" no es valida, se inicializara en 1";
			altura = 1;
		}
		this.altura=altura;
		return mensaje;
	}



	/**
	*Obtiene el radio y lo devuelve
	*@return radio
	*/
	int getBase(int base){
	return this.base = base;
	}

	int getAltura(int altura){
	return this.altura = altura;
	}


	/*
	*Incrementa en una unidad el valor del radio y lo muestra en pantalla
	**/
	public String incrementarBase(){
		 setBase(getBase(base)+1);
		 return toString();
	}

	public String incrementarAltura(){
		 setAltura(getAltura(altura)+1);
		 return toString();
	}
	/*
	*Decrementa en una unidad el valor del radio y lo muestra en pantalla
	**/
	public String menguarBase(){
		 return setBase(getBase(base)-1) + toString();
	}

	public String menguarAltura(){
		 return setAltura(getAltura(altura)-1) + toString();
	}
	/**
	*Calcula y devuelve el area del circulo ya creado.
	*@return areaCirculo:Devuelve el valor del area del circulo
	*/
	public int getArea(){
		int areaRectangulo = base * altura;
		return areaRectangulo;
	}
	/**
	*Convierte las variables en cadena
	*@return recoge las variables x e y de punto, mas el radio, mas el area y la longitud de circunferencia
	*/
	@Override
	public String toString(){

		return "Base = "+base+" metros, Altura = "+altura+" metros \nArea = "+getArea()+" metros cuadrados y " + soyCuadrado();
	}//fin metodo
	/**
	*Indica el estado de incremento o decremento mediante un mensaje
	*@return una cadena de texto introducida en el metodo
	*/
	public String toString(String mensaje){
		return mensaje;
	}//fin metodo

	public String soyCuadrado(){
		return (base == altura)?"soy un cuadrado":"soy un rectangulo";
	}
}