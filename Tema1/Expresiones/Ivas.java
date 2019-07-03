/**
 El iva es un impuesto aplicable al consumo en la CEE. En España hay tres tipos de ivas: superreducido 4%, 
 reducido 10% y general 21%. Calcula y muestra el iva aplicado a los siguientes productos: Papel higiénico (2,70), 
 pañales (15,95), maquinilla de afeitar (8,75), colonia (1,45)
@author Angelo Barbara
@version 1.0
*/
public class Ivas{
		public static void main(String... args) {
			double ivaSuperReducido = 0.04;
			double ivaReducido = 0.1;
			double ivaGeneral = 0.21;
			
			double papel = 2.70;
			double panales = 15.95;
			double maquinilla = 8.75;
			double colonia = 1.45;

			System.out.println ("Ivas papel higi\u00e9nico:"
				+"\nprecio superreducido = "+(papel * ivaSuperReducido + papel) +";"
				+"\nprecio reducido = "+papel * ivaReducido+";"
				+"\nprecio general = "+papel * ivaGeneral+"."
				+"\n"
				+"\nIvas pa\u00f1ales:"
				+"\nprecio superreducido = "+panales * ivaSuperReducido+";"
				+"\nprecio reducido = "+panales * ivaReducido+";"
				+"\nprecio general = "+panales * ivaGeneral+"."
				+"\n"
				+"\nIvas maquinilla:"
				+"\nprecio superreducido = "+maquinilla * ivaSuperReducido+";"
				+"\nprecio reducido = "+maquinilla * ivaReducido+";"
				+"\nprecio general = "+maquinilla * ivaGeneral+"."
				+"\n"
				+"\nIvas Colonia:"
				+"\nprecio superreducido = "+colonia * ivaSuperReducido+";"
				+"\nprecio reducido = "+colonia * ivaReducido+";"
				+"\nprecio general = "+colonia * ivaGeneral+".");
			}
}