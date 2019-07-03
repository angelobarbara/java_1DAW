package mamifero.estructura;

public class Gato extends Mamifero {

	private static final String SONIDO = "MIAO!";
	private static final int PATAS = 4;

	public Gato(String nombre) {
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
