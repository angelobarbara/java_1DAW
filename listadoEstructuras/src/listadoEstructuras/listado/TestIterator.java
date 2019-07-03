package listadoEstructuras.listado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("A");
		arrayList.add("N");
		arrayList.add("I");
		arrayList.add("M");
		arrayList.add("A");
		arrayList.add("L");
		
		System.out.println("Contenido original: \t\t");
		Iterator iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
//			String string = (String) iterator.next();    Otra manera de hacerlo ya que se que es una cadena
//														 de String
			System.out.print(object +"\t");
			
		}
		System.out.println();
		
		ListIterator listIterator = arrayList.listIterator();
		
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			listIterator.set(object +"*");
			
		}
		
		System.out.println("Lista modificada: \t\t");
		iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.print(object +"\t");
			
		}
		System.out.println();
		
		System.out.println("Lista modificada (hacia atras): ");
		while (listIterator.hasPrevious()) {
			Object object = (Object) listIterator.previous();
			
			System.out.print(object + "\t");
		}
		System.out.println();
	}
}
