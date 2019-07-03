/**
Define  la  clase  AccesoDenegado  que  simule  el  acceso  a  un  sitio  en  función  de  dos 
valores  introducidos  por  el  usuario: edad del usuario y autorización  paterna. Sólo 
aparecerá el mensaje "Bienvenido" si el usuario es mayor de edad o si siendo menor 
de edad tiene la autorización  paterna. En cualquier otro caso, que muestre "Acceso 
denegado".

@author Angelo Barbara
@version 1.0
*/
class AccesoDenegado{
	public static void main (String[] args){
		int edad;
		char autorizacion ='s';
		
		edad = Teclado.leerEntero("Introduzca su edad: ");
		if (edad<18)
			autorizacion = Teclado.leerCaracter("Tiene autorizacion paterna: (s/n)");
		
		if (edad>17 || autorizacion == 'S' || autorizacion == 's')
			System.out.println("Bienvenido");
		else
			System.out.println("Acceso Denegado");
		
		
	}
}