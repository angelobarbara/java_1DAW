public class Circulo {
	private Punto punto;
	private int radio;
	
	Circulo(int radio,int x, int y){
		punto=new Punto(x,y);
		setRadio(radio);
	}
	
	private int setRadio(int radio){
		// radio=Teclado.leerEntero=("radio");
		if(radio<1)
			radio=1;
		return this.radio=radio;
	}
	double getArea(){
		return Math.PI*Math.pow(radio,2);
	}
	
	double getCircunferencia(){
		return Math.PI*2*radio;
	}
	
	@Override
	public String toString(){
		String cadena=""; 
		cadena+="Soy un circulo de radio "+serRadio(radio)+" metros. Ocupo un aerea de "+getArea()+" metros cuadratos."
	return cadena;
	}
}