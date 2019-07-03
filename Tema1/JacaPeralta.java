/**
Crea la clase JacaPeralta que 7 veces:

-Solicite el nombre al usuario String pedirNombreUsuario()
-Lo salude saludar(String nombreUsuario)
-Lo despida despedir(String nombreUsuario)

@author Angelo Barbara
@version 1.0
*/
class JacaPeralta{
	public static void main (String[] args){
		String nombreUsuario;
		for(int i=0;i<7;i++);{
		nombreUsuario = pedirNombreUsuario();
		saludar(String nombreUsuario);
		despedir(String nombreUsuario);
		}
		static void pedirNombreUsuario();
			nombreUsuario=Teclado.leerCadena("Introduzca su nombre: ");
			
		static void saludar(String nombreUsuario);
			System.out.println("Hola");
			
		static void despedir(String nombreUsuario);
			System.out.println("Adios");
	}
}
	