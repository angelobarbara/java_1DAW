package Iterator;

/**
 
@author Angelo Barbara
@version 1.0
 */

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

import Utiles.*;

public class TestHaciaAtrasShort2 {
	
	static ArrayList<Short> arrayList = new ArrayList<Short>();
	private static ListIterator<Short> listIterator;
	
	public static void main(String[] args) {
		
		Menu menuIterator = new Menu("Iterator", new String[] {"Añade nodo", "Añade nodo en una posición determinada", "Recorrer hacia atrás"});
		
		int opcion;
		
		do {
			opcion = menuIterator.gestionar();
			gestionar(opcion);
		}while(opcion != menuIterator.getSalir());
	}
		
		
		private static void gestionar(int opcion) {
			
			switch(opcion) {
			case 1:
				add();
				recorrer();
				break;
				
			case 2:
				addPosicion();
				mostrarReves();
				break;
				
			case 3:
				recorrer();
				break;
				
			default:
				break;
			}
			
		}
		
		
		
		private static void addPosicion() {
			listIterator = arrayList.listIterator();
			int index = recogerIndice();
			for(int i =0; i < index && listIterator.hasNext(); i++) {
				if(listIterator.hasNext())
					listIterator.next();
			}
			
			listIterator.add(recogerDato());
			
			
			
		}


		private static void mostrarReves() {
			llevarAlFinal();
			
			while(listIterator.hasPrevious())
				System.out.print(listIterator.previous()+"\t");
			
		}


		private static void llevarAlFinal() {
			while(listIterator.hasNext()) 
				listIterator.next();
			
		}


		private static void add() {
			listIterator = arrayList.listIterator();
			do {
				listIterator.add(recogerDato());
			}while(Teclado.deseaContinuar("\nQuiere continuar? (s/n)\n"));
			
		}


		private static Short recogerDato() {
			short dato = (short) Teclado.leerEntero("\nIntroduzca un nuevo entero");
			return dato;
		}


		private static int recogerIndice() {
			int index=0;
			do {
				index = Teclado.leerEntero("\nIntroduzca la posicion del elemento, de 0 a "+(arrayList.size())+"\t");
			}while(index<0 || index>arrayList.size());
			return index;
		}


		private static void recorrer() {
			ListIterator listIterator =  arrayList.listIterator(arrayList.size());
			
			while (listIterator.hasPrevious()) {
				System.out.print(listIterator.previous()+"\t");
			}
			
		}
		
		
}