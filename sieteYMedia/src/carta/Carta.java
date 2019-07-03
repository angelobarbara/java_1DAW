package carta;
import figura.*;
import palo.*;
public class Carta{
	
	private Figura figura;
	private Palo palo;
	
	public Carta(Figura figura, Palo palo){
		this.figura = figura;
		this.palo = palo;
	}
	
	public Figura getFigura(){
		return figura;
	}
	
	public Palo getPalo(){
		return palo;
	}
	
	public double getValor() {
		return figura.getValor();
	}
	
	@Override
	public String toString() {
		String mensaje = "";
		return mensaje +"\n" +getFigura()+ " de " + getPalo();
	}
}