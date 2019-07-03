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
		int i=5, c=8;
		do{
			multiplica(i,c);
			System.out.println("\nEl producto de los valores es "+multiplica(i,c));
			continuar=deseaContinuar();
		}while(continuar);
	}
	/**
	 Calcula el producto de los dos números
	 @param i primer factor
	 @param c segundo factor
	 @return i*c producto de los dos números
	 */
	static int multiplica(int i, int c){
		return (i*c);
	}
	/**
	 Pregunta al usuario si desea continuar pidiendole un caracter (s/n)
	 @return true si la respuesta es s o S y false en cualquier otro caso
	 */
	static boolean deseaContinuar(){
		char continuar=Teclado.leerCaracter("\nDesea continuar? (s/n)");
		if(continuar=='s' || continuar=='S')
			return true;
		else
			return false;
	}
}