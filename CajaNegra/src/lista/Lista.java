package lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Clase Lista que gestiona una estructura de datos ArrayList. Se encarga de
 * almacenar elementos de tipo gen�rico T en el orden indicado. Implementa una
 * gran cantidad de operaciones sobre la estructura de datos.
 * 
 * @author mlmc
 * 
 */
public class Lista<T> {
	/**
	 * Almacena la estructura de datos. Es un objeto ArrayList que contiene
	 * elementos de tipo T
	 */
	private ArrayList<T> lista = null;

	/**
	 * Constructor que crea el objeto ArrayList de tipo T
	 * 
	 */
	public Lista() {
		this.lista = new ArrayList<T>();
	}

	/**
	 * A�ade al final de la lista
	 * 
	 * @param elemento
	 *            elemento o nodo que va a a�adirse al final de la estructura
	 */

	public void annadir(T elemento) {
		lista.add(elemento);
	}

	/**
	 * A�ade en una determinado posici�n de la lista
	 * 
	 * @param posicion
	 *            �ndice donde va a insertarse el elemento (0 para el primero y
	 *            tama�o de la lista para a�adir al final)
	 * @param elemento
	 *            elemento o nodo de tipo T que va a insertarse
	 */
	public void annadir(int posicion, T elemento) {

		if ((posicion < 0) || (posicion > lista.size()))
			System.out.println("Fuera de rango en annadir.");
		else
			lista.add(posicion, elemento);
	}

	/**
	 * Modifica un elemento de una determinada posici�n de la lista
	 * 
	 * @param posicion
	 *            �ndice donde va a modificarse el elemento (0 para el primero y
	 *            tama�o de la lista - 1 para modificar el �ltimo)
	 * @param elemento
	 *            elemento o nodo de tipo T que va a modificarse
	 */
	public boolean modificar(int posicion, T elemento) {

		if ((posicion < 0) || (posicion >= lista.size())) {
			System.out.println("Fuera de rango en modificar.");
			return false;
		} else {
			lista.set(posicion, elemento);
			return true;
		}
	}
	
	public void vaciar() {
		Iterator iterator = lista.iterator();
		while (iterator.hasNext()) {
			lista.remove(0);
		}
//		while (iterator.hasNext()) {
//			lista.remove(0);
//			
//		}
	}

	/**
	 * Reemplaza un elemento de la lista. Se indica la posici�n del elemento
	 * 
	 * 
	 * @param posicion
	 *            �ndice donde va a insertarse el elemento (0 para el primero y
	 *            tama�o de la lista para a�adir al final)
	 * @param elemento
	 * @return
	 */
	/*
	 * boolean reemplazar(int posicion, T elemento) {
	 * 
	 * if ((posicion < 0) || (posicion > lista.size() - 1)) {
	 * System.out.println("Fuera de rango en reemplazar."); return false; }
	 * lista.set(posicion, elemento); return true; }
	 */
	/**
	 * M�todo que devuelve el tama�o de la lista
	 * 
	 * @return tama�o de la lista
	 */
	public int tamanno() {
		return lista.size();
	}

	/**
	 * M�todo que devuelve si una lista est� vac�a o no
	 * 
	 * @return true si la lista est� vac�a
	 */
	public boolean estaVacia() {
		return lista.isEmpty();
	}

	/**
	 * M�todo que muestra la lista
	 */
	public void mostrar() {
		System.out.println(lista);
	}

	/**
	 * M�todo que muestra la lista al rev�s
	 */
	public void mostrarAlReves() {
		ListIterator<T> lIt = lista.listIterator(lista.size());
		System.out.print("\n[");

		while (lIt.hasPrevious())
			System.out.print(lIt.previous() + ", ");
		System.out.println("]");
	}

	/**
	 * Borra el elemento de la posici�n indicada
	 * 
	 * @param posicion
	 *            �ndice del elemento a borrar
	 * @return true si se borra el elemento
	 */
	public boolean borrar(int posicion) {
		if ((posicion < 0) || (posicion > lista.size() - 1)) {
			System.out.println("Fuera de rango en borrar.");
			return false;
		}
		lista.remove(posicion);
		return true;
	}

	/**
	 * M�todo que busca el elemento indicado dentro de la lista
	 * 
	 * @param elemento
	 *            Elemento a buscar
	 * @return el �ndice de la primera ocurrencia encontrada en la lista. -1 si
	 *         no se encuentra el elemento
	 * 
	 */
	public int buscar(T elemento) {
		return lista.indexOf(elemento);
	}

	/**
	 * M�todo que busca y devuelve un elemento indicando su posici�n dentro de
	 * la lista
	 * 
	 * @param posicion
	 *            �ndice del elemento a devolver
	 * @return Elemento encontrado en la posici�n indicada. null si no est� el
	 *         elemento.
	 */
	public T buscar(int posicion) {
		if (fueraDeRango(posicion))
			return null;
		return lista.get(posicion);
	}

	/**
	 * M�todo que borra el elemento indicado dentro de la lista
	 * 
	 * @param elemento
	 *            Elemento a borrar
	 * @return true si el elemento est� en la lista
	 */
	public boolean borrar(T elemento) {
		if (buscar(elemento) != -1)
			lista.remove(elemento);
		return false;
	}

	/**
	 * Averigua si el �ndice indicado est� dentro del rango de la lista, del 0
	 * al tama�o-1 de la lista
	 * 
	 * @param posicion
	 *            posici�n del elemento a confirmar dentro de la lista
	 * 
	 * @return true si la posici�n indicada est� dentro del rango de la lista
	 */
	 private boolean fueraDeRango(int posicion) {
		if ((posicion < 0) || (posicion >= lista.size()))
			return true;
		return false;
	}

}
