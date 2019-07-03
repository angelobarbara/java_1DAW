package testArea;

public class Triangulo extends FiguraCerrada {

	public Triangulo(float base, float altura) {
		super(base, altura);
	}

	@Override
	double area() {
		return (double)Math.round(getDimension1() * getDimension2() / 2 * 100) / 100;
		//return area / 100;
	}

	@Override
	public String toString() {
		return super.toString() + ", base " + getDimension1() + ", altura " + getDimension2() + "]";
	}

}
