package estructuraDeDatosII;
import java.util.*;
public class TestVector{
	public static void main(String[] args){
	Vector ciudades = new Vector();
	ciudades.add("Madrid");
	ciudades.add("Barcelona");
	ciudades.add("Malaga");
	ciudades.add("Vigo");
	ciudades.add(1,"Sevilla");
	ciudades.add("Madrid"); 
	// Repetido.
	for(int i=ciudades.size()-1; i >=0; i--)
		System.out.println("Ciudad: " + i + " es: " + ciudades.get(i));
	}
}