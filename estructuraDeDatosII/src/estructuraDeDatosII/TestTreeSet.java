package estructuraDeDatosII;
import java.util.*;
public class TestTreeSet{
	public static void main(String[] args){
	TreeSet ciudades = new TreeSet();
	ciudades.add("Madrid");
	ciudades.add("Barcelona");
	ciudades.add("Malaga");
	ciudades.add("Vigo");
	ciudades.add("Sevilla");
	ciudades.add("Madrid"); 
// Repetido.
	Iterator it = ciudades.iterator();
	while(it.hasNext())
		System.out.println("Ciudad: " + it.next());
	}
}
