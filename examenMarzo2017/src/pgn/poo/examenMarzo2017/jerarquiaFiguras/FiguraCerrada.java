/**
 * 
 */
package pgn.poo.examenMarzo2017.jerarquiaFiguras;

/**
 * @author d17barba
 *
 */
public abstract class FiguraCerrada {

	private static int contador = 1;
	private int identificador;

	abstract double area();

	abstract double perimetro();

	static final float DIMENSION_MINIMA = 0.5f;

	FiguraCerrada() {
		setIdentificador();
	}

	private void setIdentificador() {
		this.identificador = getIdentificador();

	}

	private int getIdentificador() {
		return contador++;
	}

	public int getId() {
		return identificador;
	}

	protected void exception(float dimension) throws DimensionNoValidaException {
		if (dimension < DIMENSION_MINIMA)
			throw new DimensionNoValidaException(
					"ERROR. Error al crear el " + getClass().getSimpleName() + ". La dimensión mínima es de 0.5");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [identificador=" + getId() + ", area=" + area() + ", perimetro="
				+ perimetro();
	}

}
