
/**
Define la clase
Tiempo que dada una medida de tiempo expresada en horas, minutos y 
segundos  con  valores  arbitrarios,  elabore  un  programa  que  transforme 
dicha  medida 
en  una  expresión  correcta.  Por  ejemplo,  dada  la  medida  3h  118m  195s,  se  deberá 
obtener como resultado 5h 1m 15s

@author Angelo Barbara
@version 1.0
*/
public class Tiempo{
	public static void main(String[] args){

		int horas,minutos,segundos;
	
		do{
			horas=generarAleatorio(10);
			minutos=generarAleatorio(200);
			segundos=generarAleatorio(200);
			System.out.println("\nEl tiempo expresado de forma incorrecta es: "+horas+"h "+minutos+"m "+segundos+"s");
			horaCorrecta(horas,minutos,segundos);
			deseaContinuar();
		}while(deseaContinuar());
	}
	/**
	Genera aleatoriamente horas, minutos, segundos y los convierte en int
	@param factor son los factores que hay de multiplicar para expresar los valores de horas con 1 cifra, minutos y segundos con 3 cifras.
	@return (int)(Math.random()*factor), valores aleatorios de horas, minutos, segundos.
	*/
	static int generarAleatorio(int factor){
		return (int)(Math.random()*factor);
	}
	/**
	Muestra los valores de horas, minutos y segundos de forma correcta
	@param horas valor aleatorio de horas
	@param minutos valor aleatorio de minutos
	@param segundos valor aleatorio de segundos
	*/
	static void horaCorrecta(int horas, int minutos, int segundos){
		minutos+=segundos/60;
		segundos%=60;
		
		horas+=minutos/60;
		minutos%=60;
		
		int dias = horas/24;
		horas%=24;
		// while(segundos>59){
			// minutos+=1;
			// segundos-=60;
			// }
			// while(minutos>59){
			// horas+=1;
			// minutos-=60;
			// }
		System.out.println("\nEl tiempo expresado correctamente es: "+horas+"h "+minutos+"m "+segundos+"s");
	}
	/**
	/**
	Pregunta al usuario si desea continuar
	@return true si la respuesta es s o S y false en cualquier otro caso
	*/
	static boolean deseaContinuar(){
		char deseaContinuar=Teclado.leerCaracter("\nDesea continuar? (s/n) : ");
		return (deseaContinuar=='s' || deseaContinuar=='S');
	}
}