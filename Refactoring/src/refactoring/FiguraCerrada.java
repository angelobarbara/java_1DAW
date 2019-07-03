package refactoring;

public abstract class FiguraCerrada {

	protected float altura;
	protected float base;
	public abstract double area();
	public abstract double perimetro();

	public FiguraCerrada(float base, float altura) {
		super();
	}

	protected void setAltura(float altura) {
		this.altura = (float) Math.round(altura * 100) / 100;

	}

	private void setBase(float base) {
		this.base = (float) Math.round(base * 100) / 100;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ", base " + base + ", altura " + altura + "]";
	}

}