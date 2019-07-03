package tema2.carta;
public class PaqueteDeCartas{
	
	private Carta[] paquete;
	private int cartaActual;
	private static final int numeroCarta = 40;
	
	
	public PaqueteDeCartas(){
		
		String[] caras = {"AS","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","SOTA","CABALLO","REY"};
		String[] palos  = {"ORO","ESPADAS","BASTOS","COPAS"};
		
		paquete = new Carta[numeroCarta];
		
		// cartaActual = 0;
		
		for(int cuenta = 0;cuenta<paquete.length;cuenta++){
			paquete[cuenta] = new Carta(caras[cuenta%10], palos[cuenta/10]);
		}
	}
	
	
	public void barajar(){
		// cartaActual=0;
		
		for(int primera =0; primera<paquete.length;primera++){
			int segunda = (int)Math.round(Math.random()*numeroCarta);
			
			Carta temp = paquete[primera];
			paquete[primera] = paquete[segunda];
			paquete[segunda] = temp;
		}
	}
	
	public Carta repartirCarta(){
		
		if(cartaActual<paquete.length)
			return paquete[cartaActual++];
		else
			return null;
	}
}