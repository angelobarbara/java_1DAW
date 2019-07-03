package mamifero.consola;

import java.util.ArrayList;
import java.util.ListIterator;

import mamifero.estructura.Gato;
import mamifero.estructura.Mamifero;
import mamifero.estructura.Perro;

public class TestMamifero {

	private static Perro perro = new Perro("Milú");
	private static Gato gato = new Gato("Garfield");
	private static ArrayList<Mamifero> animales = new ArrayList<Mamifero>();

	public static void main(String[] args) {
		System.out.println(perro.getSonido());
		System.out.println(gato.getSonido());
		
		animales.add(perro);
		animales.add(gato);
		
		System.out.println("\nCon for mejorado:");
		
		for(Mamifero mamifero : animales) {
			System.out.println(mamifero);				
		}
		
		System.out.println("\nCon ListIterator:");
		
		ListIterator<Mamifero> lt = animales.listIterator(animales.size());
		while (lt.hasPrevious()) {
			Mamifero mamifero = (Mamifero) lt.previous();
			System.out.println(mamifero.toString());
		}
	}
}
