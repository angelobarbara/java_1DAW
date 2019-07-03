package refactoring;

import java.util.ArrayList;

public class Rectangulo extends FiguraCerrada implements Areable {
	private ArrayList<FiguraCerrada> arrayList = new ArrayList<FiguraCerrada>();
	
	
	public Rectangulo(float base, float altura)  throws DimensionNoValidaException {
		super(base, altura);
	}

	public void mostrarCuadrado() {
		System.out.println(new Cuadrado(0.5f));
	}
	/* (non-Javadoc)
	 * @see refactoring.Areable#area()
	 */
	@Override
	public double area() {
		return (double) Math.round(base * altura * 100) / 100;
		// return area / 100;
	}
	
	@Override
	public double perimetro() {
		return (double) Math.round((base + altura) * 2 * 100) / 100;
		// return perimetro / 100;
	}

	public String toStringFigura() {
		return super.toString();
	}

}
