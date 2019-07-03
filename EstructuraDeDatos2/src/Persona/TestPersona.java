package Persona;

import java.util.ArrayList;
import java.util.Iterator;

public class TestPersona {
	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		
		listaPersonas.add(new Persona("Angelo","Barbara"));
		listaPersonas.add(new Persona("Juan Antonio","Bujalance"));
		listaPersonas.add(new Persona("Fulanito","de Copas"));
		
		mostrarLista(listaPersonas);
		listaPersonas.remove(listaPersonas.size()-1);
		mostrarLista(listaPersonas);		
		listaPersonas.remove(0);
		mostrarLista(listaPersonas);
		
	}
	
	static void mostrarLista(ArrayList<Persona> listaPersonas){
		Iterator<Persona> iterator=listaPersonas.iterator();
		
		while (iterator.hasNext()) {
			Persona persona = iterator.next();
			System.out.println(persona.toString());
			
		}
		System.out.println("\n");
}
}
