package pgn.poo.examenMarzo2017.jerarquiaFiguras;

public class Cuadrado extends Rectangulo {

	public Cuadrado(float lado) throws DimensionNoValidaException {
		super(lado, lado);

	}

	@Override
	public String toString() {
		return toStringFigura() + ", lado=" + getBase() + "]";
	}

}
