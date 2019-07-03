package tema2.dado;
import tema2.utiles.*;

class TestDado{
	public static void main(String[] args){
		Dado dado = new Dado();
		Menu menuDado = new Menu("Dado", new String[]{"lanzar"});
		switch (menuDado.gestionarMenu()) {
				case 1:
					System.out.println(dado.lanzar());
					break;
				default:
					return;
			}
	}
}