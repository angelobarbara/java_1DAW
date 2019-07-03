/**
Define la clase SeriesDecrecientesDe25. Utilizando las tres estructuras de repetición (while, do while y for) 
genera las series del 1000 al 0 con un decremento de 25 (ambos incluídos)

@author Angelo Barbara
@version 1.0
*/
class SeriesDecrecientesDe25{
	public static void main (String[] args){
		int i;

		for (i=1000; i>-1; i-=25){
			System.out.println(i);
		}
		
		System.out.println("\n");
		i=1000;
		do{
			System.out.println(i);
			i-=25;
		}while (i>-1);
		
		System.out.println("\n");
		i=1000;
		while(i>-1){
			System.out.println(i);
			i-=25;
		}

	}
}