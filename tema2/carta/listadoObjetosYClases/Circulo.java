package t2.listadoObjetosYClases;
import t2.utiles.*;
/**
*Crea la clase “Circulo” que responda al siguiente comportamiento:
*a. Un círculo puede crecer. Aumenta su radio.
*b. Un círculo puede menguar. Decrementa su radio.
*c. Un círculo me devuelve su área si se la pido.
*d. Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5
*metros. Ocupo un área de 0.7853981633974483 metros cuadrados”
*(método toString())
*@version 1.8.0_152
*@author Adrian Moya Moruno
*/
public class Circulo{
	
	private double radio;

	/**
	*Constructor del Circulo
	*
	*@param radio: Utiliza el radio del circulo como parametro
	*/
	Circulo(double radio){
		this.radio = radio;
	}
	/**
	*Permite modificar el valor del radio, si su valor es menor que cero, tomara el valor de 1
	*/
	private void setRadio(double radio){
		if (radio<0) 
			radio = 1;
		this.radio=radio;
	}
	/**
	*Obtiene el radio y lo devuelve
	*@return radio
	*/
	double getRadio(double radio){
		return radio;
	}
	/*
	*Incrementa en una unidad el valor del radio y lo muestra en pantalla
	**/
	public void incrementarRadio(){
		 setRadio(getRadio(radio)+1);
	}
	/*
	*Decrementa en una unidad el valor del radio y lo muestra en pantalla
	**/
	public void menguarRadio(){
		 setRadio(getRadio(radio)-1);
	}
	/**
	*Calcula y devuelve el area del circulo ya creado.
	*@return areaCirculo:Devuelve el valor del area del circulo
	*/
	private double getArea(){
		double areaCirculo = Math.PI*radio*radio;
		return areaCirculo;
	}
	/**
	*Convierte las variables en cadena
	*@return recoge las variables x e y de punto, mas el radio, mas el area y la longitud de circunferencia
	*/
	@Override
	public String toString(){

		return "Soy un circulo de radio "+radio+" metros.\nOcupo un area de "+getArea()+" metros cuadrados";
	}//fin metodo
	/**
	*Indica el estado de incremento o decremento mediante un mensaje
	*@return una cadena de texto introducida en el metodo
	*/
	public String toString(String mensaje){
		return mensaje;
	}//fin metodo

}