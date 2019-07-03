package tema2.argumentos3;
class Sobrecarga{
	private int i;
	private char c;
	private double d;
	private int[] vector;
	
	int incrementa(int i){
		return ++i;
	}
	int incrementa(int[] vector){//sobrecarga del metodo incrementa
		for(int i=o;i<vector.length;i++)
			vector[i]+=1;
		return vector;
	}