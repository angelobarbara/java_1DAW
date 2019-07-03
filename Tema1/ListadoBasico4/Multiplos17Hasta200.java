/**
El siguiente código muestra el funcionamiento de las palabras reservadas break y continue. Similar a este código,
crea la clase Multiplos17Hasta200 que utilice el bucle for, y Multiplos73 Hasta 1000 que utilice el bucle do-while.

@author Angelo Barbara
@version 1.0
*/
class Multiplos17Hasta200{
	public static void main (String[] args){
		int i = 0;
		System.out.println("Múltiplos de 7 hasta 200: ");
		for(;;){
			i++;
			if(i > 200)
				break;
			if(i % 17 != 0)
				continue;
			System.out.print("\t"+ i);
		}
	}
}