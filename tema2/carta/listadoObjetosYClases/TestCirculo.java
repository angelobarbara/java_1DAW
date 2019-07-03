package t2.listadoObjetosYClases;
import t2.utiles.*;
/**
*Crea una clase TestCirculo que cree una instancia de circulo muestre su
*estado, lo haga crecer 27 veces, averigue su area, lo haga decrecer 10 veces y
*muestre su estado final.
*@version 1.8.0_152
*@author Adrian Moya Moruno
*/

public class TestCirculo{
	public static void main (String[] args){
	
		Circulo circulo = new Circulo(Teclado.leerEntero("Dame el radio del circulo: "));
		Menu menuCirculo = new Menu("Circulo", new String[]{"Area","Decrementar radio","incrementar radio","mostrar"});
		do{
			menuCirculo.mostrarMenu();
			switch(menuCirculo.getOpcion()){
				case 1:
					System.out.println(circulo.getArea());
					break;
				case 2:
					System.out.println(circulo.incrementarRadio());
					break;
				case 3:
					System.out.println(circulo.menguarRadio());
					break;
				case 4:
					System.out.println(circulo.toString());
					break;
				default:
					break;
			}
		}while(true);
}