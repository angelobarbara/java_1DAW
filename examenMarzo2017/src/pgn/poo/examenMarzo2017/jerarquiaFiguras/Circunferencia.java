package pgn.poo.examenMarzo2017.jerarquiaFiguras;

public class Circunferencia extends FiguraCerrada {

	private float radio;

	public Circunferencia(float radio) throws DimensionNoValidaException {
		super();
		setRadio(radio);
	}

	private void setRadio(float radio) throws DimensionNoValidaException {
		exception(radio);
		this.radio = (float)Math.round(radio * 100) / 100;

	}

	@Override
	double area() {
		return (double)Math.round(2 * Math.PI * getRadio() * 100) / 100;
		//return area / 100;
	}

	private float getRadio() {
		return radio;
	}

	@Override
	double perimetro() {
		return (double)Math.round(Math.pow(getRadio(), 2) * 100) / 100;
		//return perimetro / 100;
	}

	@Override
	public String toString() {
		return super.toString() + ", radio = " + getRadio() + "]";
	}

}
