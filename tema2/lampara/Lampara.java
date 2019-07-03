package tema2.lampara;

public class Lampara {
	private boolean encendida;
	
	public void encender(){
		encendida = true;
		System.out.println("Iluminando");
	}
	public void apagar(){
		encendida = false;
		System.out.println("Oscuridad");
	}
}