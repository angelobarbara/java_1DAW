package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RecorreArrayList {
	static ArrayList<String> arrayList = new ArrayList<String>();
	public static void main(String[] args) {
		arrayList.add("Salve");
		arrayList.add("Hola");
		arrayList.add("Hello");
		show();
		showWithIterator();
		showWithIterator2();
		showWithGet();
		showRevers();
		showReversWithGet();
		showWithForEach();
	}
	

	static void show(){
		System.out.println(arrayList);
	}
	
	/**
	 * Muestra el ArrayList mediante un iterador con el bucle while
	 */
	static void showWithIterator(){
		Iterator<String> it=arrayList.iterator();
		
		while(it.hasNext())
			System.out.print("Con iterator: "+it.next()+"\t");
	}
	
	/**
	 * Muestra el ArrayList mediante un iterador con el bucle for
	 */
	static void showWithIterator2(){
		for(Iterator<String> it=arrayList.iterator();it.hasNext();)
			System.out.print("\nCon iterator2: "+it.next()+"\t");
	}
	
	/**
	 * Muestra el ArrayList al revés mediante ListIterator
	 */
	static void showRevers(){
		for(ListIterator<String> it=arrayList.listIterator(arrayList.size());it.hasPrevious();)
			System.out.print("\nAl reves con listIterator: "+it.previous()+"\t");
	}
	
	/**
	 * Muestra el ArrayList mediante un for clásico, accediendo mediante índices
	 */
	static void showWithGet(){
		for(int i=0;i<arrayList.size();i++)
			System.out.print("\nCon get: "+arrayList.get(i)+"\t");
	}
	
	/**
	 * Muestra el ArrayList al revés mediante índices
	 */
	static void showReversWithGet(){
		for(int i=arrayList.size()-1;i>=0;i--)
			System.out.print("\nAl reves con get: "+arrayList.get(i)+"\t");
	}
	
	/**
	 * Muestra el ArrayList mediante un for mejorado
	 */
	static void showWithForEach(){
		for(String elemento:arrayList)
			System.out.print("\nCon forEach: "+elemento+"\t");
	}
}
