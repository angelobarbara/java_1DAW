/**
Define la clase SeriesCrecientesDe25. Utilizando las tres estructuras de repetición (while, do while y for) 
genera la serie del 0 al 1000 con un incremento de 25 (ambos incluídos)

@author Angelo Barbara
@version 1.0
*/
class SeriesCrecientesDe25{
	public static void main (String[] args){
		int i;

		for (i=0; i<1001; i+=25){
			System.out.println(i);
		}
		
		System.out.println("\n");
		i=0;
		do{
			System.out.println(i);
			i+=25;
		}while (i<1001);
		
		System.out.println("\n");
		i=0;
		while(i<1001){
			System.out.println(i);
			i+=25;
		}

	}
}