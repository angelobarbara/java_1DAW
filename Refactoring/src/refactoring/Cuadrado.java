package refactoring;

public class Cuadrado  {
	private float lado;
	public Cuadrado(float lado)  {
		this.lado = lado;

	}

	@Override
	public String toString() {
		return ", lado=" + lado + "]";
	}

}
