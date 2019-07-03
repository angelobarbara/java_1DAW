/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Angelo Barbara
 */
public class Concesionario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Coche> concesionario = new ArrayList<Coche>();

	void annadir(String matricula, Color color, Modelo modelo) throws Exception {
		Coche coche = new Coche(matricula);

		if (concesionario.contains(coche))
			throw new CocheYaExisteException("El coche ya existe");
		concesionario.add(new Coche(matricula, color, modelo));
	}

	boolean eliminar(String matricula) throws MatriculaNoValidaException {
		return concesionario.remove(new Coche(matricula));
	}

	int size() {
		return concesionario.size();
	}

	Coche get(String matricula) throws MatriculaNoValidaException, CocheNoExisteException {
		// Coche coche = new Coche(matricula);
		//
		// if(!concesionario.contains(coche))
		// throw new CocheNoExisteException("El coche no existe");
		try {
			return concesionario.get(concesionario.indexOf(new Coche(matricula)));
		} catch (Exception e) {
			throw new CocheNoExisteException("El coche no existe");
		}
	}

	boolean isEmpty() {
		return concesionario.isEmpty();
	}

	@Override
	public String toString() {
		int i = 1;
		StringBuilder cadena = new StringBuilder();
		cadena.append("\nConcesionario\n");
		for (Coche coche : concesionario) {
			cadena.append("\n" + i + ". " + coche + "\n");
			i++;
		}
		return cadena.toString();
		// return "Concesionario{" + "concesionario=" + concesionario + '}';
	}

	public ArrayList<Coche> cochesColor(Color color) throws ArrayColoresEsVacia {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		for (Coche coche : concesionario) {
			if (coche.getColor().equals(color))
				coches.add(coche);
		}
		if (coches.isEmpty())
			throw new ArrayColoresEsVacia("No hay ningún coche de este color");
		return coches;
	}
}
