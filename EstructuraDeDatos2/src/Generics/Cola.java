package Generics;

import java.util.ArrayList;

public class Cola<E> {
		/**
		 * ArrayList
		 */
		ArrayList<E> cola=null;
		
		/**
		 * Constructor
		 */
		public Cola(){
			cola=new ArrayList<E>();
		}
		
		/**
		 * Añade un elemento al final
		 * @param elemento que se añadirá
		 */
		void enqueue(E elemento){
			cola.add(elemento);
		}
		
		/**
		 * Elimina el último elemento
		 * @return elemento que se borrará
		 * @throws PilaVaciaException 
		 */
		E dequeue() {
			if(cola.isEmpty())
				return null;
			return cola.remove(cola.size()-1);
			
		}
		
		/**
		 * Devuelve el último elemento
		 * @return elemento
		 * @throws PilaVaciaException 
		 */
		E front() {
			if(cola.isEmpty())
				return null;
			return cola.get(cola.size()-1);
			
		}

		public boolean isEmpty() {
			return cola.isEmpty();
		}
}
