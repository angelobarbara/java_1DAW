package tema2.circulo;
import tema2.utiles.*;
/**
*Crea una clase TestCirculo que cree una instancia de circulo muestre su
*estado, lo haga crecer 27 veces, averigue su area, lo haga decrecer 10 veces y
*muestre su estado final.
*@author Angelo Barbara
*@version 1.0
*/

public class TestCirculo{
	public static void main (String[] args){
	
		Circulo circulo = new Circulo(Teclado.leerEntero("Dame el radio del circulo: "));
		Menu menuCirculo = new Menu("Circulo", new String[]{"Area","Decrementar radio","incrementar radio","mostrar"});
		do{
			
			switch(menuCirculo.gestionarMenu()){
				case 1:
					System.out.println(circulo.toString());
					break;
				case 2:
					System.out.println(circulo.menguarRadio());
					break;
				case 3:
					System.out.println(circulo.incrementarRadio());
					break;
				case 4:
					System.out.println(circulo.toString());
					break;
				default:
					return;
			}
		}while(true);
	}
}