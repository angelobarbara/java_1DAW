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
		for(int i=0;i<7;i++){
			nombreUsuario = pedirNombreUsuario();
			saludar(nombreUsuario);
			despedir(nombreUsuario);
		}
	}
		static String pedirNombreUsuario(){
			return Teclado.leerCadena("\nIntroduzca su nombre: ");
		}
			
		static void saludar(String nombre){
			System.out.println("\nHola " + nombre);
		}
			
		static void despedir(String nombre){
			System.out.println("\nAdios " + nombre);
		}
}
	