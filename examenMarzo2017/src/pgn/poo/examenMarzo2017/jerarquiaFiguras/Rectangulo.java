package pgn.poo.examenMarzo2017.jerarquiaFiguras;

public class Rectangulo extends FiguraCerrada {

	private float base;
	private float altura;

	public Rectangulo(float base, float altura) throws DimensionNoValidaException {
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

	@Override
	double area() {
		return (double) Math.round(getBase() * getAltura() * 100) / 100;
		// return area / 100;
	}

	float getBase() {
		return base;
	}

	float getAltura() {
		return altura;
	}

	@Override
	double perimetro() {
		return (double) Math.round((getBase() + getAltura()) * 2 * 100) / 100;
		// return perimetro / 100;
	}

	public String toStringFigura() {
		return super.toString();
	}

	@Override
	public String toString() {
		return toStringFigura() + ", base " + getBase() + ", altura " + getAltura() + "]";
	}

}
