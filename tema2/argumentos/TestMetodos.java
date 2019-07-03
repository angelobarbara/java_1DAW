package tema2.argumentos;
class TestMetodos{
	public static void main(String[] args){
		
		Metodos m = new Metodos();
		int i=7;
		char c='a';
		double d=7.5;
		int[] vector=new int[7];
		
		
		i=m.incrementa(i);
		System.out.println(i);
		
		System.out.println(m.modifica(i,c,d));
		
		
		
		m.incrementa(vector);
		System.out.println(vector[0]);
		
		vector[0]=m.incrementa(vector[0]);
		System.out.println(vector[0]);
	}
}