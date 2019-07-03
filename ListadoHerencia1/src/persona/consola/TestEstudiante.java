package persona.consola;

import java.util.ArrayList;
import java.util.ListIterator;

import persona.estructura.ApellidoNoValidoException;
import persona.estructura.Curso;
import persona.estructura.Estudiante;
import persona.estructura.NombreNoValidoException;
import persona.estructura.Persona;

public class TestEstudiante {
	 
	private static Persona persona1;
	private static Persona persona2;
	private static Estudiante estudiante1;
	private static Estudiante estudiante2;
	private static ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		
		inizializarPersona();
		rellenarArrayList();
		mostrarPersonas();
		
		mostrarCursos();
		Persona persona1 = estudiante1;	//se pueden utilizar los métodos de persona
		//System.out.println(persona1);
		Estudiante estudiante3 = (Estudiante)persona1;  //se pueden utilizar los métodos de estudiante
		//System.out.println(estudiante3);
	}

	private static void mostrarPersonas() {
		StringBuilder cadena = new StringBuilder();
		for(Persona persona : personas)
			cadena.append(persona+"\n");
		System.out.println(cadena);
	}

	/**
	 * 
	 */
	private static void mostrarCursos() {
		System.out.println("\nCurso de los estudiantes: ");
		ListIterator<Persona> lt = personas.listIterator(personas.size());
		while (lt.hasPrevious()) {
			Persona persona = (Persona) lt.previous();
			if(persona instanceof Estudiante) {
				//Estudiante estudiante = (Estudiante)persona;
				System.out.println(((Estudiante) persona).getCurso());
			}
		}
	}

	private static void rellenarArrayList() {
		personas.add(persona1);
		personas.add(persona2);
		personas.add(estudiante1);
		personas.add(estudiante2);
		
	}

	private static void inizializarPersona() {
		try {
			persona1 = new Persona("Pepito","Perez aaa","00000000A");
			persona2 = new Persona("Fulanito","Copas bbb","00000000B");
			estudiante1 = new Estudiante("Angelo","Barbara ccc","00000000C",Curso.UNIVERSIDAD);
			estudiante2 = new Estudiante("Mario","Rossi ddd","00000000D",Curso.UNIVERSIDAD);
		} catch (NombreNoValidoException | ApellidoNoValidoException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
