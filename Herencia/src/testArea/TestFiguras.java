package testArea;

import java.util.ArrayList;

public class TestFiguras {
	private static ArrayList<FiguraCerrada> figuras = new ArrayList<FiguraCerrada>();
	
	public static void main(String[] args) {
		generarFiguras();
		mostrarFiguras();
	}

	private static void mostrarFiguras() {
		for(FiguraCerrada figura : figuras)
			if(figura.area() > 20)
				System.out.println(figura);	
	}

	private static void generarFiguras() {
		for (int i = 0; i < 5; i++) {
			figuras.add(new Rectangulo(DimensionAleatoria(), DimensionAleatoria()));
			figuras.add(new Triangulo(DimensionAleatoria(), DimensionAleatoria()));
		}	
	}
	
	private static float DimensionAleatoria() {
		return (float) Math.random() * 10;
	}
}
