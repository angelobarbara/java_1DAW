package Iterator;

/**
 
@author Angelo Barbara
@version 1.0
 */

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

import Utiles.Menu;
import Utiles.Teclado;

public class TestHaciaAtrasModificado {
	
	static ArrayList<Double> arrayList = new ArrayList<Double>();
	private static ListIterator<Double> listIterator;
	
public static void main(String[] args) {
		
		Menu menuIterator = new Menu("Iterator", new String[] {"Añade nodo, Set nodo, Recorrer hacia atrás"});
		
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
				set();
				recorrer();
				break;
				
			case 3:
				recorrer();
				break;
				
			default:
				break;
			}
			
		}
		
		
		
		private static void set() {
			listIterator = arrayList.listIterator();
			while(listIterator.hasNext()) {
				System.out.println(listIterator.next());
				if(Teclado.deseaContinuar("Quiere modificar este elemento?"));
					listIterator.set(recogerDato());
			}
			
		}


		private static boolean continuar() {
			return Teclado.deseaContinuar("Quiere continuar? (s/n)");
		}


		private static void add() {
			listIterator = arrayList.listIterator();
			do {
				listIterator.add(recogerDato());
				
			}while(continuar());
			
		}


		private static Double recogerDato() {
			Double dato = (Double) Teclado.leerDecimal("\nIntroduzca un nuevo entero");
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
			listIterator =  arrayList.listIterator(arrayList.size());
			
			while (listIterator.hasPrevious()) {
				System.out.print(listIterator.previous());
			}
			
		}
		
		
}