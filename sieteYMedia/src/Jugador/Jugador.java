package Jugador;

import java.util.*;

public class Jugador implements Comparable<Jugador>{
	
	private String nombre;
	private double puntuacion;
	private int contador;
	private int partidasJugadas;
	private int partidasGanadas;
	private int partidasPerdidas;
	
	public Jugador(String nombre){
		this.nombre = nombre;
	}
	
	public Jugador(Jugador jugador) {
		
	}
	
	public void jugar() {
		setPartidasJugadas(getPartidasJugadas()+1);
	}
	
	public void ganar() {
		setPartidasGanadas(getPartidasGanadas()+1);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public double getPuntuacion() {
		return puntuacion;
	}
	
	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	public int getPartidasGanadas() {
		return  partidasGanadas;
	}

	public void setPartidasGanadas(double max) {
		this.partidasGanadas = getPartidasJugadas() - getPartidasPerdidas();
	}

	private int getPartidasPerdidas() {
		return partidasPerdidas;
	}

	private void setPartidasPerdidas(int partidasPerdidas) {
		this.partidasPerdidas = getPartidasJugadas() - getPartidasGanadas();
}
	
	@Override
	public String toString() {
		return "El jugador: "+getNombre()+" tiene "+getPuntuacion()+" puntos";
	}
	
	@Override
	public int compareTo(Jugador jugador) {
		return new Double(puntuacion).compareTo(jugador.getPuntuacion());
//		return (getPartidasJugadas()-getPartidasGanadas());
	}

}
