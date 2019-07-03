package Iterator;
import Utiles.*;

/**
 
@author Angelo Barbara
@version 1.0
 */

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

import Utiles.Teclado;

public class TestHaciaAtras {
	
	static ArrayList<String> arrayList = new ArrayList<String>();
	static ListIterator<String> listIterator = arrayList.listIterator();
	
	public static void main(String[] args) {
		
		add();
		recorrer();
		
	
	}

	private static void recorrer() {
		ListIterator listIterator =  arrayList.listIterator(arrayList.size());
		
		while (listIterator.hasPrevious()) {
			System.out.println("\n"+listIterator.previous()+"\t");
		}
		
	}

	private static void add() {
		do {
			arrayList.add(Teclado.leerCadena("Introduzca una cadena"));
		}while(Teclado.deseaContinuar("Quiere continuar? (s/n)"));
		
	}
}
		
		