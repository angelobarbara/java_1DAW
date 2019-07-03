package Iterator;

/**
 
@author Angelo Barbara
@version 1.0
 */

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

import Utiles.Teclado;

public class TestHaciaAtrasShort {
	
	static ArrayList<Short> arrayList = new ArrayList<Short>();
	static ListIterator<Short> listIterator = arrayList.listIterator();
	
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
			listIterator.add(pedirDato());
		}while(Teclado.deseaContinuar("Desea continuar? (s/n)"));
		
	}

	private static Short pedirDato() { 
		return (short)(Teclado.leerEntero("Introduzca un entero"));
	}
}