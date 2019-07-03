package utiles;
public class Matematica{
	public static int getAleatorio(int max, int min){
		int aleatorio = (int)Math.round(Math.random()*(max - min)+min);
		return aleatorio;
	}
}