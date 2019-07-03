/**
 * 
 */
package hospital;

/**
 * @author d17barba
 *
 */
public enum Cama {
	A, B, C, D;
	
	public static String[] menuCamas() {
		String[] camas = new String[Cama.values().length];
		int contador = 0;
		for(Cama cama : Cama.values())
			camas[contador++] = cama.toString();
		return camas;
	}
}
