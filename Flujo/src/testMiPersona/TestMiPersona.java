package testMiPersona;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class TestMiPersona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Persona persona;
	
	public static void main(String[] args) {

		LocalDate.of(1993, 8, 21);
		persona = new Persona("angelo","barbara", LocalDate.of(1993, 8, 21));
		writeObject();
		readObject();
		System.out.println(persona);
	}

	private static void readObject() {
		try(ObjectInputStream input = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("miPersona.obj")))){
			persona = (Persona) input.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 */
	private static void writeObject() {
		try (ObjectOutputStream output = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("miPersona.obj")))) {
			output.writeObject(persona);
		} catch (FileNotFoundException E) {
			System.out.println("ERROR a!");
		} catch (IOException e) {
			System.out.println("ERROR b!");
		}
	}
}
