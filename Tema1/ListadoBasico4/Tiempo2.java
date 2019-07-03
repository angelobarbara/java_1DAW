class Tiempo2{
	public static void main (String[] args){
		int horas, minutos, segundos;
		horas=Teclado.leerEntero("\nIntroduzca un numero de horas");
		minutos=Teclado.leerEntero("\nIntroduzca minutos");
		segundos=Teclado.leerEntero("\nIntroduzca segundos");
		
		System.out.println("\nHas introducido: "+horas+"h "+minutos+"m "+segundos+"s");
		
		while(segundos>59){
			minutos+=1;
			segundos-=60;
		}
		while(minutos>59){
			horas+=1;
			minutos-=60;
		}
		System.out.println("\nEl tiempo expresado correctamente es: "+horas+"h "+minutos+"m "+segundos+"s");
	}
	
}