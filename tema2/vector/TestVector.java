package tema2.vector;
import tema2.utiles.*;

class TestVector{
	public static void main(String[] args){
		Vector p=new Vector(10, 100, 90);
		Vector q=new Vector(10, 50, 10);
		System.out.println("Primer vector:\n" +p+"\n");//.toString());
		System.out.println("Maximo:\n" +p.calcularMax());
		System.out.println("Minimo:\n" +p.calcularMin());
		System.out.println("Suma:\n" +p.sumar());
		System.out.println("Segundo vector:\n" +q+"\n");
		System.out.println("Maximo:\n" +q.calcularMax());
		System.out.println("Minimo:\n" +q.calcularMin());
		System.out.println("Suma:\n" +q.sumar());
		
	}
}