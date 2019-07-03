/**
Define  la  clase  IvaConMetodos que  calcule  los  impuestos  que  se  aplican  a  un  precio 
base  en  función  de  si  el  iva  es  superreducido  (4%),  reducido  (10%)  o  general  (21%).

@author Angelo Barbara
@version 1.0
*/
class IvaConMetodos{
	public static void main (String[] args){
		double i, c;
		char iva;
		boolean continuar=true;
		do{
			i=pedirPrecio();
			iva=pedirIva();
			c=calcularIva(i,iva);
			System.out.println("\nEl iva a aplicar sobre "+i+" es "+c);
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	Pide al usuario el precio del producto
	@return i el precio del producto
	*/
	static double pedirPrecio(){
		double i;
		do{
			i=Teclado.leerEntero("\nIntroduzco un precio base (mayor que cero): ");
			if(i<0)
				System.out.println("\nEl numero introducido es incorrecto");
		}while(i<0);
		return i;
	}
	/**
	Piede al usuario que iva aplicar entre superreducido, reducido, general
	@return iva el tipo de iva a aplicar
	*/
	static char pedirIva(){
		char iva;
		do{
			iva=Teclado.leerCaracter("\nIndica el tipo di iva, superreducido, reducido, general (s/r/g): ");
			if(iva!='s' && iva!='S' && iva!='r' && iva!='R' && iva!='g' && iva!='G')
				System.out.println("\nIntroduzca s/r/g");
		}while(iva!='s' && iva!='S' && iva!='r' && iva!='R' && iva!='g' && iva!='G');
		return iva;
	}
	/**
	Calcula el iva a aplicar al producto en funcion del caracter introducido por el usuario
	@param i precio al que se aplica el iva
	@param iva el tipo de iva a aplicar al producto
	@return c el valor efectido del iva en relacion al caracter introducido
	*/
	static double calcularIva(double i, char iva){
		double c=0;
		if(iva=='s' || iva=='S')
			c=(i*4)/100;
		else if(iva=='r' || iva=='R')
			c=(i*10)/100;
		else if(iva=='g' || iva=='G')
			c=(i*21)/100;
		return c;
	}
	/**
	Pide al usuario si quiere continuar el programa
	@return true se introduce los caracteres s o S, false en cualquier otro caso
	*/
	static boolean deseaContinuar(){
		char continuar;
		continuar=Teclado.leerCaracter("\nDesea continuar? (s/n) : ");

		if(continuar=='s' || continuar=='S')
			return true;
		else
			return false;
	}
}