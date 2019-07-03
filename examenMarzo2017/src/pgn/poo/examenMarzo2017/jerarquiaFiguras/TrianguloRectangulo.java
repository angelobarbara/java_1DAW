package pgn.poo.examenMarzo2017.jerarquiaFiguras;

public class TrianguloRectangulo extends FiguraCerrada {

	private float base;
	private float altura;

	public TrianguloRectangulo(float base, float altura) throws DimensionNoValidaException {
		super();
		setBase(base);
		setAltura(altura);
	}

	private void setAltura(float altura) throws DimensionNoValidaException {
		exception(altura);
		this.altura = (float) Math.round(altura * 100) / 100;

	}

	private void setBase(float base) throws DimensionNoValidaException {
		exception(base);
		this.base = (float) Math.round(base * 100) / 100;
	}

	float getBase() {
		return base;
	}

	float getAltura() {
		return altura;
	}

	@Override
	double area() {
		return (double) Math
				.round(getBase() + getAltura() + Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2)) * 100)
				/ 100;
		// return area / 100;
	}

	@Override
	double perimetro() {
		return (double) Math.round((getBase() * getAltura()) / 2 * 100) / 100;
		// return perimetro / 100;
	}

	@Override
	public String toString() {
		return super.toString() + ", base " + getBase() + ", altura " + getAltura() + "]";
	}

}
