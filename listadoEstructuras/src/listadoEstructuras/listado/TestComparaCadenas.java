package listadoEstructuras.listado;

public class TestComparaCadenas {
	public static void main(String[] args) {
		String stringl = new String("Hola");
		String string2 = new String("Hola");
		System.out.println("string1 == string2: " + (stringl == string2));
		System.out.println("string1.equals(string2): " + (stringl.equals(string2)));

		String string3 = "Hola";
		String string4 = "Hola";
		System.out.println("\nstring3 == string4: " + (string3 == string4));
		System.out.println("string3.equals(string4): " + (string3.equals(string4)));

		String strinMay = "Hola";
		String strinMin = "hola";
		System.out.println("\nstringﬂay == strinMin: " + (strinMay == strinMin));
		System.out.println("strinMay.equals(strinMin): "

				+ (strinMay.equals(strinMin)));
		System.out.println("strinMay.equals(strinMin): " + (strinMay.equalsIgnoreCase(strinMin)));
	}
}
