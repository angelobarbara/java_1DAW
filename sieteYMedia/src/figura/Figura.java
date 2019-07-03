package figura;

public enum Figura {
	AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), SOTA(0.5), CABALlO(0.5), REY(0.5);
	
	
	private double valor;

	Figura(double valor){
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	
}
