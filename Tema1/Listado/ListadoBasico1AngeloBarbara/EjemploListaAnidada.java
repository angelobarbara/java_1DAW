/**
Crea  la  clase  EjemploListaAnidada que  muestre  la  siguiente  salida.  Para  ello  utiliza  el método 
System.out.print() con los caracteres \n y \t
@author Angelo Barbara
@version 1.0
*/

public class EjemploListaAnidada {
		public static void main (String[] args) {
			
			System.out.println ("Ejemplo de una lista anidada en HTML:"
				+"\n\t<ul>"
				+"\n\t\t<li>"
				+"\n\t\t<li>"
				+"\n\t\t<li>"
				+"\n\t\t\t<ul>"
				+"\n\t\t\t\t<li>"
				+"\n\t\t\t\t<li>"
				+"\n\t\t\t\t<li>"
				+"\n\t\t\t</ul>"
				+"\n\t</ul>");
		}
}