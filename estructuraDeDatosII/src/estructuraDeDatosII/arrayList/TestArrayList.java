/**
 * 
 */
/**
 * @author d17barba
 *
 */
package estructuraDeDatosII.arrayList;


import java.util.*;

public class TestArrayList{
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		System.out.println("arrayList.isEmpty(): "+arrayList.isEmpty());
		
		arrayList.add(1);
		arrayList.add(new String ("hola"));
		arrayList.add(new String ("hola"));
		arrayList.add(new Double (0));
		arrayList.add(new Date());
		
		System.out.println("Tamaño del arrayList: "+arrayList.size());
		System.out.println("arrayList.isEmpty(): "+arrayList.isEmpty());
		System.out.println("arrayList.contains(1): "+arrayList.contains(1));
		System.out.println("arrayList.contains(\"hola\"): "+arrayList.contains("hola"));
		System.out.println("arrayList.contains(\"adios\"): "+arrayList.contains("adios"));
		System.out.println("arrayList.get(arrayList.size()- 1): "+arrayList.get(arrayList.size()-1));
		System.out.println("arrayList.get(0): "+arrayList.get(0));
		System.out.println("arrayList.get(0) instanceof Integer: "+(arrayList.get(0) instanceof Integer));
		for(Iterator iterator = arrayList.iterator();iterator.hasNext();) {
			Object object = iterator.next();
			System.out.println(object +"-");
		}
		System.out.println("\narrayList.indexof(\"hola\"): "+arrayList.indexOf("hola"));
		Object[] array = arrayList.toArray();
		for(Object object : array)
			System.out.println(object +"-");
	}
}