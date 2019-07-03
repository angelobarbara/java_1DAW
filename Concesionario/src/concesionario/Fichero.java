/**
 * 
 */
package concesionario;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Fichero {
	
	public static Concesionario abrir(File file) throws ClassNotFoundException, IOException {
		file = comprobarExtension(file);
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(file)))) {
			return (Concesionario) in.readObject();
		}
	}
	
	public static void guardar(File file, Concesionario concesionario) throws IOException {
		file = comprobarExtension(file);
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(file, false)))) {
			out.writeObject(concesionario);
		}
	}
	
	public static boolean exist(File file) {
		file = comprobarExtension(file);
		return file.exists();
	}
	
	static File comprobarExtension(File file) {
		String path = file.getPath();
        if (!path.endsWith(".obj"))
            return new File(path + ".obj");
        return file;
	}

}