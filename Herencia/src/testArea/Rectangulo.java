package testArea;

public class Rectangulo extends FiguraCerrada {
	
	public Rectangulo(float base, float altura) {
		super(base, altura);
	}

	@Override
	double area() {
		return (double)Math.round(getDimension1() * getDimension2() * 100) / 100;
		//return area / 100;
	}

	@Override
	public String toString() {
		return super.toString() + ", base " + getDimension1() + ", altura " + getDimension2() + "]";
	}
}
