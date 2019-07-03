package tema2.gato;
import tema2.utiles.*;

public class Gato{
	/**
	 * Nombre del gato
	 */
	private String nombre;
	/**
	 * Raza del gato
	 */
	private String raza;
	/**
	 * Peso del gato
	 */
	private int peso;
	static private int MAX_PESO = 10;
	static private int MIN_PESO= 0;

	/**
	Estado del gato, indica si está vivo o no
	*/
	private boolean muerto=false;

	

	Gato(String nombre,String raza,int peso) {
		this.nombre=nombre;
		this.raza=raza;
		this.peso=peso;
		//getEstado();
	}
	
	// public int setPeso(){
		// peso=0;
		// do{
			// peso=Teclado.leerEntero("Dame el peso del gato. Debe estar entre 2 y 8.");
		// }while(peso<MIN_PESO+2 || peso>MAX_PESO-2);
		// return this.peso;
	// }
	/**
	 * Muestra los datos del gato
	 */
	@Override
	public String toString(){
		String cadena="\nHola soy "+nombre+" de raza "+raza+". Peso: "+peso;
		return cadena;
	}
	
	/**
	 * Muestra un mensaje si se llega al peso límite
	 */
	String comprobarPeso(){
		//String mensaje="";
		if(peso>MIN_PESO+1 && peso<=MAX_PESO/2)
			 return "\nTengo hambre!!!";
		if(peso>MAX_PESO/2 && peso<MAX_PESO-1)
			return "\nVoy a reventar!!!";
		//else //(peso<=MIN_PESO || peso>=MAX_PESO)
			return morir();
		//return mensaje;
	}
	
	/**
	 * Incrementa el peso del gato
	 */
	String darDeComer(){
		if(muerto) return "Estoy Muerto";
		peso++;
		return comprobarPeso();
	}

	String dormir(){
		if(muerto) return "Estoy Muerto";
		return "\nRonroneo. Zzz...";
	}

	String despertar(){
		if(muerto) return "Estoy Muerto";
		return "\nEstoy despierto";
	}

	/**
	 * Decrementa el peso del gato
	 */
	String jugarConGato(){
		if(muerto) return "Estoy Muerto";
		peso--;
		return comprobarPeso();
	}
	
	boolean getEstado(){
		return muerto;
	}
	
	private void setEstado(boolean muerto){
		this.muerto=muerto;
		muerto=true;
	}
	
	/**
	 * Cambia el estado del gato a muerto
	 */
	private String morir(){
		setEstado(muerto);
		return "\nEl gato se ha muerto";
	}
}