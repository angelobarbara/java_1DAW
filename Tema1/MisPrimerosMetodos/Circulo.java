/**
Crea la clase Circulo que 3 veces:

-Solicite el radio de un círculo pedirRadio(). Recuerda comprobar que no sea negativo
-Muestre el área calcularArea()
-Muestre el perímetro calcularPerimetro()

@author Angelo Barbara
@version 1.0
*/
class Circulo{
	public static void main (String[] args){
		double radio;
		for(int i=0;i<3;i++){
			radio = pedirRadio();
			System.out.println(calcularArea(radio));
			System.out.println(calcularPerimetro(radio));
			}
	}
		
	static double pedirRadio(){
		double radio;
		do{
			radio = Teclado.leerDecimal("Introduzca el radio del circulo: ");
		}while(radio <= 0);
		return radio;
	}
	static double calcularArea(double radio){
		return Math.PI * Math.pow(radio, 2);
	}
	static double calcularPerimetro(double radio){
		return 2 * Math.PI * radio;
	}
}