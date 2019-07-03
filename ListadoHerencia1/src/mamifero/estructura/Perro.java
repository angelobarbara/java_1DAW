package mamifero.estructura;

public class Perro extends Mamifero {

	private static final String SONIDO = "WOOF!";
	private static final int PATAS = 4;

	public Perro(String nombre) {
		super(PATAS, nombre);
	}

	public String getSonido() {
		return SONIDO;
	}

	@Override
	public String toString() {
		return super.toString() + ", y hago "
				+ getSonido() + "]";
	}

}
