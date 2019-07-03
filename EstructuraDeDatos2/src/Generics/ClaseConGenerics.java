package Generics;

import java.util.ArrayList;

public class ClaseConGenerics<E> {
	
		/**
		 * ArrayList de tipo T
		 */
		private ArrayList<E> lista=null;
		
		/**
		 * Constructor
		 */
		public ClaseConGenerics(){
			this.lista=new ArrayList<E>();
		}
		
		/**
		 * Añade el elemento pasado al final
		 * @param elemento de tipo T
		 */
		void método1(E elemento){
			lista.add(elemento);
		}
		
		/**
		 * Borra el elemento de la posición indicada
		 * @param posicion
		 * @return elemento que se borra
		 */
		E metodo2(int posicion){
			return lista.remove(posicion);
		}
}
