package examen;

public class Animal {

	private int peso;

	final int PESO_MAXIMO;

	static final int PESO_MINIMO = 1;

	public Animal(int peso, int pesoMaximo) {

		super();

		int tmpPesoMaximo = Math.abs(pesoMaximo);

		this.PESO_MAXIMO = tmpPesoMaximo == 0 ? PESO_MINIMO : tmpPesoMaximo;

		setPeso(peso);

	}

	public int getPeso() {

		return peso;

	}

	public void setPeso(int peso) {

		if (peso <= 0)

			this.peso = PESO_MINIMO;

		else

			this.peso = peso < PESO_MAXIMO ? peso : PESO_MAXIMO;

	}

	public void engordar() {

		setPeso(getPeso() + 1);

	}

	public void adelgazar() {

		setPeso(getPeso() - 1);

	}

}
