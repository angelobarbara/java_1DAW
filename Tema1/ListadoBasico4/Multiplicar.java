/**
Define la clase Multiplica que realice de forma repetitiva multiplicaciones y las muestre,
siempre y cuando el usuario responda afirmativamente a la pregunta: ¿Desea continuar? (s/n).
Para ello utiliza un método continuar (ejercicio anterior) e implementa también el método multiplicar con los dos argumentos que sean los factores.
Ha de devolver su producto. Documéntalo correctamente (@param y @return)

@author Angelo Barbara
@version 1.0
*/
class Multiplica{
	public static void main (String[] args){
		boolean continuar=true;
		int producto=1;
		do{
			valores=multiplica();
			producto*=valores;
			System.out.println("\nEl producto de los valores es "+producto);
			continuar=deseaContinuar();
		}while(continuar)
	}
	static int multiplica(){
		int i=Teclado.leerEntero("\nIntroduzca un numero entero");
		return i;
	}
	static boolean deseaContinuar(){
		char continuar;
		if(continuar=='s' || continuar=='S')
			return true;
		else
			return false;
	}
}