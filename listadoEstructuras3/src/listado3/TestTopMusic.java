package listado3;
import java.util.ArrayList;

import javax.swing.SingleSelectionModel;


import utiles.*;

public class TestTopMusic {

	static ArrayList<Musica> music = new ArrayList<Musica>();
	private static TopMusic topMusic = new TopMusic();
	
	public static void main(String[] args) {
		
		music.add(new Musica("La Mandanga","El Fary","12/2/97"));
		music.add(new Musica("Show msut go on","Queen","6/8/1984"));
		music.add(new Musica("Devil and I","Slipknot","6/7/2016"));
		music.add(new Musica("Sultans of swing","Dire Straits","31/9/1986"));
		music.add(new Musica("Fortunate son","Creedence Clearwater Revival","5/9/1969"));
	
		Menu menu = new Menu("TopMusic",
				new String[] {"Añadir canción","Mostrar Lista","Eliminar cancion","Vaciar el top", "Mostrar top 1","Subir canción","Bajar canción"});
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionar(opcion);
		} while (opcion != menu.getSalir());
	}	

	private static void gestionar(int opcion) {

		switch(opcion) {
		
			case 1:
				annadir();
				break;
			case 2:
				int i = 1;
				for(Musica musica : music) {
					System.out.print(i+". " + musica.toString()+"\n");
					i++;
				}
//				System.out.println("TopMusic " + music.toString());	
				break;
			case 3:
				borrar();
				break;
			case 4:
				vaciar();
				break;
			case 5: 
				System.out.println(topMusic.topCancion());
				break;
			case 6:
				System.out.println(topMusic.toString());
				topMusic.subir(Teclado.leerEntero("Seleccione una canción para subir: "));
				break;
			case 7:
				System.out.println(topMusic.toString());
				topMusic.bajar(Teclado.leerEntero("Seleccione una canción para subir: "));
				break;

			default:
				return;		
		}
//		System.out.println(music.music);
	}

	private static void borrar() {
		int element = Teclado.leerEntero("Elemento a eliminar: ")-1;
		if(element <= 0) {
			System.out.println("Introduzca un elemento valido");
			return;
		}
		System.out.println("Elemento eliminado " + topMusic.borrar(element));
		
	}

	private static void vaciar() {
		while(!music.isEmpty())
			System.out.println("Desapilo este elemento: " + topMusic.vaciar());
		
	}

	private static void annadir() {
		int index = Teclado.leerEntero("Posición a introducir canción: ")-1;
		if(index <= 0 ) {
			System.out.println("Introduzca un posición válida");
			return;
		}
		topMusic.annadir(index, new Musica(Teclado.leerCadena("Introduzca un nombre: "), Teclado.leerCadena("Introduzca un autor"), Teclado.leerCadena("Introduce una fecha")));
	}
	
	
	


}