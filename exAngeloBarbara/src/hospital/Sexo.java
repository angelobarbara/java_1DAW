/**
 * 
 */
package hospital;

/**
 * @author d17barba
 *
 */
public enum Sexo {
	HOMBRE, MUJER;
	
	public static String[] menuSexo() {
		String[] opciones = new String[Sexo.values().length];
		int contador = 0;
		for(Sexo sexo : Sexo.values())
			opciones[contador++] = sexo.toString();
		return opciones;
	}
}
