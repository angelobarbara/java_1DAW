package Generics;

import java.util.ArrayList;

public class Pila<E> {
	/**
	 * ArrayList
	 */
	ArrayList<E> pila=null;
	
	/**
	 * Constructor
	 */
	public Pila(){
		pila=new ArrayList<E>();
	}
	
	/**
	 * A�ade un elemento al final
	 * @param elemento que se a�adir�
	 */
	void push(E elemento){
		pila.add(elemento);
	}
	
	/**
	 * Elimina el �ltimo elemento
	 * @return elemento que se borrar�
	 * @throws PilaVaciaException 
	 */
	E pop() {
		if(pila.isEmpty())
			return null;
		return pila.remove(pila.size()-1);
		
	}
	
	/**
	 * Devuelve el �ltimo elemento
	 * @return elemento
	 * @throws PilaVaciaException 
	 */
	E top() {
		if(pila.isEmpty())
			return null;
		return pila.get(pila.size()-1);
		
	}

	public boolean isEmpty() {
		return pila.isEmpty();
	}
}
