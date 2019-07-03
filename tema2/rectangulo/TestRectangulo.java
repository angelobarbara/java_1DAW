package tema2.rectangulo;
import tema2.utiles.*;
/**
*Crea la clase Rectangulo y su respectivo TestRectangulo que nos permita
*manipular una instancia de rectángulo mediante un menú. 
*a.
*Un rectángulo no puede tener dimensiones negativas
*b.
*Comprueba que el rectángulo no desaparezca (siempre un ancho y un
*alto mayor que cero). 

*@author Angelo Barbara
*@version 1.0
*/

public class TestRectangulo{
	public static void main (String[] args){
		
		
		Menu menuRectangulo = new Menu("Rectangulo", new String[]{"Area", "Decrementar base", "Incrementar base","Decrementar altura", "Incrementar altura","Mostar","Crear nuevo rectangulo"});
		Rectangulo rectangulo = new Rectangulo(Teclado.leerEntero("Dame la base del rectangulo"),Teclado.leerEntero("Dame la altura del rectangulo"));
			
		do{
			switch(menuRectangulo.gestionarMenu()){
				case 1: 
				
					System.out.println("Area del Rectangulo = "+rectangulo.getArea()+""+rectangulo.toString());
				break;
				
				case 2: 
				
					System.out.println(rectangulo.menguarBase());
				break;
				
				case 3: 
				
					System.out.println(rectangulo.incrementarBase());
				break;
				
				case 4:
					System.out.println(rectangulo.menguarAltura());
				break;
				
				case 5:
					System.out.println(rectangulo.incrementarAltura());
				break;	
				
				case 6: 
					System.out.println(rectangulo.toString());	
				break;
				
				case 7:
					 rectangulo = new Rectangulo(Teclado.leerEntero("Dame la base del rectangulo"),Teclado.leerEntero("Dame la altura del rectangulo"));
				break;

				
				default:
					System.out.println("Con dios");
					return;
			}
		}while(true);
	}
}