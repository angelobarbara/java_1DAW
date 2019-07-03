package tema2.carta;
public class Carta{
	
	private String cara;
	private String palo;
	
	public Carta(String caraCarta, String paloCarta){
		cara = caraCarta;
		palo = paloCarta;
	}
	
	@Override
	public String toString(){
		return cara + " de " +palo;
	}
}