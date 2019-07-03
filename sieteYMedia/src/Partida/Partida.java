package Partida;
import java.util.ArrayList;

import Jugador.*;
import Utiles.*;
import baraja.Baraja;
import carta.*;
import figura.*;
import palo.*;

public class Partida {
	private Baraja baraja = new Baraja();
	private Carta carta;
	private ArrayList<Jugador> jugadores;
	private static final float SIETE_Y_MEDIA = (float) 7.5;
	

	public Partida(ArrayList<Jugador> jugadores) {
		
		this.jugadores = jugadores;
	}

	public void juego() {
		Jugador ganador = null;
		int contador = 0;
		double[] puntuacion = new double[jugadores.size()];
		for (Jugador jugador : jugadores) {
			
			System.out.println("\nTurno de "+ jugador.getNombre());
			puntuacion[contador] = ronda(jugador);
			jugador.jugar();
			
			contador++;
		}
		ganador = ganador(puntuacion);
		if(ganador == null) {
			System.err.println("\nNo hay ningún ganador\n");
			return;
		}
		ganador.ganar();
	}
		
	public double ronda(Jugador jugador) {
		double puntos = 0;
		do {
			carta = baraja.sacarCarta();
			if(!baraja.esVacia()) {
				puntos += carta.getValor();
				System.out.println(carta.toString() + "\nTienes "+ puntos + " puntos");
				jugador.setPuntuacion(puntos);
				if(puntos > SIETE_Y_MEDIA) {
					System.out.println("Te has pasado");
				}
			}
		}while(puntos <= SIETE_Y_MEDIA && Teclado.deseaContinuar("\n¿Quieres otra carta?(s/n)\n"));
		
		return puntos;
		
	}


	public Jugador ganador(double[] puntuacion) {
		Jugador ganador = null;
		double puntos = 0;
		for(int i = 0; i < puntuacion.length; i++) {
			if(puntuacion[i] > puntos && puntuacion[i] <= SIETE_Y_MEDIA) {
				puntos = puntuacion[i];
				ganador = jugadores.get(i);
			}
		}
		return ganador;
			
	}
//	private static void comprobarGanador() {
//		if(jugadores[0].getPuntuacion()>jugadores[1].getPuntuacion() && jugadores[0].getPuntuacion()<=7.5 || jugadores[1].getPuntuacion()>7.5)
//			System.out.println("Gana "+ jugadores[0].getNombre());
//		else 
//			System.out.println("Lo siento pero gana el "+ jugadores[1].getNombre());
//		
//		
//	}



	public boolean comprobarPuntuacion(double puntos){
			return (puntos <= SIETE_Y_MEDIA);
	}

}
