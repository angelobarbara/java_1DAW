package tema2.argumentos;
class Metodos{
	private int i;
	private char c;
	private double d;
	private int[] vector;
	
	int incrementa(int i){
		return ++i;
	}
	int[] incrementa(int[] vector){//sobrecarga del metodo incrementa
		for(int i=0;i<vector.length;i++)
			vector[i]+=1;
		return vector;
	}
	String modifica(int i, char c, double d){
		i=3;
		c='a';
		d=8.5;
		return i+" "+c+" "+d;
	}
}