package sobrescribirMetodos;

/***
   Ejecuta el siguiente c�digo y analiza su resultado. Responde a a las siguientes preguntas: 

   �En qu� consiste sobrescribir m�todos de instancia (no static)?
   Consiste en redefinir m�todos de la clase padre en la clase hija con la misma
   signatura, los mismos parametros, la misma visibilidad o superior y el mismo 
   valor devuelto o subtipo del original.
   
   �Cu�ntos m�todos hay sobrescritos en el c�digo? 
   El toString.
   
   �Puede accederse a un m�todo sobrescrito desde dentro de la clase que lo sobrescribe? �Siempre?
   Se puede acceder a un m�todo sobrescrito utilizando la palabra reservada super.
   
   �Puede accederse a un m�todo sobrescrito desde fuera de la clase que lo sobrescribe?
   No se puede.
   
   �En qu� consiste la ligadura din�mica?�D�nde se aplica en este c�digo?
   La ligadura din�mica permite en tiempo de ejecuci�n decidir qu� implementaci�n se invoca.
   
   �Es recomendable la sobrescritura/redefinici�n/refinamiento de m�todos?
   Si.
   
 * @author lmagarin
 *
 */
public class TestMetodoSobrescrito {

	public static void main(String[] args) {
		A a = new A(1, 2f);
		B b = new B(3, 4f, 'z');

		System.out.println(b.toString());
		System.out.println(((A) b).toString());
	}

}
