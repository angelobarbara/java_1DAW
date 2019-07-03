/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 *
 * @author Angelo Barbara
 */
public class Coche implements Serializable {

	private String matricula;
	private Color color;
	private Modelo modelo;

	private static final Pattern patternMatricula = Pattern.compile("^\\d{4}([- ])?[B-Z&&[^AEIOULÑQ]]{3}$");

	public Coche(String matricula, Color color, Modelo modelo)
			throws MatriculaNoValidaException, ColorNoValidoException, ModeloNoValidoException {
		setMatricula(matricula);
		setColor(color);
		setModelo(modelo);
	}

	public Coche(String matricula) throws MatriculaNoValidaException {
		setMatricula(matricula);
	}

	// public Coche(Color color) throws ColorNoValidoException{
	// if(color == null)
	// throw new ColorNoValidoException("El color no es válido");
	// this.color = color;
	// }

	private static boolean esValida(String matricula) {
		return patternMatricula.matcher(matricula).matches();
	}

	private void setMatricula(String matricula) throws MatriculaNoValidaException {
		if (!esValida(matricula))
			throw new MatriculaNoValidaException("La matricula no es valida");
		this.matricula = matricula.replaceAll("[ -]", "");
	}

	private void setColor(Color color) throws ColorNoValidoException {
		if (color == null)
			throw new ColorNoValidoException("El color no es válido");
		this.color = color;
	}

	private void setModelo(Modelo modelo) throws ModeloNoValidoException {
		if (modelo == null)
			throw new ModeloNoValidoException("El modelo no es válido");
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 59 * hash + Objects.hashCode(this.matricula);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Coche other = (Coche) obj;
		if (!Objects.equals(this.matricula, other.matricula)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Coche{" + "matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", marca="
				+ modelo.getMarca() + '}';
	}

	Color getColor() {
		return color;
	}

}
