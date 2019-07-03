package pgn.poo.examenMarzo2017.estructuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import pgn.poo.examenMarzo2017.jerarquiaFiguras.Circunferencia;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.Cuadrado;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.DimensionNoValidaException;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.FiguraCerrada;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.Rectangulo;
import pgn.poo.examenMarzo2017.jerarquiaFiguras.TrianguloRectangulo;

public class Figuritas {
	private ArrayList<FiguraCerrada> figuritas = new ArrayList<FiguraCerrada>();
	private ArrayList<String> triangulos;

	public void altaCuadrado(float lado) throws DimensionNoValidaException {
		// try {
		figuritas.add(new Cuadrado(lado));
		// } catch (DimensionNoValidaException e) {
		// System.err.println(e.getMessage());
		// }
	}

	public void altaTriangulo(float base, float altura) throws DimensionNoValidaException {
		// try {
		figuritas.add(new TrianguloRectangulo(base, altura));
		// } catch (DimensionNoValidaException e) {
		// System.err.println(e.getMessage());
		// }
	}

	public void altaRectangulo(float base, float altura) throws DimensionNoValidaException {
		// try {
		figuritas.add(new Rectangulo(base, altura));
		// } catch (DimensionNoValidaException e) {
		// System.err.println(e.getMessage());
		// }
	}

	public void altaCircunferencia(float radio) throws DimensionNoValidaException {
		// try {
		figuritas.add(new Circunferencia(radio));
		// } catch (DimensionNoValidaException e) {
		// System.err.println(e.getMessage());
		// }
	}

	// public String altaMasiva() {
	// for (int i = 0; i < 3; i++) {
	// altaRectangulo(DimensionAleatoria(), DimensionAleatoria());
	// altaCuadrado(DimensionAleatoria());
	// altaTriangulo(DimensionAleatoria(), DimensionAleatoria());
	// altaCircunferencia(DimensionAleatoria());
	// }
	// return toString();
	// }

	public FiguraCerrada bajaPorIdentificador(int identificador) throws FiguraNoExisteException {
		FiguraCerrada figura = get(identificador);
		if (figura == null)
			throw new FiguraNoExisteException("ERROR. Ha introducido un identificador no válido");
		figuritas.remove(figura);
		return figura;
	}

	public FiguraCerrada bajaPorIndice(int index) throws FiguraNoExisteException {
		if (index < 0 || index >= figuritas.size())
			throw new FiguraNoExisteException("ERROR. Ha introducido un índice no válido");
		return figuritas.remove(index);
	}

	public ArrayList<String> listarTriangulos() {
		triangulos = new ArrayList<String>();
		Iterator<FiguraCerrada> it = figuritas.iterator();
		while (it.hasNext()) {
			FiguraCerrada figuraCerrada = (FiguraCerrada) it.next();
			if (figuraCerrada instanceof TrianguloRectangulo)
				triangulos.add("\n" + figuraCerrada);
		}
		return triangulos;
	}

	public int sizeTriangulos() {
		return triangulos.size();
	}

	public ArrayList<String> listarDelReves() {
		ArrayList<String> arrayList = new ArrayList<String>();
		ListIterator<FiguraCerrada> listIterator = figuritas.listIterator(figuritas.size());
		while (listIterator.hasPrevious()) {
			FiguraCerrada figuraCerrada = (FiguraCerrada) listIterator.previous();
			arrayList.add("\n" + figuraCerrada);
		}
		return arrayList;
	}

	private FiguraCerrada get(int index) {
		for (FiguraCerrada figura : figuritas)
			if (figura.getId() == index)
				return figura;
		return null;
	}

	public boolean isEmpty() {
		return figuritas.isEmpty();
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		int contador = 1;
		for (FiguraCerrada figura : figuritas)
			cadena.append("\n(" + contador++ + "). " + figura.toString());
		return cadena.toString();
	}

	// private float DimensionAleatoria() {
	// return (float) Math.random();
	// }
}
