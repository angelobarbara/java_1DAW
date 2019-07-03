package TestArgumentosMain;

public class TestArgumentosMain {

	public static void main(String... args) {
		
		String cadena ="";
		System.out.println("Numero de argumentos"+ args.length);
		for(int i=args.length-1; i>=0;i--) {
			cadena+=args[i].toUpperCase() + " ";
			
 		}
		System.out.println(cadena);
}
	
}

