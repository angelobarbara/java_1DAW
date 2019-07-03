package testArea;

abstract class FiguraCerrada {

	private float dimension1;
	private float dimension2;

	abstract double area();

	FiguraCerrada(float dimension1, float dimension2) {
		setDimension1(dimension1);
		setDimension2(dimension2);
	}

	public float getDimension1() {
		return dimension1;
	}

	public float getDimension2() {
		return dimension2;
	}

	private void setDimension2(float dimension2) {
		this.dimension2 = (float)Math.round(dimension2 * 100) / 100;

	}

	private void setDimension1(float dimension1) {
		this.dimension1 = (float)Math.round(dimension1 * 100) / 100;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [area=" + area();
	}

}
