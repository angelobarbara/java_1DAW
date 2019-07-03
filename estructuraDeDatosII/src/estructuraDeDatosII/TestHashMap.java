package estructuraDeDatosII;
import java.util.*;
public class TestHashMap{
	public static void main(String[] args){
		HashMap codigos = new HashMap();
		codigos.put("01","Urgente");
		codigos.put("02","Importante");
		codigos.put("03","Normal");
		codigos.put("04","Baja prioridad");
		System.out.println("Aleatorio 03: " + codigos.get("03"));
		System.out.println("Aleatorio 01: " + codigos.get("01"));
	 	Set s = codigos.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			String aux = (String)it.next();
			System.out.println(aux + ": " + codigos.get(aux));
		}
	}
}
