
package listado3;

import java.util.*;

import utiles.Teclado;

/**
 * Entrega la clase Lista que:
 * <ul>
 * 		<li>a. A\u00f1ada al final de la lista</li>
 * 		<li>b. Inserte un elemento en una determinada posici\u00f3n</li>
 * 		<li>c. Modifique un elemento reemplaz\u00e1ndolo por otro</li>
 * 		<li>d. Conozca el tama\u00f1o de la lista</li>
 * 		<li>e. Elimine elementos de la lista</li>
 * 		<li>f. Busque elementos en la lista</li>
 * 		<li>g. Copie la lista</li>
 * </ul>
 * Util\u00edzala en un ejemplo TestLista (por ejemplo, la alineaci\u00f3n de un equipo de
 * f\u00fatbol, con titulares y reservas) y entr\u00e9galo correctamente identificado y
 * documentado, incluyendo JavaDoc. Deber\u00e1s implementar un men\u00fa con las opciones
 * posibles para que el usuario lo utilice f\u00e1cilmente
 *
 * @author Guillermo Boquizo S\u00e1nchez
 * @version 1.0
 */
public class Lista<E> {

	private ArrayList<E> lista = new ArrayList<E>();

	/**
	 * Constructor de la clase lista.
	 * 
	 * @param arrayList Arraylist que utiliza los m\u00e9todos de esta clase.
	 */
	Lista(ArrayList<E> arrayList) {
		if (arrayList == null)
			arrayList = new ArrayList<E>();
		setArraylist(arrayList);
	}

	/**
	 * GET del ArrayList
	 * 
	 * @return lista la lista que se quiere obtener.
	 */
	 ArrayList<E> getArraylist() {
		return lista;
	}

	/**
	 * SET del ArrayList
	 * @param lista la lista a establecer.
	 *        
	 */
	private void setArraylist(ArrayList<E> arraylist) {
		this.lista = arraylist;
	}

	/**
	 * A\u00f1ade un nuevo elemento al final de la lista.
	 * 
	 * @param elemento elemento a a\u00f1adir al final de la lista.
	 */
	void add(E elemento) {
		getArraylist().add(elemento);
	}

	/**
	 * A\u00f1ade un nuevo elemento por \u00edndice. Devuelve false si el \u00edndice es menor a 0
	 * o sobrepasa el tama\u00f1o del arrayList. 
	 * @param elemento el elemento a introducir
	 * @param indice el \u00edndice por donde introducir
	 * @throws IndiceOutOfBoundsExeption  si el indice está fuera de rango
	 */
	void add(E elemento, int indice) throws IndiceOutOfBoundsExeption {
//		if (indice < 0 || indice > getArraylist().size())
//			return false;
		try {
			getArraylist().add(indice, elemento);
		} catch (Exception e) {
			throw new IndiceOutOfBoundsExeption("ERROR al añadir el elemento");
		}
//		return true;
	}

	/**
	 * Permite reemplazar un elemento por otro indicado en el \u00edndice indicado
	 * Si el \u00edndice es -1, devuelve null, en todo otro caso devuelve el arrayList modificado.
	 * @param elementoNuevo el elemento nuevo a introducir.
	 * @param elemento el elemento a modificar
	 * @throws IndiceOutOfBoundsExeption 
	 */
	void reemplazar(int index, E elemento) throws IndiceOutOfBoundsExeption {
		try {
			lista.set(index -1, elemento);
		} catch (Exception e) {
			throw new IndiceOutOfBoundsExeption("Error al reemplazar el elemento. Índie fuera de rango");
		}
	}

	/**
	 * Permite obtener la longitud de la lista.
	 * 
	 * @return la longitud de la lista.
	 */
	int size() {
		return getArraylist().size();
	}

		
	/**
	 * Permite eliminar un elemento de la lista.
	 * @param eliminado el elemento eliminado de la lista.
	 */
	void borrarElemento(E eliminado) {
		getArraylist().remove(eliminado);
	}
	/**
	 * Buscar y comprueba si existe el elemento.
	 * 
	 * @param elemento elemento que deseamos buscar para comprobar si existe en la lista.
	 * si el elemento est\u00e1 en la lista, devuelve true. En otro caso devuelve false
	 * @return si existe o no el elemento.
	 */
//	boolean buscaElemento(E elemento) {
//		
//		return getArraylist().contains(elemento);
//			
//	}

	
	/**
	 * Permite obtener una copia de la lista.
	 * 
	 * @return Una copia de la lista.
	 */
	Object copiaLista() {
		return getArraylist().clone();
	}

	/**
	 * Permite mostrar la lista
	 * 
	 * @return la lista devuelta mediante toString().
	 */
	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		cadena.append("\t***Lista Gen\u00e9rica***\n");
		for (E elemento : getArraylist()) {
			cadena.append(elemento + "\n");
		}
		return cadena.toString();
	}

	/**
	 * Permite pedir al usuario en qu\u00e9 posici\u00f3n por \u00edndice  se modificar\u00e1 la lista.
	 * 
	 * @return posici\u00f3n posici\u00f3n que se desea modificar de la lista
	 */
//	int pedirPosicion() {
//		int posicion;
//		do {
//			posicion = Teclado.leerEntero("\tIndica la posici\u00f3n del nuevo elemento entre 0 y " + getArraylist().size() + ":");
//			if(!esValida(posicion))
//				System.out.println("\n\tError, no existe esa posici\u00f3n, introduzca una posici\u00f3n v\u00e1lida:" + "\n");
//		} while (!esValida(posicion));
//		return posicion;
//	}
	/**
	*Devuelve true si la posici\u00f3n es v\u00e1lida y false en caso contrario.
	*@return true o false en funci\u00f3n de la posici\u00f3n.
	*/
//	private boolean esValida(int posicion) {
//		if(posicion < 0 || posicion > getArraylist().size())
//			return false;
//		return true;	
//	}
}