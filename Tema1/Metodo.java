class Metodo{
	public static void main (String[] args){
		saludar("Pepe");
		
		String ella = "Rigoberta";
		saludar(ella);
		
		long suma = sumar(1, 2);
		System.out.println(suma);
	}
	
	static long sumar(int sum1, int sum2){
		return sum1 + sum2;
	}
	static void saludar(String nombre){
		System.out.println("hola "+nombre);
	}
}