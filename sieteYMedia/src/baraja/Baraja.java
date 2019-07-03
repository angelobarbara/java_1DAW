package baraja;
import java.util.ArrayList;
import java.util.Collections;

import carta.*;
import figura.*;
import palo.*;

public class Baraja{
	
	private ArrayList<Carta> baraja;
	public int cartaActual = 40;
	private static final int NUMERO_CARTAS = 40;
	
	
	public Baraja(){
		
		baraja = new ArrayList<Carta>();
		rellenarBaraja();
		
	}
	
	void rellenarBaraja(){
		int i = 0;
		// cartaActual = 0;
		
		for (Palo palo : Palo.values()) {
			for (Figura figura : Figura.values()) 
				baraja.add(new Carta(figura,palo));
		}
		
		Collections.shuffle(baraja);
	}
	
	
	public Carta sacarCarta() {
		
		if(baraja.isEmpty()) {
			System.out.println("No hay mas cartas en la baraja");
			return null;
		}

		return baraja.remove(0);
			
			
	}
	
	public boolean esVacia() {
		return baraja.isEmpty();
	}
	
}