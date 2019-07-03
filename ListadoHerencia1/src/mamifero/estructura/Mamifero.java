package mamifero.estructura;

public class Mamifero {

	private int patas;
	private String nombre;

	Mamifero(int patas, String nombre) {
		setPatas(patas);
		setNombre(nombre);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPatas(int patas) {
		this.patas = patas;

	}

	protected int getPatas() {
		return patas;
	}

	protected String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [patas=" + getPatas() + ", nombre=" + getNombre();
	}

}
